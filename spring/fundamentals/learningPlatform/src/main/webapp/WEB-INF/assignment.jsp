<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Lesson</title>
	 
  </head>
  <body>
    <div class="header">
    		<h3>Fortran</h3>
    		<a href="/m/38/0553/733">Set Up</a> || <a href="/m/38/0483/345">Forms</a> || <a href="/m/38/0553/342">Cards</a> || <a href="/m/26/0553/347">Advanced</a> || <a href="/m/26/0483/2342">Binary</a><br>
    		<input id="checkBox" type="checkbox"> Assignment Complete
    </div>
    <div class="container">
    		<% if((String) request.getAttribute("assn") == "cf") { %>
    			<p>The goal of this assignment is to set up forms!</p>
    		<% } else if( (String) request.getAttribute("assn") == "ftb") { %>
    			<p>The goal of this assignment is to change fortran to binary!</p>
    		<% } %>
    		<p></p>
    </div>
  </body>
</html>