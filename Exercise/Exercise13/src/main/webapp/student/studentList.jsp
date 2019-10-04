<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/2/2019
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    table {
        border: 1px;
        border-style: solid;
        border-radius: 5px;
    }
</style>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>Birth Place</th>
        <th>Birth Date</th>
        <th>Gender</th>
    </tr>
<tr>
<c:forEach items="${requestScope.studentList}" var="student">
    <td><c:out value="${student.id}"/></td>
    <td><c:out value="${student.name}"/></td>

</tr>

</c:forEach>
</table>
</body>
</html>
