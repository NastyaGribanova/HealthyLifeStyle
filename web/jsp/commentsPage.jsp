<%@ page import="java.util.List" %>
<%@ page import="models.Comment" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Comments</title>
</head>
<body class="comments-body" style="margin-left: 10px"><div class="wrapper">
    <h5 class="text">Comments:</h5>

    <%List<Comment> comments = (ArrayList <Comment>) request.getAttribute("comments");%>
    <c:forEach var="comment" items="${comments}">
        <div class="container">
            <p><span>${comment.getUser().getLogin()}:</span></p>
            <p>${comment.getDescription()}</p>
            <p>Date: ${comment.getDate()}</p>
        </div>
    </c:forEach>

    <div class="container">
        <form method="post"  style="margin-left: 10px">
            <h5><a>Write your comment!</a></h5>
            <p class="text"><a>${user.login}</a></p>
            <div class="areaTextBox">
                <p>
                    <textarea  maxlength="100" name="comment" id="TextComment" style="width: 250px">Comment text</textarea>
                </p>
            </div>
            <input name="addComment" class="btn btn-outline-success" type="submit" value="Add comment">

        </form>
    </div>
</div>
</body>
</html>
