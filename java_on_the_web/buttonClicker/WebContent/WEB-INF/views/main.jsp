<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Button Clicker</title>
	</head>
	<body>
		<div class="container">
			<h3>Button Clicker</h3>
			<p><b>Current Count:</b> <c:out value="${count}"></c:out></p>
			<p>Click the button and watch the count increase!</p>
			<a href="/ButtonClicker/counter"><button>Count++</button></a>
		</div>
		<!-- This displays the current count and whenever the button is clicked
		it reloads the page which then runs the method in our Main controller and increases
		the count in session. -->
		
	</body>
</html>