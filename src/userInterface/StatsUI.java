package userInterface;

import businessLogic.StatsBL;
import ii.BMI;
import models.Sex;
import models.User;
import models.UserStats;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StatsUI {

    private StatsBL businessLogic = new StatsBL();

    //метод Post для UserStats
    public void changeValues(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");

        UserStats userStats = new UserStats();
        userStats.setAge(age.equals("") ? null: Integer.parseInt(age));
        userStats.setSex(sex.equals(Sex.MALE.name()) ? Sex.MALE : Sex.FEMALE);
        userStats.setWeight(weight.equals("") ? null: Integer.parseInt(weight));
        userStats.setHeight(height.equals("") ? null: Integer.parseInt(height));
        userStats.setUserID(((User)request.getSession().getAttribute("user")).getId());

        businessLogic.updateStats(userStats);

        response.sendRedirect("/profile");
    }
}
