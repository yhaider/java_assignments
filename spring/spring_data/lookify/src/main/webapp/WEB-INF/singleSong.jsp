<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Lookify: Show One</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.all{
			margin-top: 20px;
			margin-left: 200px;
		}
		a{
			text-decoration: none;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		p{
			font: 100 15pt "Helvetica Neue", sans-serif;
			padding: 5px;
		}
		i{
			color: grey;
		}
		.space{
			padding-bottom: 10px;
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<a href="/dash" class="space">Dashboard</a><br>
  		<p>Title: <i><c:out value="${song.title}"/></i></p>
  		<p>Artist: <i><c:out value="${song.artist}"/></i></p>
  		<p>Rating: <i><c:out value="${song.rating}"/></i></p>
  		<a href="/delete/${song.id}">Delete</a>
  	</div>
  </body>
 </html>