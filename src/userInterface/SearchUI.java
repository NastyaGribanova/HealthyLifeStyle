package userInterface;

import businessLogic.SearchBL;
import models.Exercise;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchUI {

    public void doSearch(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SearchBL searchBL = new SearchBL();
        List<Exercise> exercises;
        exercises = searchBL.getSearchFiles(request);
        JSONObject jsonObject = searchBL.getResponseAsJson(exercises);
        response.setContentType("text/json");
        response.getWriter().write(jsonObject.toString());
    }
}
