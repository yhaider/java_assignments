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
			margin-top: 30px;
		}
		h3{
			font: 100 30pt "Helvetica Neue", sans-serif;
			
		}
		.options{
			display: inline-flex;
			text-align: center;
			margin: auto;
		}
		fieldset{
			width: 200px;
			margin: 10px;
			height: 70px;
		}
		.options a{
			font: 100 12pt "Helvetica Neue", sans-serif;
		}
		legend{
			font: 100 20pt "Helvetica Neue", sans-serif;
		}
		p{
			font: 100 15pt "Helvetica Neue", sans-serif;
			padding-bottom: 20px;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<h3>Display Date</h3>
			<p>Click on the links below to view the date and the time!</p>
			<div class="options">
				<fieldset>
				<legend>Date Template</legend>
					<a href="/date">Click Here</a>
				</fieldset>
				<fieldset>
				<legend>Time Template</legend>
					<a href="/time">Click Here</a>
				</fieldset>
			</div>
		</div>
	</body>
</html>