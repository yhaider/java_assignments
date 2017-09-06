<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Display <c:out value="${dog.getName()}"></c:out></title>
		<!-- Here you can see we use the cat that we make in the DisplayDog controller
		to grab methods associated with it. We also use JSTL to grab these methods. -->
	</head>
	<body>
		<h3>
			You created a dog!
		</h3>
		<p>
			<c:out value="${dog.showAffection()}"/>
		</p>
		<a href="/PetIntelligence/animals"><button>Back</button></a>
	</body>
</html>