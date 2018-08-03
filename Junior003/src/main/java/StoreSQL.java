import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class StoreSQl {
   private Connection co;
    private static final Logger Log = LoggerFactory.getLogger(StoreSQl.class);



    Connection open() {
            try {
                Class.forName("org.sqlite.JDBC");
                co = DriverManager.getConnection(
                        "jdbc:sqlite:users.db"
                );
                System.out.println("Connected");


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        return co;
    }

        void insert(int n) throws SQLException {
        try {
            for (int i = 1; i <= n; i++) {
                String query = "INSERT INTO entry (field)" +
                        " VALUES ('" + i + "')";
                Statement st = co.createStatement();
                st.executeUpdate(query);
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
     int[] output(int n) throws SQLException {
         int[] res = new int[n];
         int i = 0;
        try {
                PreparedStatement st = co.prepareStatement("select * from entry");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                        res[i] = rs.getInt(1);
                        i++;

                  /*  if (res != null) {
                        result.add(res);
                        res = "";
                    } */
                }
                st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  res;
    }
        void close() {
            try {
                co.close();
                System.out.println("Closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    public boolean isEmpty() {
        boolean result = false;
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery("select * from entry");
        } catch (Exception e) {
            result = true;
        }
        return result;
    }
    public void newSql() {
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery("create table entry (\n" +
                    "field int \n" +
                    ");");
            st.close();
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
    }
    public void cleanDB() {
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery("delete from entry where field > 0");
            st.close();
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }

    }






    }

