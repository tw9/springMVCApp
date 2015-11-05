<%--
  Created by IntelliJ IDEA.
  User: taylor
  Date: 7/21/15
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<script>
    function menufunc(){
        alert("hello");
    }
</script>

<head>
    <title></title>
</head>
<body>

<ul>

    <c:forEach items="${functions}" var="func">
        <a href="/finance/fhome" >home</a>
        <a onclick="menufunc()" > <c:out value="${func}"> </c:out></a> <br/>
    </c:forEach>
</ul>
<div>
</div>
</body>
</html>
