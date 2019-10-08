<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/7/2019
  Time: 11:51 PM
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
    .button-container {
        text-align: center;
    }
a{
    margin-left: 15px;

}
    .button {
        color: #fff !important;
        text-transform: uppercase;
        text-decoration: none;
        background-image: linear-gradient(to bottom right, brown, yellow);
        padding: 20px;
        border-radius: 5px;
        display: inline-block;
        border: none;
        transition: all 0.4s ease 0s;
    }
    .button:hover {
        background: #434343;
        letter-spacing: 1px;
        -webkit-box-shadow: 0px 5px 40px -10px rgba(0,0,0,0.57);
        -moz-box-shadow: 0px 5px 40px -10px rgba(0,0,0,0.57);
        box-shadow: 5px 40px  rgba(0,0,0,0.57);
        transition: all 0.4s ease 0s;
    }
    div{
        background-image: -webkit-linear-gradient(#8B4513,#cccccc);
        padding: 10px;
        border-radius: 7px;
    }
    div.conge{
        background-image: -webkit-linear-gradient(#8B4513,#cccccc);
        padding: 10px;
        margin-bottom: 5px;
        text-align: center;
        border-radius: 7px;
    }

</style>
<head>
    <title>Song View</title>
</head>
<body>
<div class="conge">
    <h1>Song List</h1>
</div>
<div>
<a href="save-song"><input type="submit" class="button" value="Add Song"></a>
    <a href="/"><input type="submit" class="button" value="Home"></a>
<table>

    <tr>
        <th>ID</th>
        <th>Tittle</th>
        <th>Singer</th>
    </tr>
    <tr>
<c:forEach items="${listSong}" var="songs">
    <td><c:out value="${songs.id}"></c:out></td>
    <td><c:out value="${songs.tittle}"></c:out></td>
    <td><c:out value="${songs.artist.name}"></c:out></td>

    </tr>
</c:forEach>
</table>
</div>
</body>
</html>
