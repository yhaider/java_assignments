<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Ninja: New</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		
		.form{
			margin-top: 20px;
			margin-left: 200px;
			width: 300px;
			text-align: left;
			font: 100 12pt "Helvetica Neue", sans-serif;
		}
		h4{
			font: 100 20pt "Helvetica Neue", sans-serif;
			margin-bottom: 10px;
		}
		button{
			font: 100 10pt "Helvetica Neue", sans-serif;
			padding: 5px 10px 5px 10px;
			margin-top: 10px;
		}
		.errs{
			margin-top: 20px;
			margin-left: 200px;
			width: 300px;
		}
		legend{
			font: 100 15pt "Helvetica Neue", sans-serif;
			margin-left: 10px;
		}
		.errs p{
			font: 100 10pt "Helvetica Neue", sans-serif;
			margin-left: 10px;
			padding: 10px;
		}
	</style>
  </head>
  <body>
    <div class="form">
    		<form:form method="POST" action="/ninjas/new" modelAttribute="ninja">
    			<h4>Create Ninja</h4>
    			<form:label path="dojo">Dojo Name:
		    <form:errors path="dojo"/><br>
		    <form:select path="dojo">
		    		<c:forEach items="${dojos}" var="dojo">
					<form:option value="${dojo.id}">${dojo.name}</form:option>
				</c:forEach>
		    </form:select></form:label><br>
		    
		    <form:label path="first_name">First Name:
		    <form:errors path="first_name"/><br>
		    <form:input type="text" path="first_name"/></form:label><br>
		    
		    <form:label path="last_name">Last Name:
		    <form:errors path="last_name"/><br>
		    <form:input type="text" path="last_name"/></form:label><br>
		    
		    <form:label path="age">Age:
		    <form:errors path="age"/><br>
		    <form:input type="number" path="age"/></form:label><br>
		    
		    <button type=submit>Submit</button> 
    		</form:form>
    		<a href="/">Back</a>
    </div>
    <div class="errs">
    		<% if(request.getAttribute("errs") != null) { %>
	  		<fieldset>
	  			<legend>Errors</legend>
	  			<c:forEach items="${errs}" var="err">
					<p><c:out value="${err.getDefaultMessage()}"/></p>
				</c:forEach>
	  		</fieldset>
	  	<% } %>
    </div>
  </body>
</html>