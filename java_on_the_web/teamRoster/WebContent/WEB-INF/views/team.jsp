<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.yasmeen.tr.models.Team" %>
<%@ page import="com.yasmeen.tr.models.Player" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Team</title>
	</head>
	<body>
		<% if(request.getParameter("id") == null){ %>
		<div class="form">
			<form method="post" action="/TeamRoster/teams">
				<h3>Create a Team</h3>
				<label>
				Team Name:<br>
				<input type="text" name="teamname"><br>
				</label>
				<input type="submit">
			</form>
		</div>
		<% } else { %>
		<div class="team">
			<% ArrayList<Team> teams =  (ArrayList<Team>) session.getAttribute("all"); %>
			<% Team display = teams.get(Integer.parseInt(request.getParameter("id"))); %>
			<h3><%= display.getName() %></h3>
			<a href="/TeamRoster/add?id=<%= display.getId()%>">Add Player</a>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Actions</th>
				</tr>
				<% for(Player p : display.getTeam()) { %>
					<tr>
						<td><%= p.getFirstName() %></td>
						<td><%= p.getLastName() %></td>
						<td><%= p.getAge() %></td>
						<td><a href="/TeamRoster/teams?id=<%= display.getId()%>&playerid=<%= p.getId()%>">Delete</a></td>
					</tr>
				<% } %>
			</table>
		</div>
		<% } %>
		<a href="/TeamRoster/main">Back</a>
	</body>
</html>