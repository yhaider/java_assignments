<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Great Number Game</title>
		</head>
		<style>
		*{
			margin: 0px;
			padding: 0px;
		}
		.container{
			margin: auto;
			text-align: center;
			padding: 20px;
			width: 300px;
			margin-top: 200px;
		}
		.wrong {
			margin: auto;
			text-align: center;
			padding: 20px;
			width: 50px;
			background-color: red;
			margin-top: 20px;
			margin-bottom: 20px;
		}
		.correct {
			margin: auto;
			text-align: center;
			padding: 20px;
			width: 100px;
			background-color: green;
			margin-top: 20px;
			margin-bottom: 20px;
		}
		</style>
	<body>
		<div class="container">
			<h2>Welcome to the Great Number Game!</h2>
			<p><i>I'm thinking of a number between 1-100...take a guess!</i></p>
			<% String reslt = (String) session.getAttribute("result"); %>
			<% if(reslt == "Too high!" || reslt == "Too low!"){ %>
				<div class="wrong">
					<h4><%= reslt %></h4>
				</div>
			<% } else if(reslt == "Correct! Play again?"){ %>
				<div class="correct">
					<h4><%= reslt %></h4>
				</div>
			<% } %>
			<!-- This determines what to display based on the result in session -->
			<form method="post" action="/GreatNumberGame/play">
			<% if(reslt == null || reslt != "Correct! Play Again?") { %>
				<input type="text" name="guess"><br>
				<input type="submit">
			<% } %>
			</form>
		</div>
	
	</body>
</html>