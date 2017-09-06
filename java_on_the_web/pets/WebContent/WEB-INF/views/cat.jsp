<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Display <c:out value="${cat.getName()}"></c:out> </title>
		<!-- Here you can see we use the cat that we make in the DisplayCat controller
		to grab methods associated with it. We also use JSTL to grab these methods. -->
	</head>
	<body>
		<h3>
			You created a cat!
		</h3>
		<p>
			<c:out value="${cat.showAffection()}"/>
		</p>
		<a href="/PetIntelligence/animals"><button>Back</button></a>
	</body>
</html>