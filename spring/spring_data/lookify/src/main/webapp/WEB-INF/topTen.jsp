<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Lookify: Top Ten</title>
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
		h3{
			font: 100 20pt "Helvetica Neue", sans-serif;
			margin-bottom: 10px;
		}
		a{
			text-decoration: none;
			font: 100 15pt "Helvetica Neue", sans-serif;
			margin-bottom: 10px;
		}
		p{
			font: 100 15pt "Helvetica Neue", sans-serif;
		}
		i{
			color: grey;
		}
		.small{
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<a href="/dash" class="small">Dashboard</a>
  		<h3>Top Ten Songs</h3>
  		<c:forEach items="${songs}" var="song">
			<p> <c:out value="${song.rating}" /> - <a href="/songs/${song.id}"><c:out value="${song.title}"/></a> - <c:out value="${song.artist}"/> </p>
		</c:forEach>
  	</div>
  </body>
 </html>