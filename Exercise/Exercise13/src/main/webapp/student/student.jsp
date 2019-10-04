<%@ page import="com.enigma.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/4/2019
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ini Student</title>
</head>
<body>
<form action="student-submit" method="post">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="submit">

</form>

<c:forEach items="${kirim}" var="student">
    <h1><c:out value="${student.id}"/></h1>
    <h1><c:out value="${student.name}"/></h1>
</c:forEach>

</body>
</html>
