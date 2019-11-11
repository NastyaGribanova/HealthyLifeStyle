package dao;

import models.DailyInformation;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DailyInformationDAO {

    private Connection connection;

    public void create(DailyInformation dailyInformation){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO daily_information (user_id)" +
                    "VALUES (?)");
            statement.setInt(1, dailyInformation.getUserID());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            //DataBase.getInstance().closeConnection();
        }
    }

    public void update(DailyInformation dailyInformation){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("UPDATE daily_information SET sleep_id = ?, pressure_id = ? " +
                    "WHERE user_id = ?");
            statement.setInt(1, dailyInformation.getSleep());
            statement.setInt(2, dailyInformation.getPressure());
            statement.setInt(3, dailyInformation.getUserID());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            //DataBase.getInstance().closeConnection();
        }
    }

    public DailyInformation findByID(int id){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM daily_information WHERE user_id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                DailyInformation dailyInformation = new DailyInformation();
                dailyInformation.setSleep(resultSet.getInt("sleep"));
                dailyInformation.setPressure(resultSet.getInt("pressure"));
                return dailyInformation;
            } else return null;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }

    }
}
