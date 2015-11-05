<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: taylor
  Date: 7/16/15
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
    function  alertmenu( menuid,menuname){
        window.location.href='/menuactive?menuid='+menuid+'&menuname='+menuname;
    }


</script>

<head>
    <title>WELCOME</title>
</head>
<body>

<div id="menu" style="background-color: #c9fad8 ; width: 20% ; height: 500% ; float: left ">


    <ul>

        <c:forEach items="${menus}" var="menu">
            <li  onclick="alertmenu('${menu.menuid}','${menu.menuname}')">  <c:out value="${menu.menuname}"></c:out>  </li>
        </c:forEach>
    </ul>


</div>


<div id="context" style="background-color:azure;width: 80% ; float: left ">
    <iframe name="mainframe"  style="height: 500%" frameborder="0"  src="/showMenuContext?currentMenu=${currentMenu}" > </iframe>
</div>

</body>
</html>
