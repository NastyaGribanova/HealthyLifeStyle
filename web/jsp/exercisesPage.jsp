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
</head>
<body>
<body class="text profile-body" >

<%List<Exercise> exercises = (ArrayList<Exercise>) request.getAttribute("allExercises");%>
<%List<ModerateValue> moderateValues = (ArrayList<ModerateValue>) request.getAttribute("moderateValues");%>

<table class="table text" style="width: 70%" align="center">
    <form method="post">
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
    </form>
</table>

</body>
</html>
