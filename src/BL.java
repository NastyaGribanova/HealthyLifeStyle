import javax.servlet.http.Cookie;

public class BL {

    //Проверка на существование кук
    public boolean checkCookie(Cookie[] cookies){
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                return true;
            }
        }
        return false;
    }
}
