<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/8/2019
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Song Input</title>
</head>
<body>
<c:form action="save-song" method="post" modelAttribute="song">
    <c:input path="id"></c:input>
    <c:input path="tittle"></c:input>

    <c:select path="artist">
    <d:forEach items="${artisan}" var="artists">
        <c:option value="${artists.id}">${artists.name}</c:option>
    </d:forEach>
    </c:select>
    <input type="submit">
</c:form>
</body>
</html>
