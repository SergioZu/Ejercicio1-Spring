<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Introduzca un nombre para saber cuantos coches tiene:</h1>

	<form action="http://localhost:8080/Coches" method="POST">
		<input type="text" placeholder="nombre" name="nombre"> <input type="submit">
	</form>


</body>
</html>