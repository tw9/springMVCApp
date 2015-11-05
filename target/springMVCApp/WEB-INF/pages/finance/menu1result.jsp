<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<table  border="1px" >
   <thead>
        <tr>
            <td>col1</td>
            <td>col2</td>
            <td>col3</td>
            <td>col4</td>
            <td>col5</td>
        </tr>
   </thead>
    <tbody>
    <c:forEach items="${Results}" var="result">
        <tr>
            <td>${result.col1}</td>
            <td>${result.col2}</td>
            <td>${result.col3}</td>
            <td>${result.col4}</td>
            <td>${result.col5}</td>
        </tr>
    </c:forEach>



    </tbody>
</table>

</body>
</html>
