package belyj.servlets.Persistent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class SqlConn {
    private Connection co;
    Connection open() {
        try {
            co = DriverManager.getConnection(
                    "jdbc:sqlite:Junior004/src/main/java/resources/users.db"
            );
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return co;
    }

    void close() {
        try {
            co.close();
            System.out.println("Closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
