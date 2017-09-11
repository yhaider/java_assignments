<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@page import="com.yasmeen.grouplanguages.models.Language" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Edit Language</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.all{
			margin-left: 200px;
			margin-top: 20px;
			width: 300px;
			border: 1px dashed grey;
			padding: 10px;
		}
		
		h3{
			font: 100 30pt "Helvetica Neue", sans-serif;
		}
		form{
			margin-top: 20px;
			font: 100 15pt "Helvetica Neue", sans-serif;
		}
		button{
			margin-top: 10px;
		}
		a{
			font: 100 12pt "Helvetica Neue", sans-serif;
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<h3>Edit <c:out value="${lang.langname}"/></h3>
  		<a href="/">Dashboard</a> || <a href="/languages/delete/${lang.id}">Delete</a>
  		<form:form method="POST" action="/languages/update/${lang.id}" modelAttribute="language">
    			<form:label path="langname">Language Name:
		    <form:errors path="langname"/><br>
		    <form:input type = "text" path="langname" value="${lang.langname}"/></form:label><br>
		    
		    <form:label path="creator">Creator:
		    <form:errors path="creator"/><br>
		    <form:input type="text" path="creator" value="${lang.creator}"/></form:label><br>
		    
		    <form:label path="version">Version:
		    <form:errors path="version"/><br>
		    <form:input type="text" path="version" value="${lang.version}"/></form:label><br>
		    
		    <button type=submit>Submit</button>
    		</form:form>
  	</div>
    
  </body>
</html>