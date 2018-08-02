package ru.job4j.aplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class SQLConnect implements AutoCloseable {
    private static final Logger Log = LoggerFactory.getLogger(SQLConnect.class);
    Connection conn = null;

    public  Connection connect() {
        String url = "jdbc:postgresql://localhost:5432/java_a_from_z";
        String username = "postgres";
        String password = "password";
        try {
          conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
        return conn;
    }

    public void close() {
        try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    Log.error(e.getMessage(), e);
                }
            }
        }
    }

    public boolean isEmpty(Connection con) {
        boolean result = false;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from tracker");
        } catch (Exception e) {
            result = true;
        }
        return result;
    }
    public void newSql(Connection con) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("create table tracker (\n" +
                    "id serial primary key,\n" +
                    "\tname varchar(200),\n" +
                    "\tDescrip varchar(200),\n" +
                    "\tcreated timestamp,\n" +
                    "\tcomments text\n" +
                    "\t\n" +
                    ");");
            st.close();
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
    }

}
