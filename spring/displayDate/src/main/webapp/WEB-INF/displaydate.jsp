<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
			width: 500px;
			padding: 10px;
			height: 150px;
			margin: auto;
			text-align: center;
		}

		legend{
			font: 100 20pt "Helvetica Neue", sans-serif;
			text-align: left;
			padding: 5px;
		}
		p{
			font: 100 15pt "Helvetica Neue", sans-serif;
			padding-bottom: 20px;
		}
		.container a{
			text-align: right;
			font: 100 10pt "Helvetica Neue", sans-serif;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<fieldset>
			<legend>Date</legend>
			<c:set var = "now" value = "${date}" />
			<p>Today is: <fmt:formatDate pattern = "EEEEEE" value = "${now}"/>, the <fmt:formatDate pattern = "dd" value = "${now}"/> of <fmt:formatDate pattern = "MMMM" value = "${now}" />, <fmt:formatDate pattern = "yyyy" value = "${now}" /></p>
			<a href="/">Back</a>
			</fieldset>
		</div>
	</body>
</html>