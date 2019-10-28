
<%@ tag body-content="empty"%>
<%@ attribute name="isEquals" %>
<% String answer = " ";
    if (Boolean.parseBoolean(isEquals)){
    answer = "Passwords are not equals";
}%>
<%= answer%>
