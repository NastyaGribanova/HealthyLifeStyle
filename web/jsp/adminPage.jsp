
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Admin</title>
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

</body>
</html>
