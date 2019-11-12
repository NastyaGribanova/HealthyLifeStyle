<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>ProfileShow</title>
</head>

<body class="profile-show-body">

<div class="login text" align="center">
    <form method="post" action = profileShow>
        <div class="card bg-light mb-3"  style="width: 350px;" >
            <div class="card-body">
                <p>Login: ${user.login}</p>
                <p>E-mail: ${user.email}</p>
                <p> <input type="submit" class="btn btn-outline-success" value="Change data"
                           name="changeData">  </p>
            </div>
        </div>
    </form>
</div>

</body>
</html>
