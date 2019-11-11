package businessLogic;

import dao.StatsDAO;
import dao.UserDAO;
import models.User;
import models.UserStats;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserBL {

    private UserDAO userDAO = new UserDAO();
    private StatsDAO statsDAO = new StatsDAO();

    public boolean checkPassword(String password1, String password2){
        if ((password1.length() > 6)&&(password1.equals(password2))){
            return true;
        } else return false;
    }

    public boolean register(String login, String password, String repeatPassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (checkPassword(password, repeatPassword)){
            if (!userDAO.isExist(login)) {
                User user = new User(login, getHash(password));
                if (userDAO.create(user) != null) {
                    UserStats userStats = new UserStats();
                    userStats.setUserID(user.getId());
                    statsDAO.create(userStats);
                    //при нажатии на кнопку регистрации отправляет на страницу авторизации
                    return true;
                } else {
                    //если уже зарегистрирован
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean login(String login, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (userDAO.isExist(login, getHash(password))){
            return true;
        } else return false;
    }

    public String getHash(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
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
