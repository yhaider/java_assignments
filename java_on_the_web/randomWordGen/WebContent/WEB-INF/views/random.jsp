<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Random Word Generator</title>
	</head>
	<body>
		<div class="container">
			<p>You have generated a word <c:out value="${count}"></c:out> times.</p>
			<h3>Random Word Generator</h3>
			<p><b>Your random word is: </b><c:out value="${randword}"></c:out></p>
			<p><b>The last time you generated a word was: </b><c:out value="${date}"></c:out></p>
			<a href="/RandomWordGen/random"><button>Generate</button></a>
		</div>
	</body>
</html>