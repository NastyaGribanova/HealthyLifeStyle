import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

/*
    Страничка логина
 */
@WebServlet(name = "LoginPage")
public class LoginPage extends HttpServlet {

    UserBL businessLogic = new UserBL();

    public LoginPage() throws SQLException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            businessLogic.login(request, response);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/loginPage.jsp").forward(request, response);
    }
}
