
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<head>
    <title>Change</title>
    <script type="application/javascript" src="js/forChange.js"></script>
</head>
<body class="change-body">

<div align="center">
    <form method="post">
        <div class="card bg-light mb-3 " style="width: 350px;  margin-top: 80pt">
            <div class="card-header text" style="font-size: 25px">General information</div>
            <div class="card-body text">
                <p>Age = <input name="age" type="text"></p>
                <p>Weight = <input name="weight" type="text"></p>
                <p>Height = <input name="height" type="text"></p>
                <p> <div class="btn-group">
                <button type="button" id="sex" class="btn btn-outline-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Sex
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" onclick="checkSex('male')">male</a>
                    <a class="dropdown-item" onclick="checkSex('female')">female</a>
                </div>
            </div> </p>
                <input name="sex" id="sex-id" hidden>
                <p> <input name="saveChanging" class="btn btn-outline-success" type="submit" value="Save">  </p>
            </div>
        </div>
    </form>
</div>
</body>
</html>
