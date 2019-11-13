package userInterface;

import businessLogic.StatsBL;
import models.Sex;
import models.User;
import models.UserStats;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        userStats.setSex(sex.equals(Sex.male.name()) ? Sex.male : Sex.female);
        userStats.setWeight(weight.equals("") ? null: Integer.parseInt(weight));
        userStats.setHeight(height.equals("") ? null: Integer.parseInt(height));
        userStats.setUserID(((User)request.getSession().getAttribute("user")).getId());

        userStats = businessLogic.updateStats(userStats);

        request.getSession().setAttribute("userStats", showInformation(userStats));

        response.sendRedirect("/profile");
    }

    public List showInformation(UserStats userStats){
        List<Object> information = new ArrayList<>();
        information.add(userStats.getAge());
        information.add(userStats.getSex().toString().toLowerCase());
        information.add(userStats.getWeight());
        information.add(userStats.getHeight());
        information.add(userStats.getBmi());
        return information;
    }
}
