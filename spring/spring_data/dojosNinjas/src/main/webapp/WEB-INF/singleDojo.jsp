<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Show Dojo</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.all{
			margin-top: 20px;
			margin-left: 200px;
		}
		h3{
			font: 100 30pt "Helvetica Neue", sans-serif;
		}
		.header{
			font: 100 15pt "Helvetica Neue", sans-serif;
		}
		form{
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		button{
			margin-top: 10px;
			padding: 3px 7px 3px 7px;
			font: 100 8pt "Helvetica Neue", sans-serif;
			margin-bottom: 20px;
		}
		table{
			border: 1px solid black;
		}
		th{
			border: 1px solid black;
			font: 100 20pt "Helvetica Neue", sans-serif;
			padding: 10px;
		}
		td{
			border: 1px solid black;
			font: 100 15pt "Helvetica Neue", sans-serif;
			padding: 10px;
		}
		a{
			text-decoration: none;
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<div class="header">
	  		<h3><c:out value="${dojo.name}"/> Ninjas</h3>
	  		<a href="/ninjas/new">Add Ninja</a> || <a href="/">Back</a> 
  		</div>
  		<div class="body">
  			<table>
  				<tr>
  					<th>First Name</th>
  					<th>Last Name</th>
  					<th>Age</th>
  				</tr>
  				<c:forEach items="${ninjas}" var="ninja">
			    		<tr>    
			    			<td><c:out value="${ninja.first_name}"/></td>
			    			<td><c:out value="${ninja.last_name}"/></td>
			    			<td><c:out value="${ninja.age}"/></td>
			    		</tr>
				</c:forEach>
  			</table>
  		</div>
  	</div>
  </body>
</html>