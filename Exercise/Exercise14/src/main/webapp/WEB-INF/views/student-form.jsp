<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/7/2019
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<link href="../css/style.css" rel="stylesheet" type="text/css"/>
<head>
    <title>Student Form</title>
</head>
<body>


<%--<form action="student" method="post" >--%>
<%--    <input type="text" name="id"/>--%>
<%--    <input type="text" name="name"/>--%>
<%--    <input type="submit">--%>
<%--</form>--%>


<div>
<div class="satu">

<%--@elvariable id="student" type=""--%>
<c:form action="student" method="post" modelAttribute="student">

    <c:input path="id"></c:input>

    <c:input path="name"></c:input>

    <input type="submit">
</c:form>

</div>
</div>
</body>
</html>
