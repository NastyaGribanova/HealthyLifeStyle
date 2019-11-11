package userInterface;

import businessLogic.UserBL;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class UserUI {

    private UserBL userBl = new UserBL();

    //Проверка на существование кук
    public boolean checkCookie(Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login")) {
                    return true;
                }
            }
        }   return false;
    }

    //метод doPost на странице авторизации
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, NoSuchAlgorithmException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        //проверка логина и пароля на совместимость с бд
        boolean successful = userBl.login(login, password);
        if (successful) {
            session.setAttribute("login", login);
            session.setAttribute("password", userBl.getHash(password));
            //Создание кук
            if (request.getParameter("save") != null) {
                Cookie loginCookie = new Cookie("login", login);
                loginCookie.setMaxAge(7200);
                response.addCookie(loginCookie);
            }
            //при нажатии на кнопку авторизоваться отправляет на страницу профиля
            response.sendRedirect("/profile");
        } else {
            //если он еще не зарегистрировался
            response.sendRedirect("/registration");
        }
    }

    //метод doPost для страницы регистрации
    public void register(HttpServletRequest request, HttpServletResponse response) throws IOException, NoSuchAlgorithmException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String repeatPassword = request.getParameter("password2");
        boolean successful = userBl.register(login, password, repeatPassword);
        if (successful){
            response.sendRedirect("/login");
        }else response.sendRedirect("/registration");
    }

    //метод doPost для страницы профиля
    public void profile(HttpServletRequest request, HttpServletResponse response) throws IOException, NoSuchAlgorithmException{
            //выходим из профиля

        //изменение данных сна и давления
    }


}
