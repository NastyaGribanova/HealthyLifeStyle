
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body class="login-body">


<div class="login" align="center">
    <form method="post" >
        <div class="card bg-light mb-3"  style="width: 350px;" >
            <div class="card-body text">
                <p> <input placeholder="Login" type="text" name="loginText" class="text-form" required>  </p>
                <p> <input placeholder="E-mail" type="text" name="emailText" required>  </p>
                <p><input placeholder="Password" type="password" name="password" required>  </p>
                <p><input placeholder="Password again" type="password" name="password2" required>  </p>
                <p>Password rules:</p>
                <p>- Should include more than 6 characters</p>
                <p>- Should include at least 1 number and at least 1 letter</p>
                <p> <input type="submit" class="btn btn-outline-success" value="Sign up"
                           name="signUp">  </p>
            </div>
        </div>
    </form>
</div>
</p>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
