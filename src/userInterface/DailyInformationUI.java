package userInterface;

import businessLogic.DailyInformationBL;
import models.DailyInformation;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DailyInformationUI {

    private DailyInformationBL businessLogic = new DailyInformationBL();

    public void dailyInformation(HttpServletRequest request, HttpServletResponse response){
        String sleep = request.getParameter("sleepTime");
        String pressureSYS = request.getParameter("pressureSYS");
        String pressureDIA = request.getParameter("pressureDIA");

        DailyInformation dailyInformation = new DailyInformation();
        dailyInformation.setSleep(sleep.equals("") ? null: Integer.parseInt(sleep));
        dailyInformation.setPressureSYS(pressureSYS.equals("") ? null: Integer.parseInt(pressureSYS));
        dailyInformation.setPressureDIA(pressureDIA.equals("") ? null: Integer.parseInt(pressureDIA));
        dailyInformation.setUserID(((User)request.getSession().getAttribute("user")).getId());

        businessLogic.updateInformation(dailyInformation);
        try {
            response.sendRedirect("/profile");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
