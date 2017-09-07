<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.yasmeen.tr.models.Team" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Teams</title>
	</head>
	<body>
		<div class="container">
			<div class="head">
			<h3>All Teams</h3>
			<a href="">New Team</a>
			</div>
			<table>
				<tr>
					<th>Team</th>
					<th>Players</th>
					<th>Action</th>
				</tr>
				<% ArrayList<Team> teams =  (ArrayList<Team>) session.getAttribute("all"); %>
				<% for(Team team : teams){ %>
					<tr>
						<td><%= team.getName() %></td>
						<td><%= team.getNum() %></td>
						<td><a>Details</a> <a>Delete</a></td>
					</tr>
				<% } %>
			</table>
		</div>
	</body>
</html>