
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<%@include file="/jsp/menu.jsp"%>
<html>
<head>
    <title>Admin</title>
    <script type="application/javascript" src="js/forChange.js"></script>
</head>
<body class="text profile-body">

<div class="card bg-light mb-3" style="width: 500px; border-radius: 10px" >
    <p style="font-size: 25px " >You can change or add some exercises</p>
</div>

<table class="table text" align="center">
    <form method="post" >
        <tr>
            <td> Sex</td>
            <td> <div class="btn-group">
                <button type="button" id="sex" class="btn btn-outline-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Sex
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" onclick="checkSex('Male')">Male</a>
                    <a class="dropdown-item" onclick="checkSex('Female')">Female</a>
                </div>
            </div>
        </tr>
        <tr>
            <td>Min age</td>
            <td> <input type="text" name="minAge" class="text-form" required></td>
        </tr><tr>
        <td>Max age</td>
        <td> <input type="text" name="maxAge" class="text-form" required></td>
    </tr><tr>
        <td>Min sys</td>
        <td> <input type="text" name="minSYS" class="text-form" required></td>
    </tr><tr>
        <td>Max sys</td>
        <td> <input type="text" name="maxSYS" class="text-form" required></td>
    </tr><tr>
        <td>Min dia</td>
        <td> <input type="text" name="minDIA" class="text-form" required></td>
    </tr><tr>
        <td>Max dia</td>
        <td> <input type="text" name="maxDIA" class="text-form" required></td>
    </tr><tr>
        <td>Sleep</td>
        <td> <input type="text" name="sleep" class="text-form" required></td>
    </tr><tr>
        <td>Activity</td>
        <td> <input type="text" name="nameActivity" class="text-form" required></td>
    </tr>

        <td> <p><input name="save" class="btn btn-outline-success" type="submit" value="Save"></p>
        </td>
    </form>
    <tr><td><form method="post" >
        <p><input name="showExercises" class="btn btn-outline-success" type="submit" value="Show all exercises"></p></form></td></tr>
</table>



</body>
</html>