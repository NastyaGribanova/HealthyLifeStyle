package dao;

import models.User;
import util.DataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO implements UserCrudDAO {

    private final Connection connection = new DataBase().getConnection();

    @Override
    public boolean create(User user) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            if (!isExist(user.getLogin(), user.getPassword())) {
                try {
                    statement.executeUpdate("INSERT INTO user (login, password)" +
                            "VALUES ('" + user.getLogin() + "','" + user.getPassword() + "')");
                } catch (SQLException e) {
                    System.out.println("Exception during method saveLogin");
                    throw new IllegalArgumentException();
                }
                return true;
            } else return false;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
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

    //проверка на существование логина и пароля в бд
    public boolean isExist(String login, String password) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            if (statement.executeQuery("SELECT * FROM user WHERE login = " + login +
                    " AND password = " + password + "''").next()) {
                return true;
            } else return false;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
}
