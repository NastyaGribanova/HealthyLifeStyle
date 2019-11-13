package servlets;

import userInterface.ModerateValueUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/showExercises")
public class ShowExercises extends HttpServlet {

    private ModerateValueUI businessLogic = new ModerateValueUI();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        businessLogic.showAll(request);
        request.getRequestDispatcher("jsp/exercisesPage.jsp").forward(request, response);
    }
}
