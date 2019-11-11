package dao;

import models.User;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO implements UserCrudDAO {

    private Connection connection;

    @Override
    public User create(User user, int role) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO user (login, password, permission_id)" +
                    "VALUES (?,?,?)");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            statement.setInt(3, role);
            if (!isExist(user.getLogin())) {
                try {
                    statement.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("Exception during method saveLogin");
                    throw new IllegalArgumentException();
                }
                return read(user.getLogin());
            } else return null;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            //DataBase.getInstance().closeConnection();
        }
    }

    @Override
    public User read(String login) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM user WHERE login = ?");
            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                User user = new User(resultSet.getString("login"), resultSet.getString("password"));
                user.setPermissionId(resultSet.getInt("permission_id"));
                user.setId(resultSet.getInt("id"));
                return user;
            } else return null;
        } catch (SQLException e) {
            throw new IllegalArgumentException();
        }
    }

        @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    //проверка на существование логина в бд
    public boolean isExist(String login) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM user WHERE login = ?");
            statement.setString(1, login);
            if (statement.executeQuery().next()) {
                return true;
            } else return false;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    public User isExist(String login, String password) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM user WHERE login = ? AND password = ?");
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                User user = new User(resultSet.getString("login"), resultSet.getString("password"));
                user.setId(resultSet.getInt("id"));
                return user;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
}
