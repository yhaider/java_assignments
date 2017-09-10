<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Dojo Survey</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
		}
		h3{
			font: 100 20pt "Helvetica Neue", sans-serif;
			margin: auto;
			text-align: center;
		}
		a{
			font: 100 7pt "Helvetica Neue", sans-serif;
		}
		p{
			font: 100 10pt "Helvetica Neue", sans-serif;
			text-align: left;
		}
		.container{
			margin: auto;
			text-align: center;
			width: 400px;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<h3>Results</h3>
			<p><b>Name:</b> <%= session.getAttribute("name") %></p>
			<p><b>Location:</b> <%= session.getAttribute("location") %></p>
			<p><b>Favourite Language:</b> <%= session.getAttribute("lang") %></p>
			<p><b>Comment:</b> <%= session.getAttribute("comment") %></p>
			<a href="/">Back</a>
		</div>
	</body>
</html>