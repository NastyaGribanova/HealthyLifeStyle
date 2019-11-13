package businessLogic;

import dao.ExerciseDAO;
import models.Exercise;

import java.util.List;

public class ExerciseHandleBL {

    ExerciseDAO exerciseDAO = new ExerciseDAO();

    public List<Exercise> getExercises(String query) {
        return exerciseDAO.findByQuery(query);
    }
}
