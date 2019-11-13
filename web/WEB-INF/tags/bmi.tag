<%@tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${userStats.get(4) <= 16}">
    <p>You really need to eat some cakes</p>
</c:if>
<c:if test="${(userStats.get(4) > 16)&&(userStats.get(4) <= 18.5)}">
    <p>Maybe you need to eat some cakes</p>
</c:if>
<c:if test="${(userStats.get(4) > 18.5)&&(userStats.get(4) <= 25)}">
    <p>You are in a grate shape</p>
</c:if>
<c:if test="${(userStats.get(4) > 25)&&(userStats.get(4) <= 30)}">
    <p>Apple is better than Big Mac, man</p>
</c:if>
<c:if test="${(userStats.get(4) > 30)&&(userStats.get(4) <= 35)}">
    <p>You need our site more than you think</p>
</c:if>
<c:if test="${(userStats.get(4) > 35)&&(userStats.get(4) <= 40)}">
    <p>Stop seize your problems, bro</p>
</c:if>
<c:if test="${userStats.get(4) > 40}">
    <p>Moto-moto would like you</p>
</c:if>