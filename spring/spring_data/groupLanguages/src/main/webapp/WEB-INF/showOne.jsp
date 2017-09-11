<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Display Language</title>
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
		a{
			font: 100 12pt "Helvetica Neue", sans-serif;
		}
		p{
			font: 100 20pt "Helvetica Neue", sans-serif;
			margin-top: 20px;
		}
		i{
			color: grey;
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<h3>About <c:out value="${lang.langname}"/></h3>
  		<a href="/">Dashboard</a> || <a href="/languages/update/${lang.id}">Edit</a> || <a href="/languages/delete/${lang.id}">Delete</a>
  		<p>Creator: <i><c:out value="${lang.creator}"/></i></p>
  		<p>Version: <i><c:out value="${lang.version}"/></i></p>
  	</div>
    
  </body>
</html>