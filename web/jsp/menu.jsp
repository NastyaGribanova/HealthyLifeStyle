<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
<nav class="nav" style="width: 100%; margin: 0; background: #28a745; color: white;">
    <ul class="nav justify-content-end" style="margin-top: 10px;">
        <a class="nav-link active" style="font-weight: bold; font-size: 30px">${user.login}</a>
        <li class="nav-item">
            <a>
                <form method="post" action="profilee">
                    <input name="profile" class="btn btn-outline-success button" type="submit" value="Profile">
                </form></a>
        </li>
        <c:if test="${sessionScope.user.permissionId==2}">
            <a><li class="nav-item">
                <form method="post" action="/exercise">
                    <input name="addExercises" class="btn btn-outline-success button" type="submit" value="Add exercises">
                </form>
            </li>
            </a>
            <a>
                <li class="nav-item">
                    <form method="post" action="trainer">
                        <input name="addTrainer" class="btn btn-outline-success button"  type="submit" value="Add trainer">
                    </form>
                </li></a>
        </c:if>
        <li class="nav-item">
            <a>
                <form method="post" action="comments">
                    <input name="comments" class="btn btn-outline-success button"  type="submit" value="Comments">
                </form></a>
        </li>
        <li class="nav-item">
            <a>
                <form method="post" action="show">
                    <input name="profileSettings" class="btn btn-outline-success button" type="submit" value="Profile settings">
                </form></a>
        </li>
        <li class="nav-item">
            <a>
                <form method="post" action="logout">
                    <input name="logout" class="btn btn-outline-success button" type="submit" value="Log out">
                </form></a>
        </li>
    </ul>
</nav>
</body>
</html>
