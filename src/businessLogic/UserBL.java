package businessLogic;

import dao.DailyInformationDAO;
import dao.StatsDAO;
import dao.UserDAO;
import models.DailyInformation;
import models.User;
import models.UserStats;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserBL {

    private UserDAO userDAO = new UserDAO();
    private StatsDAO statsDAO = new StatsDAO();
    private DailyInformationDAO dailyInformationDAO = new DailyInformationDAO();

    public boolean checkPassword(String password1, String password2){
        if ((password1.length() > 6)&&(password1.equals(password2))){
            return true;
        } else return false;
    }

    public boolean register(String login, String password, String repeatPassword, int role) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (checkPassword(password, repeatPassword)){
            if (!userDAO.isExist(login)) {
                User user = new User(login, getHash(password));
                User createdUser = userDAO.create(user, role);
                if (createdUser != null) {
                    UserStats userStats = new UserStats();
                    userStats.setUserID(createdUser.getId());
                    DailyInformation dailyInformation = new DailyInformation();
                    dailyInformation.setUserID(user.getId());
                    statsDAO.create(userStats);
                    dailyInformationDAO.create(dailyInformation);
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

    public User login(String login, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userDAO.isExist(login, getHash(password)) ;
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
