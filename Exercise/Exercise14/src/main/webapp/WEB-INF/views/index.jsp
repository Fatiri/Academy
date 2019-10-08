<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 10/7/2019
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Index</title>
</head>
<body>
<a href="/artist" style="text-decoration: none" ><input type="submit" value="Form Artist"></a>
<a href="/song" style="text-decoration: none" ><input type="submit" value="Form Song"></a>
</body>
</html>
