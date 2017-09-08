<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Display Date</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.container{
			margin: auto;
			text-align: center;
			margin-top: 30px;
		}
		h3{
			font: 100 30pt "Helvetica Neue", sans-serif;
			
		}
		p{
			font: 100 15pt "Helvetica Neue", sans-serif;
			padding-bottom: 20px;
		}
		
		a{
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<h3>Welcome to the Counter Page!</h3>
			<p>This is the page that we use for our counter. Navigate to '/counter' to view the count!</p>
			<p><a href="/counter">To Counter!</a>
		</div>
	</body>
</html>