<%@ tag import="models.Exercise" %>
<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList" %>
<%@tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%List<Exercise> exercises = (ArrayList<Exercise>) request.getAttribute("exercises");%>

<c:if test="${exercises.size() > 0}">

    <p>${exercises.get(0).getName()}<input type="button" value="Do" onclick="showDescription(0)" class="btn btn-outline-success" name="doExercise0"></p>
    <p id="description0" hidden>${exercises.get(0).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() > 1}">

    <p>${exercises.get(1).getName()}<input type="button" value="Do" onclick="showDescription(1)" class="btn btn-outline-success" name="doExercise1"></p>
    <p id="description1" hidden>${exercises.get(1).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() > 2}">

    <p>${exercises.get(2).getName()}<input type="button" value="Do" onclick="showDescription(2)" class="btn btn-outline-success" name="doExercise2"></p>
    <p id="description2" hidden>${exercises.get(2).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() < 1}">
    <p>You can not do sport</p>
</c:if>