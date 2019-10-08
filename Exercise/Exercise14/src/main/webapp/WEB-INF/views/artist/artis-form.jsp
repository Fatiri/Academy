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
<head>
    <title>Artist Form</title>
</head>
<body>
<%--@elvariable id="artist" type=""--%>
<c:form action="/add-form" method="post" modelAttribute="artist" >
       <c:input path="id"></c:input>
        <c:input path="name"></c:input>
        <c:input path="debut"></c:input>
        <c:input path="bornPlace"></c:input>
      <input type="submit">
</c:form>
</body>
</html>
