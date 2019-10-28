
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib tagdir="/WEB-INF/tags/t" prefix="t"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <script type="application/javascript" src="js/forPassword.js"></script>
</head>
<body class="login-body">

<div class="login" align="center">
    <form method="post" >
        <div class="card bg-light mb-3"  style="width: 350px;" >
            <div class="card-body">
                <p> <input placeholder="Login" type="text" name="login" class="text-form" required>  </p>
                <t:isExist/>
                <p> <input placeholder="E-mail" type="text" name="email" required>  </p>
                <p><input placeholder="Password" type="password" name="password" id="password" oninput="checkPassword()" required>  </p>
                <p id="textLessThan6" style="color: red" hidden >Password should have more than 6 characters</p>
                <p id="textNumbers" style="color: red" hidden >Password should have numbers</p>
                <p id="textLetters" style="color: red" hidden >Password should have letters</p>
                <p><input placeholder="Password again" type="password" name="password2" required>  </p>
                <t:isEquals/>
                <p> <input type="submit" class="btn btn-outline-success" value="Sign up"  name="signUp">  </p>
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
