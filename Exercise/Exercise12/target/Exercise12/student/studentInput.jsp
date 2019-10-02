<%@ page contentType="text/html;charset=utf-8" language="java" %>
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
        padding-left: 4%;
    }

    input[type=submit]:hover {
        background-image: linear-gradient(to bottom right, brown, yellow);
    }
</style>
<head>
    <title>Hello World!</title>
</head>
<body>
<div>
    <h1>ROBOT ECHI</h1>
</div>
<form action="student-input.pl" methode="post">
    <label for="fname">Input ID</label>
    <input type="text" id="lnames" name="ID" placeholder="Input ID)">

    <label for="fname">Input Name</label>
    <input type="text" id="fname" name="name" placeholder="Input Name !">

    <label for="lname">Input Birth Place</label>
    <input type="text" id="lname" name="birthPlace" placeholder="Input Birh Place">

    <label for="lname">Input Birth Date</label>
    <input type="text" id="lname2" name="birthDate" placeholder="Input Birh Date (yyyy-mm-dd)">

    <label for="lname">Input Gender</label>
    <input type="text" id="lname3" name="gender" placeholder="Input Gender">


    <input type="submit"/>

</form>

</body>
</html>
