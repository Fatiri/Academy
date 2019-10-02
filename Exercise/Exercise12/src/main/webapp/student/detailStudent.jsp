<%@ page import="com.enigma.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="com.enigma.Dao.StudentDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>

    table{
        margin-top: 1%;
        border-radius: 5px;
        margin-left: 1%;
        width: 98%;
        overflow: hidden;
        border: 0px;
        border-style: none;
        text-align: center;
    }

    tr{
        width: 90px;
        height: 30px;
        font-family: Georgia, 'Times New Roman', Times, serif
    }
    th, td {
        width: 82px;
        height: 25px;
    }
    th{
        background-image: linear-gradient(to bottom right, brown, yellow);
    }

    td{
        background-color:	#D2B48C;
    }

</style>
<header>
</header>

<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Birth Place</th>
        <th>Birth Date</th>
        <th>Gender</th>
    </tr>
    <%
        Student students = (Student) request.getAttribute("studentdao");
    %>

    <tr>
        <td> <%= students.getId() %></td>
        <td> <%= students.getName() %></td>
        <td> <%= students.getBirthPlace() %></td>
        <td> <%= students.getBirthDate() %></td>
        <td> <%= students.getGender() %></td>

    </tr>
</table>
</body>
</html>