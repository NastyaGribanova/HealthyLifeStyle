package dao;

import models.Comment;
import util.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentDAO {

    private Connection connection;

    public void create(Comment comment) {
        PreparedStatement statement;
        connection = DataBase.getInstance().getConnection();
        try {
            statement = connection.prepareStatement("INSERT INTO comment (user_id, description, date)" +
                    "VALUES (?, ?, ?)");
            statement.setInt(1, comment.getUserId());
            statement.setString(2, comment.getDescription());
            statement.setDate(3, comment.getDate());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<Comment> readAll(){
        connection = DataBase.getInstance().getConnection();
        List<Comment> comments = new ArrayList<>();
        String sqlQquery = "SELECT * FROM comment";
        try (PreparedStatement ps = connection.prepareStatement(sqlQquery)){
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    Comment comment = new Comment();
                    comment.setUserId(resultSet.getInt("user_id"));
                    comment.setDescription(resultSet.getString("description"));
                    comment.setDate(resultSet.getDate("date"));
                    comments.add(comment);
                }
            }catch (SQLException e){
                throw new IllegalArgumentException(e);
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return comments;
    }
}
