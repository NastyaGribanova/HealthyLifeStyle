package userInterface;

import businessLogic.ExerciseBL;
import businessLogic.ModerateValueBL;
import dao.ExerciseDAO;
import ii.GiveYouExercise;
import models.Exercise;
import models.ModerateValue;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ModerateValueUI {

    ModerateValueBL moderateValueBL = new ModerateValueBL();
    ExerciseBL exerciseBL = new ExerciseBL();
    GiveYouExercise giveYouExercise = new GiveYouExercise();

    public void moderate(HttpServletRequest request, HttpServletResponse response){
        String sex = request.getParameter("sex");
        String minAge = request.getParameter("minAge");
        String maxAge = request.getParameter("maxAge");
        String minSYS = request.getParameter("minSYS");
        String maxSYS = request.getParameter("maxSYS");
        String minDIA = request.getParameter("minDIA");
        String maxDIA = request.getParameter("maxDIA");
        String sleep = request.getParameter("sleep");
        String nameActivity = request.getParameter("nameActivity");
        String description = request.getParameter("description");

        Exercise exercise = new Exercise();
        exercise.setName(nameActivity);
        exercise.setDescription(description);
        exerciseBL.exercise(exercise);

        ModerateValue moderateValue = new ModerateValue();
        moderateValue.setSex(sex);
        moderateValue.setMinAge(Integer.parseInt(minAge));
        moderateValue.setMaxAge(Integer.parseInt(maxAge));
        moderateValue.setMinSYS(Integer.parseInt(minSYS));
        moderateValue.setMaxSYS(Integer.parseInt(maxSYS));
        moderateValue.setMinDIA(Integer.parseInt(minDIA));
        moderateValue.setMaxDIA(Integer.parseInt(maxDIA));
        moderateValue.setSleep(Integer.parseInt(sleep));
        moderateValue.setExercise(exercise);

        moderateValueBL.moderateValue(moderateValue);

        //подходящие нам упражнения -> profile
        List<Exercise> exercises;
        exercises = giveYouExercise.showAll(moderateValue, ((User)(request.getSession().getAttribute("user"))).getDailyInformation(),
                                ((User)(request.getSession().getAttribute("user"))).getUserStats());
        request.setAttribute("exercises", exercises);

        request.setAttribute("moderateValues", moderateValueBL.readModerateValues());
        request.setAttribute("allExercises", exerciseBL.readAll());
    }
}
