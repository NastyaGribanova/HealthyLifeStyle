<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<html>
<head>
    <title>Profile</title>
    <script type="application/javascript" src="js/forProfile.js"></script>
    <style type="text/css"></style>
</head>
<body class="main-text profile-body" onload="getDate()">

<nav class="nav" style="width: 100%; margin: 0; background: #28a745; color: white;">
    <a class="nav-link active" style="font-weight: bold; font-size: 30px"><%=request.getSession().getAttribute("login")%></a>
    <li class="nav-item">
        <form method="post">
            <input name="profile" class="btn btn-outline-success button" style="width: 100px; margin-left: 900px; margin-top: 10px" type="submit" value="Profile">
        </form>
    </li>
    <li class="nav-item">
        <form method="post" action="logout">
            <input name="logout" class="btn btn-outline-success button" style="width: 100px; margin-left: 1050px; margin-top: 10px" type="submit" value="Log out">
        </form>
    </li>
</nav>

<div>
    <form method="get" action="changeValues">
        <div class="card bg-light mb-3 card-profile" style="width: 200px;  margin-top: 80pt;">
            <div class="card-header text">General information</div>
            <div class="card-body text">
                <p>Age: </p>
                <p>Sex: </p>
                <p>Weight: </p>
                <p>Height: </p>
                <p>BMI: </p>
                <p> <input name="change" class="btn btn-outline-success" type="submit" value="Change values">  </p>
            </div>
        </div>
    </form>
</div>

<div >
    <form method="post">
        <div class="card bg-light mb-3 card-profile" style="width: 500px;   position: absolute; top: 125pt; left: 50%">
            <div class="card-header text" id="date"></div>
            <div class="card-body text">
                Sleep time = <input name="sleepTime" type="text">
                <p>  Pressure  =  <input name="pressure" type="text"> </p>
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
                    <h2 class="text">First exercises:</h2>
                    <p>First exercise <input type="button" value="Do" onclick="showDescription(1)" class="btn btn-outline-success" name="doExercise1"></p>
                    <p id="description1" hidden>Very very very good exercise 1</p>
                    <p>Second exercise <input type="button" value="Do" onclick="showDescription(2)" class="btn btn-outline-success" name="doExercise2"></p>
                    <p id="description2" hidden>Very very very good exercise 2</p>
                    <p>Third exercise <input type="button" value="Do" onclick="showDescription(3)" class="btn btn-outline-success" name="doExercise3"></p>
                    <p id="description3" hidden>Very very very good exercise 3</p>

                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" alt="..." src="slider.png">
                <div class="carousel-caption d-none d-md-block text">
                    <h2 class="text">Second exercises:</h2>
                    <p>First exercise <input type="button" value="Do" onclick="showDescription(4)" class="btn btn-outline-success" name="doExercise1"></p>
                    <p id="description4" hidden>Very very very good exercise 1</p>
                    <p>Second exercise <input type="button" value="Do" onclick="showDescription(5)" class="btn btn-outline-success" name="doExercise2"></p>
                    <p id="description5" hidden>Very very very good exercise 2</p>
                    <p>Third exercise <input type="button" value="Do" onclick="showDescription(6)" class="btn btn-outline-success" name="doExercise3"></p>
                    <p id="description6" hidden>Very very very good exercise 3</p>
                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" alt="..." src="slider.png">
                <div class="carousel-caption d-none d-md-block text">
                    <h2 class="text">Third exercises:</h2>
                    <p>First exercise <input type="button" value="Do" onclick="showDescription(7)" class="btn btn-outline-success" name="doExercise1"></p>
                    <p id="description7" hidden>Very very very good exercise 1</p>
                    <p>Second exercise <input type="button" value="Do" onclick="showDescription(8)" class="btn btn-outline-success" name="doExercise2"></p>
                    <p id="description8" hidden>Very very very good exercise 2</p>
                    <p>Third exercise <input type="button" value="Do" onclick="showDescription(9)" class="btn btn-outline-success" name="doExercise3"></p>
                    <p id="description9" hidden>Very very very good exercise 3</p>
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
