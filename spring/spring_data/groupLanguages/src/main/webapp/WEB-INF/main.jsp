<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.yasmeen.grouplanguages.models.Language" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Group Languages</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		
		.all{
			width: 600px;
			margin-left: 200px;
		}
		h3{
			font: 100 40pt "Helvetica Neue", sans-serif;
			margin-bottom: 10px;
		}
		th{
			font: 100 17pt "Helvetica Neue", sans-serif;
			padding: 10px;
			border: 1px solid black;
		}
		td{
			font: 100 12pt "Helvetica Neue", sans-serif;
			padding: 10px;
			border:1px solid black;
			width: 250px;
		}
		table{
			border: 1px solid black;
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
	</style>
  </head>
  <body>
  	<div class="all">
  		<h3>Computer Languages</h3>
  		<table>
  			<tr>
  				<th>Name</th>
  				<th>Creator</th>
  				<th>Version</th>
  				<th>Actions</th>
  			</tr>
  			<c:forEach items="${langs}" var="lang">
			    <tr>    
			    <td><a href="/languages/${lang.id}"><c:out value="${lang.langname}"/></a></td>
			    <td><c:out value="${lang.creator}"/></td>
			    <td><c:out value="${lang.version}"/></td>
			    <td><a href="/languages/update/${lang.id}">Edit</a> || <a href="/languages/delete/${lang.id}">Delete</a></td>
			    </tr>
			</c:forEach>
  		</table>
  	</div>
    <div class="form">
    		<form:form method="POST" action="/languages/add" modelAttribute="language">
    			<h4>Add a Language</h4>
    			<form:label path="langname">Language Name:
		    <form:errors path="langname"/><br>
		    <form:input type = "text" path="langname"/></form:label><br>
		    
		    <form:label path="creator">Creator:
		    <form:errors path="creator"/><br>
		    <form:input type="text" path="creator"/></form:label><br>
		    
		    <form:label path="version">Version:
		    <form:errors path="version"/><br>
		    <form:input type="text" path="version"/></form:label><br>
		    
		    <button type=submit>Submit</button>
    		</form:form>
    </div>
  </body>
</html>