package userInterface;

import dao.DailyInformationDAO;
import dao.ModerateValueDAO;
import dao.StatsDAO;
import ii.GiveYouExercise;
import models.Exercise;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class GiveExerciseUI {

    GiveYouExercise giveYouExercise = new GiveYouExercise();
    DailyInformationDAO dailyInformationDAO = new DailyInformationDAO();
    StatsDAO statsDAO = new StatsDAO();
    ModerateValueDAO moderateValueDAO = new ModerateValueDAO();

    public void giveExercise(HttpServletRequest request, HttpServletResponse response){
        List<Exercise> exercises;
        exercises = giveYouExercise.showAll(moderateValueDAO.readAll(), dailyInformationDAO.findByID (((User)(request.getSession().getAttribute("user"))).getId()),
                statsDAO.findByID(((User)(request.getSession().getAttribute("user"))).getId()));
        request.setAttribute("exercises", exercises);
    }
}
