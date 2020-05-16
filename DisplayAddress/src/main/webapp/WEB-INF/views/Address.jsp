<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome ${name.firstname}  ${name.lastname} </h1>
<h1>You are ${bio.age} old and weigh   ${bio.weight}${bio.weightunit} and are ${bio.height}${bio.heightunit} tall</h1>
<h1>Give Us Address Details</h1>
<form action="Address" method="POST">
 Country: <input type="text" name="country"></br>
 State: <input type="text" name="state"></br>
 City:<input type="text" name="city"></br>
 Pin/Zip Code: <input type="text" name="pincode"></br>
 <input type="submit" value="Submit">

</form>
</body>
</html>