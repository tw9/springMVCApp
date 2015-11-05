<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h1>${message}</h1>
    <form action="/login" method="post">
    <table>
        <tr>
            <td> User </td>
            <td> : </td>
            <td> <input type="text" name="username" /> </td>
        </tr>
        <tr>
            <td> Password </td>
            <td> : </td>
            <td> <input type="password" name="password" /> </td>
        </tr>
        <tr>
            <td colspan="2"> </td>
            <td>
                <input type="submit" value="Sign In" />
                <input type="reset" value="Redo"/>
            </td>
        </tr>
        <span style="color: red;">${info}</span>
    </table>
    </form>
</body>
</html>