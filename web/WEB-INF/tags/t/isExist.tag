<%@ tag import="com.sun.org.apache.xpath.internal.operations.Bool" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag body-content="empty" %>
<%@ attribute name="isExist" %>
<% String answer = " ";
    System.out.println(isExist);
    if (isExist != null) {
        if (Boolean.valueOf(isExist)) {
            answer = "This login is already exist";
        }
    }%>
<%= answer%>