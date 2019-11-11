package businessLogic;

import dao.DailyInformationDAO;
import models.DailyInformation;

public class DailyInformationBL {

    DailyInformationDAO dao = new DailyInformationDAO();

    public void updateInformation(DailyInformation dailyInformation){
        DailyInformation foundUserInformation = dao.findByID(dailyInformation.getUserID());
        DailyInformation newDailyInformation = new DailyInformation();
        if (foundUserInformation != null){
            if (dailyInformation.getSleep() == null){
                newDailyInformation.setSleep(foundUserInformation.getSleep());
            } else {
                newDailyInformation.setSleep(dailyInformation.getSleep());
            }

            if (dailyInformation.getPressure() == null){
                newDailyInformation.setPressure(foundUserInformation.getPressure());
            } else {
                newDailyInformation.setPressure(dailyInformation.getPressure());
            }
            newDailyInformation.setUserID(dailyInformation.getUserID());
            dao.update(newDailyInformation);
        }
    }
}
