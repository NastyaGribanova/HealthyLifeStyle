package businessLogic;

import dao.StatsDAO;
import ii.BMI;
import models.UserStats;

public class StatsBL {

    StatsDAO dao = new StatsDAO();
    private BMI imt = new BMI();

    public UserStats updateStats(UserStats userStats){
        UserStats foundUserStats = dao.findByID(userStats.getUserID());
        UserStats newUserStats = new UserStats();
        if (foundUserStats != null){
            if (userStats.getAge() == null){
                newUserStats.setAge(foundUserStats.getAge());
            } else {
                newUserStats.setAge(userStats.getAge());
            }

            if (userStats.getWeight() == null){
                newUserStats.setWeight(foundUserStats.getWeight());
            } else {
                newUserStats.setWeight(userStats.getWeight());
            }

            if (userStats.getHeight() == null){
                newUserStats.setHeight(foundUserStats.getHeight());
            } else {
                newUserStats.setHeight(userStats.getHeight());
            }

            if (userStats.getSex() == null){
                newUserStats.setSex(foundUserStats.getSex());
            } else {
                newUserStats.setSex(userStats.getSex());
            }

            if ((newUserStats.getWeight() != null)&&(newUserStats.getHeight() != null)) {
                float bmi = imt.bmi(newUserStats.getWeight(), newUserStats.getHeight());
                newUserStats.setBmi(bmi);

            } else {
                float bmi = imt.bmi(foundUserStats.getWeight(), foundUserStats.getHeight());
                newUserStats.setBmi(bmi);
            }

            newUserStats.setUserID(userStats.getUserID());
            return dao.update(newUserStats);

        } else{
            return userStats;
        }
    }
}
