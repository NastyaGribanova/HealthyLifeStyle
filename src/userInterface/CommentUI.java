package userInterface;

import businessLogic.CommentBL;
import models.Comment;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;

public class CommentUI {

    CommentBL businessLogic = new CommentBL();

    public void comment(HttpServletRequest request, HttpServletResponse response){
        String description = request.getParameter("comment");
        int id = ((User)(request.getSession().getAttribute("user"))).getId();
        Date date = new Date((new java.util.Date()).getTime());

        Comment comment = new Comment();
        comment.setDescription(description);
        comment.setUserId(id);
        comment.setDate(date);

        businessLogic.comment(comment);


    }
}
