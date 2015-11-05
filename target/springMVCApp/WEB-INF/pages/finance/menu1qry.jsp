<%--
  Created by IntelliJ IDEA.
  User: taylor
  Date: 7/21/15
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<span>${currentMenuName}</span>

<form action="/queryReport" method="post">
    <table>
        <tr>
            <td> 报表日期</td>
            <td> : </td>
            <td> <input type="text" name="repdate" /> </td>
        </tr>
        <tr>
            <td colspan="2"> </td>
            <td>
                <input type="submit" value="查詢" />
            </td>
        </tr>
    </table>
</form>


</body>
</html>
