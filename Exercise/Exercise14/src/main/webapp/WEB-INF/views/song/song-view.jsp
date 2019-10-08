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
<head>
    <title>Song View</title>
</head>
<body>
<a href="save-song"><input type="submit" value="Add Song"></a>

<c:forEach items="${listSong}" var="songs">
    <c:out value="${songs.id}"></c:out>
    <c:out value="${songs.tittle}"></c:out>
    <c:out value="${songs.artist.name}"></c:out>


</c:forEach>
</body>
</html>
