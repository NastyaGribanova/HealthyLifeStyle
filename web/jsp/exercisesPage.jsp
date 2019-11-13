<%@ page import="models.Exercise" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="models.ModerateValue" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<%@include file="/jsp/menu.jsp"%>
<html>
<head>
    <title>Exercises</title>
    <script type="application/javascript" src="js/forSearch.js"></script>
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
</head>
<body class="text profile-body" onload="search()">

<p><input type="text" id="searchQuery" oninput="search()"></p>
<div id="searchResult">
    <p></p>
</div>

<table class="table text" style="width: 70%" align="center">

    <tr><td>Sex</td>
        <td>Min age</td>
        <td>Max age</td>
        <td>Min sys</td>
        <td>Max sys</td>
        <td>Min dia</td>
        <td>Max dia</td>
        <td>Sleep</td>
        <td>Activity</td>
        <td>Description</td></tr>

    <%List<Exercise> allExercises = (ArrayList<Exercise>) request.getAttribute("allExercises");%>
    <%List<ModerateValue> moderateValues = (ArrayList<ModerateValue>) request.getAttribute("moderateValues");%>
    <c:forEach var="moderateValues" items="${moderateValues}">
    <c:forEach var="exercise" items="${allExercises}">
        <tr>
            <td><p>${moderateValues.getSex()}:</p></td>
            <td><p>${moderateValues.getMinAge()}</p></td>
            <td><p>${moderateValues.getMaxAge()}</p></td>
            <td><p>${moderateValues.getMinSYS()}</p></td>
            <td><p>${moderateValues.getMaxSYS()}</p></td>
            <td><p>${moderateValues.getMinDIA()}</p></td>
            <td><p>${moderateValues.getMaxDIA()}</p></td>
            <td><p>${moderateValues.getSleep()}</p></td>
            <td><p>${exercise.getName()}</p></td>
            <td><p>${exercise.getDescription()}</p></td>
        </tr>
    </c:forEach>
    </c:forEach>

</table>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"></script>

</body>
</html>