<%@ tag import="models.Exercise" %>
<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList" %>
<%@ tag import="models.ModerateValue" %>
<%@tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%List<Exercise> allExercises = (ArrayList<Exercise>) request.getAttribute("allExercises");%>
<%List<ModerateValue> moderateValues = (ArrayList<ModerateValue>) request.getAttribute("moderateValues");%>
<c:forEach var="moderateValues" items="${moderateValues}">

        <tr>
            <td><p>${moderateValues.getSex()}:</p></td>
            <td><p>${moderateValues.getMinAge()}</p></td>
            <td><p>${moderateValues.getMaxAge()}</p></td>
            <td><p>${moderateValues.getMinSYS()}</p></td>
            <td><p>${moderateValues.getMaxSYS()}</p></td>
            <td><p>${moderateValues.getMinDIA()}</p></td>
            <td><p>${moderateValues.getMaxDIA()}</p></td>
            <td><p>${moderateValues.getSleep()}</p></td>
            <td><p>${moderateValues.getExercise().getName()}</p></td>
            <td><p>${moderateValues.getExercise().getDescription()}</p></td>
        </tr>

</c:forEach>