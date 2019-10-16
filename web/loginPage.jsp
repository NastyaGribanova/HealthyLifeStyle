
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="bootstrap-4.3.1-dist/css/bootstrap.min.css">

</head>
<body class="login-body">


<div class="login" align="center">
    <form method="post" >
        <div class="card bg-light mb-3"  style="width: 350px;" >
            <div class="card-body">
                <p> <input placeholder="Login" type="text" name="loginText" class="text-form">  </p>
                <p><input placeholder="Password" type="password" name="password">  </p>
                <p> <input type="submit" class="btn btn-outline-success" value="login"
                           name="login">  </p>
                <p><input type="checkbox" name="save" value="save"> Remember me?</p>
                Still not with us? <a href="#" class="badge badge-success">Join</a>
            </div>
        </div>
    </form>
</div>
</p>
</body>
</html>
