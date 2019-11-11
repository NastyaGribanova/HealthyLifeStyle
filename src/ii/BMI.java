package ii;

public class BMI {

    public float bmi(Integer weight, Integer height){
        float bmi = 10000 * weight / (height * height);
        return bmi;
    }

}
