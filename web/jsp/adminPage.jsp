
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Admin</title>
    <script type="application/javascript" src="js/forChange.js"></script>
</head>
<body class="text profile-body">

<div class="card bg-light mb-3" style="width: 500px; border-radius: 10px" >
    <p style="font-size: 25px " >You can change or add some exercises</p>
</div>

<form method="post">
    <table class="table text">
        <thead>
        <tr>
            <td>Sex</td>
            <td>Min age</td>
            <td>Max age</td>
            <td>Min sys</td>
            <td>Max sys</td>
            <td>Min dia</td>
            <td>Max dia</td>
            <td>Sleep</td>
            <td>Activity</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td> <div class="btn-group">
                <button type="button" id="sex" class="btn btn-outline-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Sex
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" onclick="checkSex('Male')">Male</a>
                    <a class="dropdown-item" onclick="checkSex('Female')">Female</a>
                </div>
            </div>
                </td>
            <td>  <input type="text" name="minAge" class="text-form"></td>
            <td>  <input type="text" name="maxAge" class="text-form"></td>
            <td>  <input type="text" name="minSYS" class="text-form"></td>
            <td>  <input type="text" name="maxSYS" class="text-form"></td>
            <td>  <input type="text" name="minDIA" class="text-form"></td>
            <td>  <input type="text" name="maxDIA" class="text-form"></td>
            <td>  <input type="text" name="sleep" class="text-form"></td>
            <td>  <input type="text" name="nameActivity" class="text-form"></td>
                <input name="save" class="btn btn-outline-success" type="submit" value="Save">
        </tr>
        </tbody>
    </table>
</form>

</body>
</html>
