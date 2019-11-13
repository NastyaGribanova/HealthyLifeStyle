<%@ tag import="models.Exercise" %>
<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList" %>
<%@tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%List<Exercise> exercises1 = (ArrayList<Exercise>) request.getAttribute("exercises");%>

<c:if test="${exercises.size() > 3}">

    <p>${exercises1.get(3).getName()}<input type="button" value="Do" onclick="showDescription(3)" class="btn btn-outline-success" name="doExercise3"></p>
    <p id="description3" hidden>${exercises.get(3).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() > 4}">

    <p>${exercises1.get(4).getName()}<input type="button" value="Do" onclick="showDescription(4)" class="btn btn-outline-success" name="doExercise4"></p>
    <p id="description4" hidden>${exercises.get(4).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() > 5}">

    <p>${exercises1.get(5).getName()}<input type="button" value="Do" onclick="showDescription(5)" class="btn btn-outline-success" name="doExercise5"></p>
    <p id="description5" hidden>${exercises.get(5).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() < 3}">
    <p>You can not do more sport today</p>
</c:if>