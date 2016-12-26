package schedule;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "select * from users";
        try {
            Statement statement = worker.getConnection().createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                User user = new User();
              int id = resultSet.getInt(1);
                System.out.println(id);
               user.setUsername(resultSet.getString(2));
               user.setPassword(resultSet.getString(3));

               System.out.println(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

