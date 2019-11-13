package servlets;

import userInterface.AddExercisesUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addExercises")
public class AddExercises extends HttpServlet {

    private AddExercisesUI businessLogic = new AddExercisesUI();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/adminPage.jsp").forward(request, response);
    }
}
