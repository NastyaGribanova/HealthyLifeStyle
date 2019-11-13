package userInterface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddExercisesUI {

   public void addExercise(HttpServletRequest request, HttpServletResponse response){
       String sex = request.getParameter("sex");
       String minAge = request.getParameter("minAge");
       String maxAge = request.getParameter("maxAge");
       String minSYS = request.getParameter("minSYS");
       String maxSYS = request.getParameter("maxSYS");
       String minDIA = request.getParameter("minDIA");
       String maxDIA = request.getParameter("maxDIA");
       String sleep = request.getParameter("sleep");
       String nameActivity = request.getParameter("nameActivity");


   }
}
