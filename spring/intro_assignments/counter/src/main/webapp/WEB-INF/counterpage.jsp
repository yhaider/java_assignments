<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Display Date</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.container{
			margin: auto;
			text-align: center;
			margin-top: 100px;
		}
		fieldset{
			width: 320px;
			padding: 10px;
			height: 120px;
			margin: auto;
			text-align: center;
		}

		legend{
			font: 100 20pt "Helvetica Neue", sans-serif;
			text-align: left;
			padding: 5px;
			text-decoration-style: wavy;
		}
		p{
			font: 100 15pt "Helvetica Neue", sans-serif;
			padding-bottom: 20px;
		}
		.container a{
			margin-left: 260px;
			font: 100 8pt "Helvetica Neue", sans-serif;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<fieldset>
			<legend>Counter</legend>
			<% Integer count = (Integer) session.getAttribute("count"); %>
			<p>You've navigated to the home page <c:out value="${count}"/> times.</p>
			<a href="/">Back</a>
			</fieldset>
		</div>
	</body>
</html>