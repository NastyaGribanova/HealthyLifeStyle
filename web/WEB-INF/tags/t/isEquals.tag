
<c:if test="${exception != null}">
    <div class="alert alert-success status" role="alert">
        <c:out value="${exception}"/>
    </div>
</c:if>