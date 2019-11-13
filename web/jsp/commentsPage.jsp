<%@ page import="java.util.List" %>
<%@ page import="models.Comment" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags/commentTags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/hrefs.jsp"%>
<c:if test="${sessionScope.user != null}">
    <%@include file="/jsp/menu.jsp"%>
</c:if>

<html>
<head>
    <title>Comments</title>
</head>
<body class="comments-body" style="margin-left: 10px"><div class="wrapper">
    <h5 class="text">Comments:</h5>

    <tag:showComment/>

    <tag:writeComment/>
</div>
</body>
</html>
