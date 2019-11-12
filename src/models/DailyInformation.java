package models;

public class DailyInformation {

    Integer userID;
    Integer sleep;
    Integer pressureSYS;
    Integer pressureDIA;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public Integer getPressureSYS() {
        return pressureSYS;
    }

    public void setPressureSYS(Integer pressureSYS) {
        this.pressureSYS = pressureSYS;
    }

    public Integer getPressureDIA() {
        return pressureDIA;
    }

    public void setPressureDIA(Integer pressureDIA) {
        this.pressureDIA = pressureDIA;
    }
}
