<%@ tag import="models.Exercise" %>
<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList" %>
<%@tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${exercises.size() > 6}">

    <p>${exercises.get(6).getName()}<input type="button" value="Do" onclick="showDescription(6)" class="btn btn-outline-success" name="doExercise6"></p>
    <p id="description6" hidden>${exercises.get(6).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() > 7}">

    <p>${exercises.get(7).getName()}<input type="button" value="Do" onclick="showDescription(7)" class="btn btn-outline-success" name="doExercise7"></p>
    <p id="description7" hidden>${exercises.get(7).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() > 8}">

    <p>${exercises.get(8).getName()}<input type="button" value="Do" onclick="showDescription(8)" class="btn btn-outline-success" name="doExercise8"></p>
    <p id="description8" hidden>${exercises.get(8).getDescription()}</p>

</c:if>

<c:if test="${exercises.size() < 7}">
    <p>You can not do more sport today</p>
</c:if>