package models;

public class UserStats {

    Integer userID;
    Integer age;
    Integer weight;
    Integer height;
    private Sex sex;
    Float bmi;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Float getBmi() {
        return (float)(10000 * weight / (height * height));
    }

    public void setBmi(Float bmi) {
        this.bmi = bmi;
    }
}
