<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Comments</title>
</head>
<body class="comments-body" style="margin-left: 10px"><div class="wrapper">
    <h5 class="text">Comments:</h5>

    <div class="container">
        <p><span>Nastya:</span></p>
        <p>It's really helpful!</p>
        <p>Data: 10.11.2019</p>
    </div>

    <div class="container">
        <p><span >Dina:</span></p>
        <p>I am cooperator from Oriflame...</p>
        <p>Data: 11.11.2019</p>
    </div>

    <div class="container">
        <form method="post"  style="margin-left: 10px">
            <h5><a>Write your comment!</a></h5>
            <p class="text"><a>Login</a></p>
            <div class="areaTextBox">
                <p>
                    <textarea  maxlength="100" id="TextComment" style="width: 250px">Comment text</textarea>
                </p>
            </div>
            <input name="addComment" class="btn btn-outline-success" type="submit" value="Add comment">

        </form>
    </div>
</div>
</body>
</html>
