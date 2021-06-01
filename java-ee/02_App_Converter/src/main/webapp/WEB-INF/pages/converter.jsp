<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${user ==null }">
	<c:redirect url="login" />
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Converter</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Page de conversion</h1>
	<form method="post">
		<p>
			<label for="temp">Temperature</label> <input id="temp" type="text"
				name="celsius" />
		</p>
		<p>
			<input type="submit" value="Convertir"> <input type="reset"
				value="Reset">
		</p>
	</form>
</body>
</html>