package servlets;

import userInterface.UserUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {

    UserUI businessLogic = new UserUI();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        businessLogic.logout(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
