package servlets;

import userInterface.StatsUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/changeValues")
public class ChangeValue extends HttpServlet {

    private StatsUI businessLogic = new StatsUI();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        businessLogic.changeValues(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/changePage.jsp").forward(request, response);
    }
}
