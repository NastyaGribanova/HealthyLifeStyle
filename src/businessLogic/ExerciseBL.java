package businessLogic;

import dao.ExerciseDAO;
import models.Exercise;

import java.util.List;

public class ExerciseBL {

    ExerciseDAO exerciseDAO = new ExerciseDAO();

    public void exercise(Exercise exercise){
        exerciseDAO.create(exercise);
    }

    public List<Exercise> readAll(){
        return exerciseDAO.readAll();
    }

}
