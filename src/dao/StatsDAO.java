package dao;

import models.User;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatsDAO {

    private Connection connection;

    public void create(String value) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO sleep (sleep_duration)" +
                    "VALUES (?,?)");
            statement.setString(1, value);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            //DataBase.getInstance().closeConnection();
        }
    }
}
