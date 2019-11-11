package userInterface;

import businessLogic.StatsBL;
import models.UserStats;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StatsUI {

    private StatsBL businessLogic = new StatsBL();

    //метод Post для UserStats
    public void changeValues(HttpServletRequest request, HttpServletResponse response){
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");

        UserStats userStats = new UserStats();
        userStats.setAge(Integer.parseInt(age));
        userStats.setSex(Integer.parseInt(sex));
        userStats.setWeight(Integer.parseInt(weight));
        userStats.setHeight(Integer.parseInt(height));
        businessLogic.updateStats(userStats);
    }
}
