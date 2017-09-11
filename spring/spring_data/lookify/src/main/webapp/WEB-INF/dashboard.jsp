<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Lookify Dashboard</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
	</style>
  </head>
  <body>
  	<div class="header">
  		<h3>Lookify Dashboard</h3>
  		<a>Add Song</a> || <a>Top Songs</a> 
  		<form method="POST" action="/search">
  		Search: <input type="text"> <input type="submit" value="Search">
  		</form>
  	</div>
  	<div class="body">
  	</div>
  </body>
</html>