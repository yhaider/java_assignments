<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Hello!</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit
		}
		
		h1{
			margin: auto;
			text-align: center;
			font: 100 40pt "Helvetica Neue", sans-serif;
		}
		
		h3{
			margin: auto;
			text-align: center;
			font: 100 20pt "Helvetica Neue", sans-serif;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<h1>Hello <c:out value="${firstname}"/> <c:out value="${lastname}"/>!</h1>
			<h3>Welcome to Spring boot! This application is very basic and was made to learn how to use routing and query parameters.</h3>
		</div>
	</body>
</html>