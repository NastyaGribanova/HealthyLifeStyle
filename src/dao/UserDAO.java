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
        connection = DataBase.getInstance().getConnection();
        String sqlQuery = "INSERT INTO user (login, password, email, permission_id)" +
                "VALUES (?,?,?,?)";
        try (PreparedStatement ps = connection.prepareStatement(sqlQuery)){
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setInt(4, role);
            if (!isExist(user.getLogin())) {
                ps.executeUpdate();
                return read(user.getLogin());
            } else return null;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public User read(String login) {
        connection = DataBase.getInstance().getConnection();
        String sqlQuery = "SELECT * FROM user WHERE login = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlQuery)) {
            ps.setString(1, login);
            try (ResultSet resultSet = ps.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User(resultSet.getString("login"),
                                         resultSet.getString("password"),
                                         resultSet.getString("email"));
                    user.setPermissionId(resultSet.getInt("permission_id"));
                    user.setId(resultSet.getInt("id"));
                    return user;
                } else return null;
            } catch (SQLException e) {
                e.printStackTrace();
                throw new IllegalArgumentException(e);
            }
        } catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public User update(User user) {
        connection = DataBase.getInstance().getConnection();
        String sqlQuery = "UPDATE user SET login = ?, password = ?, email = ?, permission_id = ?" +
                                            "WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlQuery)){
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setInt(4, user.getPermissionId());
            ps.setInt(5, user.getId());
            ps.executeUpdate();
            return read(user.getLogin());
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void delete() {

    }

    //проверка на существование логина в бд
    public boolean isExist(String login) {
        connection = DataBase.getInstance().getConnection();
        String sqlQuery = "SELECT * FROM user WHERE login = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlQuery)){
            ps.setString(1, login);
            if (ps.executeQuery().next()) {
                return true;
            } else return false;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    public User isExist(String login, String password) {
        connection = DataBase.getInstance().getConnection();
        String sqlQuery = "SELECT * FROM user WHERE login = ? AND password = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlQuery)) {
            ps.setString(1, login);
            ps.setString(2, password);
            try (ResultSet resultSet = ps.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User(resultSet.getString("login"),
                                         resultSet.getString("password"));
                    user.setId(resultSet.getInt("id"));
                    user.setPermissionId(resultSet.getInt("permission_id"));
                    user.setEmail(resultSet.getString("email"));
                    return user;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
}
