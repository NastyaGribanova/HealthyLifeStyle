package ii;

import businessLogic.ExerciseBL;
import dao.ExerciseDAO;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class GiveYouExercise {

    public List<Exercise> showAll(ModerateValue moderateValue, DailyInformation dailyInformation, UserStats userStats){
        List<Exercise> exercises = new ArrayList<>();
        exercises.add(exercise(moderateValue, dailyInformation, userStats));
        return exercises;
    }

    public Exercise exercise(ModerateValue moderateValue, DailyInformation dailyInformation, UserStats userstats){
        if((userstats.getAge() >= moderateValue.getMinAge())&&(userstats.getAge() <= moderateValue.getMaxAge())){
            if((userstats.getSex()).equals(moderateValue.getSex())){
                if((dailyInformation.getPressureSYS() >= moderateValue.getMinSYS())&&(dailyInformation.getPressureSYS() <= moderateValue.getMaxSYS())){
                    if((dailyInformation.getPressureDIA() >= moderateValue.getMinDIA())&&(dailyInformation.getPressureDIA() <= moderateValue.getMaxDIA())){
                        if(dailyInformation.getSleep() == moderateValue.getSleep()){
                            return moderateValue.getExercise();
                        } else return null;
                    } else return null;
                } else return null;
            } else return null;
        } else return null;
    }
}
