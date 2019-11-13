package ii;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class GiveYouExercise {

    public List<Exercise> giveExercise(List<ModerateValue> moderateValues, DailyInformation dailyInformation, UserStats userstats){
        List<Exercise> recommendedExercise = new ArrayList<Exercise>();
        for (ModerateValue moderateValue: moderateValues) {
            if ((userstats.getAge() >= moderateValue.getMinAge()) && (userstats.getAge() < moderateValue.getMaxAge())) {
                if ((userstats.getSex()).equals(moderateValue.getSex())) {
                    if ((dailyInformation.getPressureSYS() >= moderateValue.getMinSYS()) && (dailyInformation.getPressureSYS() < moderateValue.getMaxSYS())) {
                        if ((dailyInformation.getPressureDIA() >= moderateValue.getMinDIA()) && (dailyInformation.getPressureDIA() < moderateValue.getMaxDIA())) {
                            if (dailyInformation.getSleep().equals(moderateValue.getSleep())) {
                                recommendedExercise.add(moderateValue.getExercise());
                            }
                        }
                    }
                }
            }
        }
        return recommendedExercise;
    }
}
