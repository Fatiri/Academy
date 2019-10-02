<%@ page import="java.util.List" %>
<%@ page import="com.enigma.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/1/2019
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="input.pl" method="post"> <input type="submit" value="Submit"></form>

</div>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Birth Place</th>
        <th>Birth Date</th>
        <th>Gender</th>
        <th>Detail</th>
    </tr>
    <% List<Student> students = (List<Student>) request.getAttribute("students");
        for (Student student: students) {

    %>
    <tr>
        <td> <%= student.getId()%></td>
        <td> <%= student.getName()%></td>
        <td> <%= student.getBirthPlace()%></td>
        <td> <%= student.getBirthDate()%></td>
        <td> <%= student.getGender()%></td>
        <td> <a href="student-detail.pl?id=<%=student.getId()%>">Detail</a></td>
        <%}%>
    </tr>
</table>

</body>
</html>
