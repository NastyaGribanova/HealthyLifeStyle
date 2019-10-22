import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class UserBL {

    UserDAO userDAO = new UserDAO();
    HashPassword hashPassword = new HashPassword();

    public UserBL() throws SQLException {
    }

    //Проверка на существование кук
    public boolean checkCookie(Cookie[] cookies){
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                return true;
            }
        }
        return false;
    }

    //метод doPost на странице авторизации
    void login (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NoSuchAlgorithmException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session = request.getSession(true);

        //проверка логина и пароля на совместимость с бд
        if (userDAO.isExist(login, hashPassword.getHash(password))){
            session.setAttribute("login", login);
            session.setAttribute("password", hashPassword.getHash(password));
            //Создание кук
            if (request.getParameter("save") != null) {
                Cookie loginCookie = new Cookie("login", "true");
                loginCookie.setMaxAge(2592000);
                response.addCookie(loginCookie);
            }
            //при нажатии на кнопку авторизоваться отправляет на страницу профиля
            response.sendRedirect("/profile");
        } else {
            //что-то делается, если он еще не зарегистрировался
            response.sendRedirect("/register");
        }
    }

    //метод doPost для страницы регистрации
    void register (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, NoSuchAlgorithmException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = new User(login, hashPassword.getHash(password));
        if (userDAO.create(user)){
            //при нажатии на кнопку регистрации отправляет на страницу авторизации
            response.sendRedirect("/loginPage");
        } else {
            //что-то делается если он уже зарегистрирован
            response.sendRedirect("/loginPage");
        }
    }
}
