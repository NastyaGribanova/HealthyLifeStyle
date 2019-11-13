package businessLogic;

import dao.CommentDAO;
import models.Comment;

import java.util.List;

public class CommentBL {

    CommentDAO commentDAO = new CommentDAO();

    public void comment(Comment comment){
        commentDAO.create(comment);
    }

    public List<Comment> readComments(){
        return commentDAO.readAll();
    }

}
