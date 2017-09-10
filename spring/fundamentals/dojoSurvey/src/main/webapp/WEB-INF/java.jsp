<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Dojo Survey</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		h3{
			font: 100 20pt "Helvetica Neue", sans-serif;
			margin: auto;
			text-align: center;
		}
		.container{
			margin: auto;
			text-align: center;
		}
		.red{
			color: red;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		.orange{
			color: orange;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		.yellow{
			color: yellow;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		.green{
			color: green;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		.blue{
			color: blue;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		.purple{
			color: purple;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
		i{
			font-style: italics;
		}
		a{
			font: 100 8pt "Helvetica Neue", sans-serif;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<h3>Because you picked Java as your favourite language, you've reached this <i>special</i> page!</h3>
			<a href="/">Back...but why would you want to go back?</a>
			<% for(int i = 0; i < 50; i++){ %>
				<p><span class="red">Java rocks! </span><span class="orange">Java rocks! </span><span class="yellow">Java rocks! </span><span class="green">Java rocks! </span><span class="blue">Java rocks! </span><span class="purple">Java rocks! </span></p>
			<% } %>
		</div>
	</body>
</html>