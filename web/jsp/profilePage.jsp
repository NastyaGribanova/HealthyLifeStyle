<%@ page import="models.Exercise" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="firstSet" tagdir="/WEB-INF/tags/exerciseTags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<%@include file="/jsp/menu.jsp"%>
<html>
<head>
    <title>Profile</title>
    <script type="application/javascript" src="js/forProfile.js"></script>
</head>
<body class="main-text profile-body" onload="getDate()">

<div>
    <form method="get" action="changeValues">
        <div class="card bg-light mb-3 card-profile" style="width: 200px;  margin-top: 80pt;">
            <div class="card-header text">General information</div>
            <div class="card-body text">
                <p>Age: ${userStats.get(0)} </p>
                <p>Sex: ${userStats.get(1)} </p>
                <p>Weight: ${userStats.get(2)} </p>
                <p>Height: ${userStats.get(3)} </p>
                <p>BMI: ${userStats.get(4)} </p>
                <tag:bmi/>
                <p> <input name="change" class="btn btn-outline-success" type="submit" value="Change values">  </p>
            </div>
        </div>
    </form>
</div>

<div >
    <form method="post" action="dailyInformation">
        <div class="card bg-light mb-3 card-profile" style="width: 500px;   position: absolute; top: 125pt; left: 50%">
            <div class="card-header text" id="date"></div>
            <div class="card-body text">
                <p>Sleep time = <input name="sleepTime" type="text"></p>
                <p>  Systolic pressure  =  <input name="pressureSYS" type="text"> </p>
                <p>  Diastolic pressure  =  <input name="pressureDIA" type="text"> </p>
                <p>  <input name="save" style="margin-left: 180px;" id="savePressure" class="btn btn-outline-success" type="submit" value="Save"></p>
            </div>
        </div>
    </form>
</div>

<p> <input name="exercises" onclick="showSlider()" class="btn btn-outline-success button" type="submit" value="Receive exercises">  </p>

<div id="slider" hidden>
    <div class="carousel slide pointer-event" id="carouselExampleCaptions" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleCaptions" data-slide-to="0"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
            <li class="active" data-target="#carouselExampleCaptions" data-slide-to="2"></li>
        </ol>

        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" alt="..." src="slider.png">
                <div class="carousel-caption d-none d-md-block text">
                    <firstSet:firstSetExercise/>
                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" alt="..." src="slider.png">
                <div class="carousel-caption d-none d-md-block text">
                    <firstSet:secondSetExercise/>
                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" alt="..." src="slider.png">
                <div class="carousel-caption d-none d-md-block text">
                   <firstSet:thirdSetExercise/>
                </div>
            </div>
        </div>

        <a class="carousel-control-prev" role="button" href="#carouselExampleCaptions" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" role="button" href="#carouselExampleCaptions" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

</body>
</html>
