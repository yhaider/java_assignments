<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Add Player</title>
	</head>
	<body>
		<div class="container">
			<h3>Add a Player</h3>
			<form method="post" action="/TeamRoster/add?id=<%= request.getParameter("id") %>">
				<label>
				First Name:<br>
				<input type="text" name="fname"><br>
				</label>
				<label>
				Last Name:<br>
				<input type="text" name="lname"><br>
				</label>
				<label>
				Age:<br>
				<input type="text" name="age"><br>
				</label>
				<input type="submit">
			</form>
		</div>
	</body>
</html>