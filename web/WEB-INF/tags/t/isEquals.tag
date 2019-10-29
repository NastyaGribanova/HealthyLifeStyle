<%@ tag import="com.sun.org.apache.xpath.internal.operations.Bool" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag body-content="empty" %>
<%@ attribute name="isEquals" %>
<% String answer = " ";
    System.out.println(isEquals);
    if (isEquals != null) {
        if (Boolean.valueOf(isEquals)) {
            answer = "Passwords are not equals";
        }
    }%>
<%= answer%>