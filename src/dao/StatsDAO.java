package dao;

import models.Sex;
import models.User;
import models.UserStats;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatsDAO {

    private Connection connection;

    public void create(UserStats userStats) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO user_stat (user_id)" +
                    "VALUES (?)");
            statement.setInt(1, userStats.getUserID());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            //DataBase.getInstance().closeConnection();
        }
    }

    public void update(UserStats userStats){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("UPDATE user_stat SET age = ?, sex = ?, weight = ?, height = ?  " +
                    "WHERE user_id = ?");
            statement.setInt(1, userStats.getAge());
            statement.setString(2, userStats.getSex().name());
            statement.setInt(3, userStats.getWeight());
            statement.setInt(4, userStats.getHeight());
            statement.setInt(5, userStats.getUserID());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            //DataBase.getInstance().closeConnection();
        }
    }

    public UserStats findByID(int id){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM user_stat WHERE user_id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                UserStats userStats = new UserStats();
                userStats.setAge(resultSet.getInt("age"));
                userStats.setWeight(resultSet.getInt("weight"));
                userStats.setHeight(resultSet.getInt("height"));
                userStats.setSex(resultSet.getString("sex").equals(Sex.MALE.name()) ? Sex.MALE : Sex.FEMALE );
                return userStats;
            } else return null;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }

    }
}
