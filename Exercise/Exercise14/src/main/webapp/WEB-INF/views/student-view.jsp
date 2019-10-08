<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/7/2019
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student View</title>
</head>

<body>

<h1>${x.toString()}</h1>
<h1>ID : ${x.id}</h1>
<h1>Name : ${x.name}</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
<%--    mengambil variable dan di beri alias students--%>

    <c:forEach items="${studentList}" var="students">
       <tr>
       <td> <c:out value="${students.id}"></c:out></td>
        <td><c:out value="${students.name}"></c:out></td>
           <td><a href="/song-form" style="text-decoration: none">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
