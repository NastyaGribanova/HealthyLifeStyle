<%@tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.user != null}">
    <div class="container">
        <form method="post"  style="margin-left: 10px">
            <h5><a>Write your comment!</a></h5>
            <p class="text"><a>${user.login}</a></p>
            <div class="areaTextBox">
                <p>
                    <textarea  maxlength="100" name="comment" id="TextComment" style="width: 250px">Comment text</textarea>
                </p>
            </div>
            <input name="addComment" class="btn btn-outline-success" type="submit" value="Add comment">

        </form>
    </div>
</c:if>