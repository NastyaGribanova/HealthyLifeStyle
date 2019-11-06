package services;

import dao.UserDAO;
import models.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class UserBL {

    private UserDAO userDAO = new UserDAO();

    //Проверка на существование кук
    public boolean checkCookie(Cookie[] cookies) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                return true;
            }
        }
        return false;
    }

    //метод doPost на странице авторизации
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, NoSuchAlgorithmException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        //проверка логина и пароля на совместимость с бд
        if (userDAO.isExist(login, getHash(password))) {
            session.setAttribute("login", login);
            session.setAttribute("password", getHash(password));
            //Создание кук
            if (request.getParameter("save") != null) {
                Cookie loginCookie = new Cookie("login", "true");
                loginCookie.setMaxAge(7200);
                response.addCookie(loginCookie);
            }
            //при нажатии на кнопку авторизоваться отправляет на страницу профиля
            response.sendRedirect("/profile");
        } else {
            request.setAttribute("isRegistrated", "true");
            //если он еще не зарегистрировался (возможно не нужно отправлять куда-то)
            response.sendRedirect("/registration");
        }
    }

    //метод doPost для страницы регистрации
    public void register(HttpServletRequest request, HttpServletResponse response) throws IOException, NoSuchAlgorithmException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String repeatPassword = request.getParameter("password2");
        if (password.length() > 6) {
            if (password.equals(repeatPassword)) {
                if (!userDAO.isExist(login)) {
                    User user = new User(login, getHash(password));
                    if (userDAO.create(user)) {
                        //при нажатии на кнопку регистрации отправляет на страницу авторизации
                        response.sendRedirect("/login");
                    } else {
                        //если уже зарегистрирован
                        response.sendRedirect("/login");
                    }
                } else {
                    response.sendRedirect("/registration");
                }
            } else {
                response.sendRedirect("/registration");
            }
        }
    }

    public void profile(HttpServletRequest request, HttpServletResponse response) throws IOException, NoSuchAlgorithmException{
        //отправляем на страничку изменения данных
        if (request.getAttribute("change") != null){
            response.sendRedirect("/changeValues");
        } else if (request.getAttribute("logout") != null){
            request.getSession().setAttribute("login", null);
            request.getSession().setAttribute("password", null);
            response.sendRedirect("/login");
        }
    }

    private String getHash(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(str.getBytes("utf-8"));
        String s2 = new BigInteger(1, m.digest()).toString(16);
        StringBuilder sb = new StringBuilder(32);
        for (int i = 0, count = 32 - s2.length(); i < count; i++) {
            sb.append("0");
        }
        return sb.append(s2).toString();
    }
}
