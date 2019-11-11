<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>TrainerRegistration</title>
    <script type="application/javascript" src="js/forPassword.js"></script>
</head>
<body class="trainer-body">

<div class="login" align="center">
    <form method="post" >
        <div class="card bg-light mb-3"  style="width: 350px;" >
            <div class="card-body">
                <h5>Add new trainer!</h5>
                <p> <input placeholder="Login" type="text" name="login" class="text-form" required>  </p>
                <p> <input placeholder="E-mail" type="text" name="email" required>  </p>
                <p><input placeholder="Password" type="password" name="password" id="password" oninput="checkPassword()" required>  </p>
                <p id="textLessThan6" style="color: red" hidden >Password should have more than 6 characters</p>
                <p id="textNumbers" style="color: red" hidden >Password should have numbers</p>
                <p id="textLetters" style="color: red" hidden >Password should have letters</p>
                <p><input placeholder="Password again" type="password" name="password2" id="password2" oninput="checkEquals()" required>  </p>
                <p id="textEquals" style="color: red" hidden >Passwords are not equal</p>
                <p id="textEqualsCorrect" style="color: #28a745" hidden >Correct</p>
                <p> <input type="submit" class="btn btn-outline-success" value="Sign up"  name="signUp">  </p>
                <a href="/login" class="badge badge-success">I have already had an account</a>
            </div>
        </div>
    </form>
</div>
</body>
</html>

