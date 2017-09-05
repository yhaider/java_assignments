<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo JSP</title>
</head>
<body>
	<h1>Hello, world!</h1>
	<h3>I am learning how to use JSP files.</h3>
	
	<!-- getting the value for the name parameter -->
    <% String req = request.getParameter("name"); %>
    <!-- displaying the value -->
    <h1><%= req %></h1>
    
    <!-- Link http://localhost:8080/HelloWorld/demo.jsp?name=Yasmeen works! -->
</body>
</html>