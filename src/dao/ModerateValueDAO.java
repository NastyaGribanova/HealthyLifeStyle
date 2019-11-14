package dao;

import models.Exercise;
import models.ModerateValue;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModerateValueDAO {

    private Connection connection;
    private ExerciseDAO exerciseDAO;

    public void create(ModerateValue moderateValue) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO moderate_value (sex, min_age, max_age, " +
                    "min_blood_pressure_sys, max_blood_pressure_sys, min_blood_pressure_dia, max_blood_pressure_dia, " +
                    "sleep_duration, activity_id, " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, moderateValue.getSex());
            statement.setInt(2, moderateValue.getMinAge());
            statement.setInt(3, moderateValue.getMaxAge());
            statement.setInt(4, moderateValue.getMinSYS());
            statement.setInt(5, moderateValue.getMaxSYS());
            statement.setInt(6, moderateValue.getMinDIA());
            statement.setInt(7, moderateValue.getMaxDIA());
            statement.setInt(8, moderateValue.getSleep());
            statement.setInt(9, moderateValue.getExercise().getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public ModerateValue findByID(int id){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM moderate_value WHERE activity_id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                ModerateValue moderateValue = new ModerateValue();
                moderateValue.setSex(resultSet.getString("sex"));
                moderateValue.setMinAge(resultSet.getInt("min_age"));
                moderateValue.setMaxAge(resultSet.getInt("max_age"));
                moderateValue.setMinSYS(resultSet.getInt("min_blood_pressure_sys"));
                moderateValue.setMaxSYS(resultSet.getInt("max_blood_pressure_sys"));
                moderateValue.setMinDIA(resultSet.getInt("min_blood_pressure_dia"));
                moderateValue.setMaxDIA(resultSet.getInt("max_blood_pressure_dia"));
                moderateValue.setSleep(resultSet.getInt("sleep_duration"));
                return moderateValue;
            } else return null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    public List<ModerateValue> readAll(){
        connection = DataBase.getInstance().getConnection();
        List<ModerateValue> moderateValues = new ArrayList<>();
        String sqlQquery = "SELECT * FROM moderate_value";
        try (PreparedStatement ps = connection.prepareStatement(sqlQquery)){
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    ModerateValue moderateValue = new ModerateValue();
                    moderateValue.setSex(resultSet.getString("sex"));
                    moderateValue.setMinAge(resultSet.getInt("min_age"));
                    moderateValue.setMaxAge(resultSet.getInt("max_age"));
                    moderateValue.setMinSYS(resultSet.getInt("min_blood_pressure_sys"));
                    moderateValue.setMaxSYS(resultSet.getInt("max_blood_pressure_sys"));
                    moderateValue.setMinDIA(resultSet.getInt("min_blood_pressure_dia"));
                    moderateValue.setMaxDIA(resultSet.getInt("max_blood_pressure_dia"));
                    moderateValue.setSleep(resultSet.getInt("sleep_duration"));
                    moderateValue.setExercise(exerciseDAO.findByID(resultSet.getInt("activity_id")));
                    moderateValues.add(moderateValue);
                }
            }catch (SQLException e){
                throw new IllegalArgumentException(e);
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return moderateValues;
    }
}
