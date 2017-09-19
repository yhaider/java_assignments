<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*"%>
<%@page import="com.yasmeen.admindashboard.models.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page</title>
<style>
	table{
		border: 1px solid black;
	}
	td, th{
		padding: 10px;
		border: 1px solid black;
	}
</style>
</head>
<body>
    <h1>Welcome <c:out value="${currentUser.first_name}"></c:out>!</h1>
    <table>
    		<tr>
    			<th>Name</th>
    			<th>Email</th>
    			<th>Actions</th>
    		</tr>
    		<% List<User> all = (List<User>) request.getAttribute("all"); %>
    		<% for(int i = 0; i < all.size(); i++) { %>
    			<% User user = all.get(i); %>
    				<tr>
    					<td><%= user.getFirst_name() %> <%= user.getLast_name() %></td>
    					<td><%= user.getEmail() %></td>
    					<% if(!user.checkIfAdmin()) { %>
    						<td><a href="/user/delete/<%= user.getId()%>">Delete</a> || <a href="/user/admin/<%= user.getId()%>">Promote to Admin</a></td>
    					<% } else { %>
    						<td> Admin Status || <a href="/user/demote/<%= user.getId()%>">Demote to User</a></td>
    					<% } %>
    				</tr>
    		<% } %>
    </table>
    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
</body>
</html>