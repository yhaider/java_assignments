<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Lesson</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.all{
			margin: auto;
			text-align: center;
			width: 600px;
			margin-top: 20px;
			padding: 20px;
			border: 1px dashed grey;
		}
		.header{
			font: 100 10pt "Helvetica Neue", sans-serif;
			text-align: left;
		}
		h3{
			font: 100 20pt "Helvetica Neue", sans-serif;
		}
		p{
			margin: 20px;
			text-align: left;
			font: 100 12pt "Helvetica Neue", sans-serif;
			padding: 20px;
			border: 1px solid black;
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<div class="header">
	    		<h3>Fortran</h3>
	    		<a href="/m/38/0553/733">Set Up</a> || <a href="/m/38/0483/345">Forms</a> || <a href="/m/38/0553/342">Cards</a> || <a href="/m/26/0553/348">Advanced</a> || <a href="/m/26/0483/2342">Binary</a>
   		</div>
	    <div class="container">
	    		<% if((boolean) request.getAttribute("home") == true) { %>
	    			<p>Welcome to the home page. Click the links to navigate.</p>
	    		<% } else if((String) request.getAttribute("lsn") == "set") { %>
	    			<p>This lesson is to teach you set up!</p>
	    		<% } else if( (String) request.getAttribute("lsn") == "cards") { %>
	    			<p>This lesson is to teach you punch cards!</p>
	    		<% } else if( (String) request.getAttribute("lsn") == "adv") { %>
	    			<p>This lesson is to teach you advanced fortran!</p>
	    		<% } %>
	    </div>
  	</div>
    
  </body>
</html>