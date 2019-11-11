<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Comments</title>
</head>
<body class="comments-body" style="margin-left: 10px">

<div class="wrapper">
    <div class="comment" style="margin-left: 10px">
        <h5>бахни логин из бд</h5>
        <p>бахни текст коммента из бд</p>
        <p>бахни дату из бд</p>
    </div>


    <c:set var="i" value="${1}"/>
    <c:forEach var="order" items="${sessionScope.orderDeliveryList}">
        <form action="/profile/basket" method="post">
            <div class="comment" style="margin-left: 10px">
                <h5>бахни логин из бд</h5>
                <p>бахни текст коммента из бд</p>
                <p>бахни дату из бд</p>
            </div>
        </form>
        <c:set var="i" value="${i+1}"/>
    </c:forEach>


    <div class="container">
        <p><span>Chris Fox.</span> CEO at Mighty Schools.</p>
        <p>HTML CSS saved us from a web disaster.</p>
    </div>





    <form method="post"  style="margin-left: 10px">
        <p><a>Login</a> </p>
        <div class="areaTextBox">
            <p>
                <textarea  maxlength="100" id="TextComment" style="width: 250px">Comment text</textarea>
            </p>
        </div>
        <input name="addComment" class="btn btn-outline-success" type="submit" value="Add comment">

    </form>

</div>



</body>
</html>
