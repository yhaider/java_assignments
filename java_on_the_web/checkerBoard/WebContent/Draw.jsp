<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>CheckerBoard</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" type="text/css">
</head>


<body>
	<div class = "title">
	<% 
		int width = 0;
		int height = 0;
		if(request.getParameter("width") != null) {
			width = Integer.parseInt(request.getParameter("width"));
		}
		if(request.getParameter("height") != null) {
			height = Integer.parseInt(request.getParameter("height"));
		} %>
		<h1>CheckerBoard: <%= width %>w x <%=height %>h</h1>
		<h3>Put in your desired height and width into the route and watch a checkerboard appear!</h3>
	</div>
	
	<div class = "board">
		<!-- Pulling the route parameters and setting them as variables we can use! -->
		
		<% for(int i = 0; i < height; i++){ %>
			<% if (i % 2 == 0) { %>
				<div class = "rowone">
					 <% for(int x = 0; x < width; x++){ %>
                			<% if(x % 2 == 0){ %>
                        		<div class="rowoneone"></div>
                  		<% } else{ %>
                        		<div class="rowonetwo"></div>
                    		<% } %>
               		 <% } %>
				</div>
			<% } else { %>
				<div class = "rowtwo">
					<% for(int x = 0; x < width; x++){ %>
	                		<% if(x % 2 == 0){ %>
	                        <div class="rowtwoone"></div>
	                    	<% } else{ %>
	                        <div class="rowtwotwo"></div>
	                    	<% } %>
	                <% } %>
				</div>
			<% } %>   
        <% } %>
         <!-- Nested for-loops in order to create the checkerboard -->
	</div>
	
	
</body>
</html>