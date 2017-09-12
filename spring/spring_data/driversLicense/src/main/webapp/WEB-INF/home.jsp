<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Driver's License</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.all{
			margin: auto;
			text-align: center;	
		}
		h1{
			font: 100 60pt "Helvetica Neue", sans-serif;
		}
		b{
			font: 100 10pt "Helvetica Neue", sans-serif;
			margin-top: 40px;
		}
		a{
			font: 100 15pt "Helvetica Neue", sans-serif;
			text-decoration: none;
		}
		.everyone{
			margin: auto;
			text-align: center;	
			margin-top: 20px;
		}
		h3{
			font: 100 17pt "Helvetica Neue", sans-serif;
		}
		h4{
			font: 100 15pt "Helvetica Neue", sans-serif;
		}
		.license{
			margin: auto;
			text-align: center;
			padding: 10px;
			width: 200px;
			text-align: left;
			
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<h1>Welcome to Driver's License!</h1>
  		<b>🚗</b><br>
  		<a href="/persons/new">Create Person</a> || <a href="/licenses/new">Create License</a>
  		<div class="everyone">
  			<h3>All Licenses</h3>
  			<c:forEach items="${licenses}" var="license">
  				<div class="license">
  					<a href="/persons/${license.person.id}"><h4>▻ License <c:out value="${license.number}"/></h4></a>
  				</div>
			</c:forEach>
  		</div>
  	</div>
  </body>
</html>