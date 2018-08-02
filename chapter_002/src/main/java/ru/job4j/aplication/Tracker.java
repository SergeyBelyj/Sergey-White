package ru.job4j.aplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Tracker {

    private List<Item> items = new ArrayList<Item>();
    private int position = 0;
    private static final Logger Log = LoggerFactory.getLogger(SQLConnect.class);
    private Connection conn;

    public Tracker(Connection connection) {
        this.conn = connection;
    }

    public Item add(Item  item){
        try {
            PreparedStatement st = conn.prepareStatement("insert into tracker(name, Descrip, created) values (?, ?, ?)");
            st.setString(1, item.getName());
            st.setString(2, item.getDesc());
            st.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
        return item;
    }

    public void edit(Item fresh)  {
        try {
            PreparedStatement st = conn.prepareStatement("update tracker set name=?, Descrip=?, created=? where id=? ");
            st.setString(1, fresh.getName());
            st.setString(2, fresh.getDesc());
            st.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            st.setInt(4, Integer.parseInt(fresh.getId()));
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }

        }


    public String generateId() {
        return Math.random() + "" + Calendar.getInstance().getTimeInMillis();
    }

    public void replace(String id, Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                item.setId(this.items.get(i).getId());
                this.items.set(i, item);
                break;
            }
        }
    }

    public List<String> findByName(String key) {
        List<String> result = new ArrayList<String>();
        String res = new String();
        try {
            PreparedStatement st = conn.prepareStatement("select * from tracker where name = ?");
            st.setString(1,key);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                for (int i = 1; i < 5; i++) {
                    res = res + " " + (rs.getString(i));
                }
                if (res != null) {
                    result.add(res);
                    res = "";
                }
            }
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
    return result;
    }

    public String findById(String id) {
        String res = new String();
        try {
            PreparedStatement st = conn.prepareStatement("select * from tracker where id = ?");
            st.setInt(1, Integer.parseInt(id));
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                for (int i = 1; i < 5; i++) {
                    res = res + " " + (rs.getString(i));
                }
            }

        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
        return res;
    }

    public List<String> findAll() {
       List<String> result = new ArrayList<String>();
        String res = new String();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from tracker");
            while (rs.next()) {
                for (int i = 1; i < 5; i++) {
                    res = res + " " + (rs.getString(i));
                }
                if (res != null) {
                    result.add(res);
                    res = "";
                }
            }
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
        return result;
    }

    public void delete(String id) {
        try {
            PreparedStatement st = conn.prepareStatement("delete from tracker where id=?");
            st.setInt(1, Integer.parseInt(id));
            st.executeUpdate();
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
    }


}