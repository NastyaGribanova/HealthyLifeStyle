package businessLogic;

import dao.StatsDAO;
import models.UserStats;

public class StatsBL {

    StatsDAO dao = new StatsDAO();

    public void updateStats(UserStats userStats){
        UserStats foundUserStats = dao.findByID(userStats.getUserID());
        UserStats newUserStats = new UserStats();
        if (foundUserStats != null){
            if (userStats.getAge() == null){
                newUserStats.setAge(foundUserStats.getAge());
            } else {
                newUserStats.setAge(userStats.getAge());
            }
            //для пола
            if (userStats.getAge() == null){
                newUserStats.setAge(foundUserStats.getAge());
            } else {
                newUserStats.setAge(userStats.getAge());
            }
        }
    }
}
