<%@ tag body-content="empty"%>
<%@ attribute name="isExist" %>
<% String answer = " ";
    if (Boolean.parseBoolean(isExist)){
        answer = "This login is already exist";
    }%>
<%= answer%>