package ii;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class GiveYouExercise {

    public List<Exercise> showAll(List<ModerateValue> moderateValue, DailyInformation dailyInformation, UserStats userStats){
        List<Exercise> exercises = new ArrayList<>();
        Exercise recommendedExercise = exercise(moderateValue, dailyInformation, userStats);
        if (recommendedExercise.getName() != null) {
            exercises.add(recommendedExercise);
        }
        return exercises;
    }

    public Exercise exercise(List<ModerateValue> moderateValues, DailyInformation dailyInformation, UserStats userstats){
        Exercise recommendedExercise = new Exercise();
        for (ModerateValue moderateValue: moderateValues) {
            if ((userstats.getAge() >= moderateValue.getMinAge()) && (userstats.getAge() < moderateValue.getMaxAge())) {
                if ((userstats.getSex()).equals(moderateValue.getSex())) {
                    if ((dailyInformation.getPressureSYS() >= moderateValue.getMinSYS()) && (dailyInformation.getPressureSYS() < moderateValue.getMaxSYS())) {
                        if ((dailyInformation.getPressureDIA() >= moderateValue.getMinDIA()) && (dailyInformation.getPressureDIA() < moderateValue.getMaxDIA())) {
                            if (dailyInformation.getSleep().equals(moderateValue.getSleep())) {
                                recommendedExercise = moderateValue.getExercise();
                            }
                        }
                    }
                }
            }
        }
        return recommendedExercise;
    }
}
