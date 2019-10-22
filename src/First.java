import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;


/*
    Первая страничка, которая встречает пользователя
 */

public class First extends javax.servlet.http.HttpServlet {

    UserBL businessLogic = new UserBL();

    public First() throws SQLException {
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        //при нажатии на кнопку отправляй на страницу авторизации
        response.sendRedirect("/loginPage");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //если авторизация есть, отправляй в личный кабинет
        if(request.getSession(false) != null) {
            response.sendRedirect("/loginPage");
        } else if (businessLogic.checkCookie(request.getCookies())){
            response.sendRedirect("/profile");
        } else {
            request.getRequestDispatcher("firstPage.jsp").forward(request, response);
        }
    }
}
