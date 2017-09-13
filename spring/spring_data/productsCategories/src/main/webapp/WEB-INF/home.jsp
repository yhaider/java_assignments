<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Products and Categories</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.all{
			margin: auto;
			text-align: center;	
			font: 100 20pt "Helvetica Neue", sans-serif;
		}
		h1{
			font: 100 60pt "Helvetica Neue", sans-serif;
		}
		a{
			font: 100 15pt "Helvetica Neue", sans-serif;
			text-decoration: none;
		}
		.everyone{
			margin: auto;
			text-align: center;	
			margin-top: 20px;
		}
		h3{
			font: 100 17pt "Helvetica Neue", sans-serif;
		}
		h4{
			font: 100 15pt "Helvetica Neue", sans-serif;
		}
		.dojo{
			margin: auto;
			text-align: center;
			padding: 10px;
			width: 200px;
			text-align: left;
			
		}
	</style>
  </head>
  <body>
  	<div class="all">
  		<h1>Welcome to Products and Categories!</h1>
  		<a href="/products/new">Create Product</a> || <a href="/categories/new">Create Category</a>
  		<div class="everyone">
  			<h3>All Products</h3>
  			<c:forEach items="${products}" var="product">
  				<div class="dojo">
  					<a href="/dojos/${product.id}"><h4>▻ <c:out value="${product.name}"/></h4></a>
  				</div>
			</c:forEach>
  		</div>
  	</div>
  </body>
</html>