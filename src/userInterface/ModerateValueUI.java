package userInterface;

import businessLogic.ExerciseBL;
import businessLogic.ModerateValueBL;
import ii.GiveYouExercise;
import models.Exercise;
import models.ModerateValue;
import models.Sex;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ModerateValueUI {

    ModerateValueBL moderateValueBL = new ModerateValueBL();
    ExerciseBL exerciseBL = new ExerciseBL();
    GiveYouExercise giveYouExercise = new GiveYouExercise();

    public void moderate(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
        exerciseBL.createExercise(exercise);
        exercise.setId(exerciseBL.findByName(nameActivity).getId());

        ModerateValue moderateValue = new ModerateValue();
        moderateValue.setSex(sex.equals(Sex.MALE.name()) ? Sex.MALE : Sex.FEMALE);
        moderateValue.setMinAge(Integer.parseInt(minAge));
        moderateValue.setMaxAge(Integer.parseInt(maxAge));
        moderateValue.setMinSYS(Integer.parseInt(minSYS));
        moderateValue.setMaxSYS(Integer.parseInt(maxSYS));
        moderateValue.setMinDIA(Integer.parseInt(minDIA));
        moderateValue.setMaxDIA(Integer.parseInt(maxDIA));
        moderateValue.setSleep(Integer.parseInt(sleep));
        moderateValue.setExercise(exercise);

        moderateValueBL.createModerateValue(moderateValue);

        showAll(request);

        response.sendRedirect("/showExercises");
    }

    public void showAll(HttpServletRequest request){
        request.setAttribute("moderateValues", moderateValueBL.readModerateValues());
        request.setAttribute("allExercises", exerciseBL.readAll());
    }
}
