<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
	<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>
			You have visited <a href="/"></a><c:out value="${count}"></c:out> times.
		</h3>
		<h3>
			<a href="/">Test another</a>
		</h3>
		<form action="/reset">
			<button type="submit">
				Reset
			</button>
		</form>
		
	
	</body>
</html>