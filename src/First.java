import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/*
    Первая страничка, которая встречает пользователя
 */

public class First extends javax.servlet.http.HttpServlet {

    BL businessLogic = new BL();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        //при нажатии на кнопку отправляй на страницу авторизации
        response.sendRedirect("/loginPage");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        //если авторизация есть, отправляй в личный кабинет
        if(request.getSession(false) != null) {
            response.sendRedirect("/profile");
        } else if (businessLogic.checkCookie(request.getCookies())){
            response.sendRedirect("/profile");
        }

        request.getRequestDispatcher("firstPage.jsp").forward(request, response);
    }
}
