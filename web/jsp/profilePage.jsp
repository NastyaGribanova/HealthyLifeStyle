<%--
  Created by IntelliJ IDEA.
  User: Len
  Date: 22.10.2019
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Profile</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="style.css" rel="stylesheet">
    <style type="text/css"></style></head>
<body class="main-text profile-body">

<div class="card bg-light mb-3 head-text" style="width: 250px;  margin-top: 50pt;">Pirojok.007</div>

<div>
    <form method="post">
        <div class="card bg-light mb-3 card-profile" style="width: 200px;  margin-top: 80pt;">
            <div class="card-header">General information</div>
            <div class="card-body text">
                <p>Age = </p>

                <p>Sex = </p>

                <p>Weight = </p>

                <p>Height = </p>

                <p> <input name="change" class="btn btn-outline-success" type="submit" value="Change values">  </p>
            </div>
        </div>
    </form>
</div>

<div>
    <form method="post">
        <div class="card bg-light mb-3 card-profile" style="width: 500px;   position: absolute; top: 170pt; left: 50%">
            <div class="card-header">Daily information</div>
            <div class="card-body text">
                Sleep time = <input name="sleepTime" type="text">
                <input name="saveSleepTime" class="btn btn-outline-success" type="submit" value="Save">
                <p>  Pressure  =  <input name="pressure" type="text">
                    <input name="savePressure" class="btn btn-outline-success" type="submit" value="Save"></p>
            </div>
        </div>
    </form>
</div>

<p> <input name="exercises" class="btn btn-outline-success button" type="submit" value="Receive exercises">  </p>

<div class=" text">
    <div class="carousel slide pointer-event" id="carouselExampleCaptions" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleCaptions" data-slide-to="0"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
            <li class="active" data-target="#carouselExampleCaptions" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item">
                <img class="d-block w-100" alt="..." src="img4.png">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Exercises for legs</h5>
                    <p>First exercise</p>
                    <p>Second exercise</p>
                    <p>Third exercise</p>
                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" alt="..." src="img4.png">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Second slide label</h5>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                </div>
            </div>
            <div class="carousel-item active">
                <img class="d-block w-100" alt="..." src="img4.png">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Third slide label</h5>
                    <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
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

<p> <input name="chat" class="btn btn-outline-success button" style="margin-top: 50px;" type="submit" value="Chat">  </p>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" crossorigin="anonymous" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" crossorigin="anonymous" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" crossorigin="anonymous" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"></script>



</body></html>
</body>
</html>
