package schedule;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by Роман on 23.12.2016.
 */
public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    private Connection connection;

    public DBWorker(){

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (SQLException e) {
            e.printStackTrace();
        }
     }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
