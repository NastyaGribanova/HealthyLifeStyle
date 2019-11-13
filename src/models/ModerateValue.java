package models;

public class ModerateValue {

    private Sex sex;
    Integer minAge;
    Integer maxAge;
    Integer minSYS;
    Integer maxSYS;
    Integer minDIA;
    Integer maxDIA;
    Integer sleep;
    Exercise exercise;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getMinSYS() {
        return minSYS;
    }

    public void setMinSYS(Integer minSYS) {
        this.minSYS = minSYS;
    }

    public Integer getMaxSYS() {
        return maxSYS;
    }

    public void setMaxSYS(Integer maxSYS) {
        this.maxSYS = maxSYS;
    }

    public Integer getMinDIA() {
        return minDIA;
    }

    public void setMinDIA(Integer minDIA) {
        this.minDIA = minDIA;
    }

    public Integer getMaxDIA() {
        return maxDIA;
    }

    public void setMaxDIA(Integer maxDIA) {
        this.maxDIA = maxDIA;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
