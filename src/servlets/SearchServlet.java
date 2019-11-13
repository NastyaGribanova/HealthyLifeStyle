package servlets;

import businessLogic.SearchBL;
import models.Exercise;
import org.json.JSONObject;
import userInterface.SearchUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/dosearch")
public class SearchServlet extends HttpServlet {

    SearchUI businessLogic = new SearchUI();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        businessLogic.doSearch(request, response);
    }
}
