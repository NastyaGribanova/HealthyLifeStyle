package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class Logout extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getSession().setAttribute("login", null);
            request.getSession().setAttribute("password", null);
            Cookie loginCookie = new Cookie("login", "false");
            loginCookie.setMaxAge(0);
            response.addCookie(loginCookie);
            response.sendRedirect("/healthyLifeStyle");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
