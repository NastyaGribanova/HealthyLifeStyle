<%@ tag import="models.Comment" %>
<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList" %>
<%@tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%List<Comment> comments = (ArrayList<Comment>) request.getAttribute("comments");%>
<c:forEach var="comment" items="${comments}">
    <div class="container">
        <p><span>${comment.getUser().getLogin()}:</span></p>
        <p>${comment.getDescription()}</p>
        <p>Date: ${comment.getDate()}</p>
    </div>
</c:forEach>