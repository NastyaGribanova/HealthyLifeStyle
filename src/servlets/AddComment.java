package servlets;

import userInterface.CommentUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addComment")
public class AddComment extends HttpServlet {

    CommentUI businessLogic = new CommentUI();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        businessLogic.comment(request, response);
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        businessLogic.showComments(request);
        request.getRequestDispatcher("jsp/commentsPage.jsp").forward(request, response);
    }
}
