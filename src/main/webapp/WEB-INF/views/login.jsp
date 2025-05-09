<form method="post" action="login">
    Email: <input type="text" name="email" /><br/>
    Password: <input type="password" name="password" /><br/>
    <input type="submit" value="Login" />
</form>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>
