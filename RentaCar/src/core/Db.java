package core;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Db {
    // singleton Design Pattern
    private static Db instance = null; // ***************************************
    private Connection connection = null;
    public static final String DB_URL = "jdbc:mysql://localhost/rental_car";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";
//    connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    private Db() {
        try {
            this.connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static Connection getInstance() { // ***************************************
        try {
            if (instance == null || instance.getConnection().isClosed()) {
                instance = new Db();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return instance.getConnection();
    }
}
