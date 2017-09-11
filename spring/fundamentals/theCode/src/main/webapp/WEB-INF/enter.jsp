<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>The Code</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.all{
			margin: auto;
			text-align: center;
			margin-top: 40px;
			padding: 20px;
			border: 1px dashed grey;
			width: 400px;
		}
		h3{
			font: 100 20pt "Helvetica Neue", sans-serif;
		}
		input[type=text]{
			font: 100 15pt "Helvetica Neue", sans-serif;
		}
		button{
			font: 100 10pt "Helvetica Neue", sans-serif;
			padding: 5px 10px 5px 10px;
		}
		.red{
			color: red;
			font: 100 10pt "Helvetica Neue", sans-serif;
			font-style: italics;
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<h3>What is the code?</h3>
  		<% if(session.getAttribute("res") == "incorrect") { %>
  				<p class="red">You must train harder!</p>
  			<% } %>
  		<form method="POST" action="/process">
  			<input type="text" name="code"></input><br>
  			<button type="submit">Submit</button>
  		</form>
  	</div>
    
  </body>
</html>