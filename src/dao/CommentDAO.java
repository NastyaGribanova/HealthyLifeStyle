package dao;

import models.Comment;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommentDAO {

    private Connection connection;

    public void create(Comment comment) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO comment (user_id, description, date)" +
                    "VALUES (?, ?, ?)");
            statement.setInt(1, comment.getUser_id());
            statement.setString(2, comment.getDescription());
            statement.setString(3, comment.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
