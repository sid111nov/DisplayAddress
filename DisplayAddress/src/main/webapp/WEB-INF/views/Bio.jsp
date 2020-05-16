<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Give us your Age, Weight, Height</h1>
<h1>Welcome ${name.firstname}  ${name.lastname} </h1>
<form action="Bio" method="POST">
 Age: <input type="text" name="age"></br>
  Weight: <input type="number" name="weight">
  <select id="weightunit" name="weightunit">
    <option value="kg">Kg</option>
    <option value="Lb">Lb</option>
    
  </select></br>
  Height: <input type="number" name="height"> Unit: <input type="text" name="heightunit"></br>
  
  <input type="submit" value="Submit">
	
</form>
</body>
</html>