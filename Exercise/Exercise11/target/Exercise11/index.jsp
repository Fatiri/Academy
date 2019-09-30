<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<link href="CSS/style.css" rel="stylesheet" type="text/css" />
<head>
<title>Hello World!</title>
</head>
<body>
<div>
<h1>ROBOT ECHI</h1>
 </div>
<form action="positionRobot.php" methode="post">
<label for="fname">Koordinat</label>
    <input type="text" id="lname" name="inputCoordinat" placeholder="Input Kordinat Awal">

                <label for="fname">Bensin</label>
                <input type="text" id="fname" name="inputBensin" placeholder="Input Bensin !">

                <label for="lname">Direction</label>
                <input type="text" id="lname" name="inputIntruksi" placeholder="Input Direksi">


<input type="submit"/>
</form>

</body>
</html>
