package models;

public class DailyInformation {

    Integer userID;
    Integer sleep;
    Integer pressure;

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

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }
}
