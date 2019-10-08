<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/7/2019
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    table, tr, th, td{
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
<head>
    <title>Title</title>
</head>
<body>
<a href="add-form" ><button>duarr </button></a>
<br/>
<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Debut</th>
    <th>Born Place</th>
    <th>Detail</th>
</tr>
    <tr>
<c:forEach items="${artistList}" var="artist">

    <td><c:out value="${artist.id}"></c:out></td>
    <td><c:out value="${artist.name}"></c:out></td>
    <td><c:out value="${artist.debut}"></c:out></td>
    <td><c:out value="${artist.bornPlace}"></c:out></td>
    <td><a href="get-artist?id=${artist.id}" style="text-decoration: none">Detail</a> </td>

</tr>

</c:forEach>
</table>
</body>
</html>
