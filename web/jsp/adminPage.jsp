
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Admin</title>
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
            <td>Blood pressure</td>
            <td>Sleep duration</td>
            <td>Activities</td>
            <td>Add some activities</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Male</td>
            <td>10</td>
            <td>20</td>
            <td>120/80</td>
            <td>8</td>
            <td>Pushing up(20), running(1km), swimming</td>
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
            <td>Squats(20), running(0,6km), swimming</td>
            <td>
                <input type="text" name="activity_2" class="text-form">
                <input name="saveAct2" class="btn btn-outline-success" type="submit" value="Save">
            </td>
        </tr>
        <tr>
            <td>Male</td>
            <td>20</td>
            <td>30</td>
            <td>120/80</td>
            <td>7</td>
            <td>Pushing up(25), running(2km), pulling up(20), swimming</td>
            <td><input type="text" name="activity_3" class="text-form">
                <input name="saveAct3" class="btn btn-outline-success" type="submit" value="Save"> </td>
        </tr>
        <tr>
            <td>Female</td>
            <td>20</td>
            <td>30</td>
            <td>120/80</td>
            <td>7</td>
            <td>Squats(25), running(0,8km), press(30), swimming</td>
            <td><input type="text" name="activity_4" class="text-form">
                <input name="saveAct4" class="btn btn-outline-success" type="submit" value="Save"> </td>
        </tr>
        <tr>
            <td>Male</td>
            <td>30</td>
            <td>40</td>
            <td>130/80</td>
            <td>6</td>
            <td>Pushing up(15), running(2km), pulling up(20), swimming</td>
            <td><input type="text" name="activity_5" class="text-form">
                <input name="saveAct5" class="btn btn-outline-success" type="submit" value="Save"> </td>
        </tr>
        <tr>
            <td>Female</td>
            <td>30</td>
            <td>40</td>
            <td>130/80</td>
            <td>6</td>
            <td>Squats(25), running(0,8km), press(30), swimming</td>
            <td><input type="text" name="activity_6" class="text-form">
                <input name="saveAct6" class="btn btn-outline-success" type="submit" value="Save"> </td>
        </tr>
        </tbody>
    </table>
</form>

</body>
</html>
