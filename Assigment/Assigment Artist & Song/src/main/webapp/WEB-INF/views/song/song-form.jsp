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

<style>
    input, label{
        margin-top: 1px;
        border-radius: 2px;
        position: relative;

        display: flex;
        width: 60%;

    }
    input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=submit] {
        width: 100%;
        background-image: linear-gradient(to bottom right, brown, yellow);
        color: white;
        padding: 14px ;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        text-align: center;
        padding-left: 50%;

    }

    input[type=submit]:hover {
        background-image: linear-gradient(to bottom right, brown, yellow);

    }

</style>
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

<a href="/song" style="text-decoration: none" ><input type="submit" value="Back"></a>
</body>
</html>
