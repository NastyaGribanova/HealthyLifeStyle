package dao;

import models.Exercise;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExerciseDAO {

    private Connection connection;

    public void create(Exercise exercise) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO activity (name, description)" +
                    "VALUES (?, ?)");
            statement.setString(1, exercise.getName());
            statement.setString(2, exercise.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public Exercise findByID(int id){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM activity WHERE id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Exercise exercise = new Exercise();
                exercise.setName(resultSet.getString("name"));
                exercise.setDescription(resultSet.getString("description"));
                return exercise;
            } else return null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    public Exercise findByName(String name){
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM activity WHERE name = ?");
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Exercise exercise = new Exercise();
                exercise.setId(resultSet.getInt("id"));
                exercise.setName(resultSet.getString("name"));
                exercise.setDescription(resultSet.getString("description"));
                return exercise;
            } else return null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    public List<Exercise> readAll(){
        connection = DataBase.getInstance().getConnection();
        List<Exercise> exercises = new ArrayList<>();
        String sqlQquery = "SELECT * FROM activity";
        try (PreparedStatement ps = connection.prepareStatement(sqlQquery)){
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    Exercise exercise = new Exercise();
                    exercise.setName(resultSet.getString("name"));
                    exercise.setDescription(resultSet.getString("description"));
                    exercises.add(exercise);
                }
            }catch (SQLException e){
                throw new IllegalArgumentException(e);
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return exercises;
    }

    public List<Exercise> findByQuery(String query) {
        List<Exercise> exercises = new ArrayList<Exercise>();
        connection = DataBase.getInstance().getConnection();
        String sqlQquery = "SELECT * FROM activity WHERE name like ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlQquery)) {
            ps.setString(1, "%" + query + "%");
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    Exercise exercise = new Exercise();
                    exercise.setId(resultSet.getInt("id"));
                    exercise.setName(resultSet.getString("name"));
                    exercise.setDescription(resultSet.getString("description"));
                    exercises.add(exercise);
                }
            } catch (SQLException e) {
                throw new IllegalStateException();
            }
        } catch (SQLException e) {
            throw new IllegalStateException();
        }
        return exercises;
    }
}
