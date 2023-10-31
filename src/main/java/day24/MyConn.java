package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error !");
            e.printStackTrace();
        }
        System.out.println("Connection Succeed");


        return conn;
    }
}
