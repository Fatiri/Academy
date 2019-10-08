<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/7/2019
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
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
    <title>Artist Form</title>
</head>
<body>
<%--@elvariable id="artist" type=""--%>
<c:form action="/add-form" method="post" modelAttribute="artist" >
      <label>ID</label>
       <c:input path="id"></c:input>
        <label>Name</label>
        <c:input path="name"></c:input>
    <label>Debut</label>
        <c:input path="debut"></c:input>
    <label>Born Place</label>
        <c:input path="bornPlace"></c:input>
      <input type="submit">
</c:form>
<a href="/artist" style="text-decoration: none" ><input type="submit" value="Back"></a>

</body>
</html>
