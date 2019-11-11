
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib tagdir="/WEB-INF/tags/t" prefix="t"%>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Login</title>
</head>
<body class="login-body">

<div class="login" align="center">
    <form method="post" >
        <div class="card bg-light mb-3"  style="width: 350px;" >
            <div class="card-body">
                <p> <input placeholder="Login" type="text" name="login" class="text-form" required>  </p>
                <p><input placeholder="Password" type="password" name="password" required>  </p>
                <p> <input type="submit" class="btn btn-outline-success" value="log in"
                           name="login">  </p>
                <p><input type="checkbox" name="save" value="save"> Remember me?</p>
                Still not with us? <a href="/registration" class="badge badge-success">Join</a>
            </div>
        </div>
    </form>
</div>

</body>
</html>
