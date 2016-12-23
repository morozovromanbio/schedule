package schedule;


import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by Роман on 23.12.2016.
 */
public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";



    public static void main(String[] args){
        Connection connection;



        try {

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
if (!connection.isClosed()){
    System.out.print("Connecting with db install");
}
        }catch (SQLException e) {
            System.err.print("Class driver don't download");

    }
}
}
