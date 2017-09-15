<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
</head>
<body>
    <h1>Welcome <c:out value="${currentUser.first_name}"></c:out>!</h1>
    <p><b>First Name: </b> <c:out value="${currentUser.first_name}"></c:out></p>
    <p><b>Last Name: </b> <c:out value="${currentUser.last_name}"></c:out></p>
    <p><b>Email: </b> <c:out value="${currentUser.email}"></c:out></p>
    <p><b>Sign Up: </b> <fmt:formatDate pattern = "EEEEEE, 'the' dd 'of' MMMM, yyyy"  value = "${currentUser.createdAt}"/></p>
    <p><b>Last Sign On: </b> <fmt:formatDate pattern = "EEEEEE, 'the' dd 'of' MMMM, yyyy"  value = "${currentUser.createdAt}"/></p>
    
    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
</body>
</html>