<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Ninja Gold</title>
	<link rel="stylesheet" href="css/ng.css"> 
  </head>
  <body>
    <div id = "gold">
    <p>Your Gold: <%= session.getAttribute("gold") %></p>
    </div>
    <div class="options">
      <div class="farm">
        <h3>Farm</h3>
        <p>(earns 10-20 gold)</p>
        <form action="/process/1" method="POST">
          <input type="submit" value="Find Gold!"/>
        </form>
      </div>
      <div class="cave">
        <h3>Cave</h3>
        <p>(earns 5-10 gold)</p>
        <form action="/process/2" method="POST">
          <input type="submit" value="Find Gold!"/>
        </form>
      </div>
      <div class="house">
        <h3>House</h3>
        <p>(earns 2-5 gold)</p>
        <form action="/process/3" method="POST">
          <input type="submit" value="Find Gold!"/>
        </form>
      </div>
      <div class="casino">
        <h3>Casino</h3>
        <p>(earns/takes 0-50 gold)</p>
        <form action="/process/4" method="POST">
          <input type="submit" value="Find Gold!"/>
        </form>
      </div>
    </div>
    <div id="activities">
      <p>Activities:</p>
      <div class="box">
        <ul>
        <% if(session.getAttribute("activities") != null){ %>
        		<% ArrayList<String> acts = (ArrayList<String>) session.getAttribute("activities"); %>
        		<% for(int i = 0; i < acts.size(); i++) { %>
        			<% if(acts.get(i).startsWith("F")) { %>
        				<li style = "color: green;"><%= acts.get(i) %></li>
        			<% } else { %>
        				<li style = "color: red;"><%= acts.get(i) %></li>
        			<% } %>
        		<% } %>
        <% } %>
        </ul>
      </div>
    </div>
    <div class="reset">
      <a href="/reset"><button type="button" name="button" class = "reset">Reset</button></a>
    </div>
  </body>
</html>