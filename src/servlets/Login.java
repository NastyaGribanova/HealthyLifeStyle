package servlets;

import services.UserBL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

/*
    Страничка логина
 */
@WebServlet("/login")
public class Login extends HttpServlet {

    private UserBL businessLogic = new UserBL();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            businessLogic.login(request, response);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("login") != null) {
            response.sendRedirect("/profile");
        } else {
            request.getRequestDispatcher("jsp/loginPage.jsp").forward(request, response);
        }
    }
}
