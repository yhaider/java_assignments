<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Lookify: Add Song</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.form{
			margin-top: 20px;
			margin-left: 200px;
			font: 100 15pt "Helvetica Neue", sans-serif;
		}
		h4{
			font: 100 20pt "Helvetica Neue", sans-serif;
		}
		button{
			font: 100 10pt "Helvetica Neue", sans-serif;
			padding: 3px 7px 3px 7px;
			margin-top: 10px;
		}
		a{
			font: 100 10pt "Helvetica Neue", sans-serif;
			text-decoration: none;
		}
	</style>
  </head>
  <body>
  		<div class="form">
    		<form:form method="POST" action="/add" modelAttribute="song">
    			<h4>Add a Song</h4>
    			<a href="/dash">Back</a><br>
    			<form:label path="title">Title:
		    <form:errors path="title"/><br>
		    <form:input type = "text" path="title"/></form:label><br>
		    
		    <form:label path="artist">Artist:
		    <form:errors path="artist"/><br>
		    <form:input type="text" path="artist"/></form:label><br>
		    
		    <form:label path="rating">Rating:
		    <form:errors path="rating"/>
		    <form:select path="rating">
		    		<% for(int i = 1; i <= 10; i++) { %>
		    			<form:option value="<%=i %>"><%= i %></form:option>
		    		<% } %>
		    </form:select></form:label><br>
		    
		    <button type=submit>Add</button>
    		</form:form>
  	</div>
  </body>
</html>