<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Lookify: Dashboard</title>
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
	  		<h3>Lookify: Dashboard</h3>
	  		<a href="/add">Add Song</a> || <a href="/top">Top Songs</a> 
	  		<form method="POST" action="/search">
	  		Search: <input type="text"> <button type="submit">Search</button><a href="/reset"><button>Reset</button></a>
	  		</form>
  		</div>
  		<div class="body">
  			<table>
  				<tr>
  					<th>Title</th>
  					<th>Rating</th>
  					<th>Actions</th>
  				</tr>
  				<c:forEach items="${songs}" var="song">
			    		<tr>    
			    			<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
			    			<td><c:out value="${song.rating}"/></td>
			    			<td><a href="/delete/${song.id}">Delete</a></td>
			    		</tr>
				</c:forEach>
  			</table>
  		</div>
  	</div>
  </body>
</html>