package userInterface;

import businessLogic.DailyInformationBL;
import models.DailyInformation;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DailyInformationUI {

    private DailyInformationBL businessLogic = new DailyInformationBL();

    public void dailyInformation(HttpServletRequest request, HttpServletResponse response){
        String sleep = request.getParameter("sleep");
        String pressure = request.getParameter("pressure");

        DailyInformation dailyInformation = new DailyInformation();
        dailyInformation.setSleep(sleep.equals("") ? null: Integer.parseInt(sleep));
        dailyInformation.setPressure(pressure.equals("") ? null: Integer.parseInt(pressure));
        dailyInformation.setUserID(((User)request.getSession().getAttribute("user")).getId());

        businessLogic.updateInformation(dailyInformation);
    }
}
