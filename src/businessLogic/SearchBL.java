package businessLogic;

import models.Exercise;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SearchBL {

    public List<Exercise> getSearchFiles(HttpServletRequest request) {
        String query = request.getParameter("query");
        List<Exercise> exercises;
        ExerciseHandleBL handleBL = new ExerciseHandleBL();
        exercises = handleBL.getExercises(query);
        return exercises;
    }

    public JSONObject getResponseAsJson(List<Exercise> exercises){
        JSONArray jsonArray = new JSONArray();
        for (Exercise exercise: exercises) {
            jsonArray.put(new JSONObject(exercise));
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("objects", jsonArray);
        return jsonObject;
    }
}
