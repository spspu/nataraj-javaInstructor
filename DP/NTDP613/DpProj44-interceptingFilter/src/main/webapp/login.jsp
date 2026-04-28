<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color:red;text-align:center">Login page</h1>

<form action="loginurl" method="POST">
    <table border="1" bgcolor="cyan" align="center">
        <tr>
            <th>user name:: </th>
            <th><input type="text" name="uname"/></th>
        </tr>
        <tr>
            <th>password:: </th>
            <th><input type="text" name="pwd"/></th>
        </tr>
        <tr>
            <th colspan="2"><input type="submit" value="Login"></th>
        </tr>
    </table>
</form>

<c:if test="${not empty errorMsg}">
    <h1 style="color:red;text-align:center">${errorMsg}</h1>
</c:if>