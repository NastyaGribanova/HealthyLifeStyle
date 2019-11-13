package userInterface;

import businessLogic.CommentBL;
import models.Comment;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.List;

public class CommentUI {

    CommentBL businessLogic = new CommentBL();

    public void comment(HttpServletRequest request, HttpServletResponse response){
        String description = request.getParameter("comment");
        User user = ((User)(request.getSession().getAttribute("user")));
        Date date = new Date((new java.util.Date()).getTime());

        Comment comment = new Comment();
        comment.setDescription(description);
        comment.setUser(user);
        comment.setDate(date);

        businessLogic.comment(comment);

        request.setAttribute("comments", businessLogic.readComments());
    }

    public void showComments (HttpServletRequest request){
        request.setAttribute("comments", businessLogic.readComments());
    }
}
