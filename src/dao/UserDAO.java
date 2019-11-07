package dao;

import models.User;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO implements UserCrudDAO {

    private Connection connection;

    @Override
    public boolean create(User user) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO user (login, password)" +
                    "VALUES (?,?)");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            if (!isExist(user.getLogin())) {
                try {
                    statement.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("Exception during method saveLogin");
                    throw new IllegalArgumentException();
                }
                return true;
            } else return false;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            //DataBase.getInstance().closeConnection();
        }
    }

    @Override
    public void read() {

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

    public boolean isExist(String login, String password) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("SELECT * FROM user WHERE login = ? AND password = ?");
            statement.setString(1, login);
            statement.setString(2, password);
            if (statement.executeQuery().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
}
