package models;

public class DailyInformation {

    int user_id;
    int sleep_id;
    int pressure_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSleep_id() {
        return sleep_id;
    }

    public void setSleep_id(int sleep_id) {
        this.sleep_id = sleep_id;
    }

    public int getPressure_id() {
        return pressure_id;
    }

    public void setPressure_id(int pressure_id) {
        this.pressure_id = pressure_id;
    }
}
