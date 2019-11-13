package servlets;

import userInterface.UserUI;

import java.io.IOException;

/*
    Первая страничка, которая встречает пользователя
 */

public class First extends javax.servlet.http.HttpServlet {

    private UserUI businessLogic = new UserUI();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        //при нажатии на кнопку отправляй на страницу авторизации
        response.sendRedirect("/login");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //если авторизация есть, отправляй в личный кабинет
        if (request.getSession(false) != null) {
            response.sendRedirect("/login");
        } else if (businessLogic.checkCookie(request.getCookies())) {
            response.sendRedirect("/profile");
        } else {
            request.getRequestDispatcher("jsp/firstPage.jsp").forward(request, response);
        }
    }
}
