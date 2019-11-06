<%--
  Created by IntelliJ IDEA.
  User: Len
  Date: 22.10.2019
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Admin</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body class="text profile-body">

<div class="card bg-light mb-3" style="width: 500px; border-radius: 10px">
    <p style="font-size: 25px">You can change or add some exercises</p>
</div>

<form method="post">
    <table class="table text">
        <tr>
            <td>Sex</td>
            <td>Min age</td>
            <td>Max age</td>
            <td>Blood pressure</td>
            <td>Sleep duration</td>
            <td>Activities</td>
            <td>Add some activities</td>
        </tr>
        <tr>
            <td>Male</td>
            <td>10</td>
            <td>20</td>
            <td>120/80</td>
            <td>8</td>
            <td>KACHAISY</td>
            <td>
                <input type="text" name="activity_1" class="text-form">
                <input name="saveAct1" class="btn btn-outline-success" type="submit" value="Save">
            </td>
        </tr>
        <tr>
            <td>Female</td>
            <td>10</td>
            <td>20</td>
            <td>120/80</td>
            <td>8</td>
            <td>kachaisy</td>
            <td>
                <input type="text" name="activity_2" class="text-form">
                <input name="saveAct2" class="btn btn-outline-success" type="submit" value="Save">
            </td>
        </tr>
        <tr>
            <td>Male</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td>Female</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td>Male</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td>Female</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>
</form>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
