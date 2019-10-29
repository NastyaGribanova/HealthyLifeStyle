<%@ tag import="com.sun.org.apache.xpath.internal.operations.Bool" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag body-content="empty" %>
<%@ attribute name="isRegistrated" %>
<% String answer = " ";
    System.out.println(isRegistrated);
    if (isRegistrated != null) {
        if (Boolean.valueOf(isRegistrated)) {
            answer = "You don't have an account";
        }
    }%>
<%= answer%>