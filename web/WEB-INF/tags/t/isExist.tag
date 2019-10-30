<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<p>
<c:forEach var="isExist" items="${isExist}">
    <p><c:out value="${isExist}"/></p>
</c:forEach>
</p>