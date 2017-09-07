package com.yasmeen.tr.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yasmeen.tr.models.Team;



public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/add.jsp");
		view.forward(request,response);
	}
	// This displays the add player form

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		Integer age = Integer.parseInt(request.getParameter("age"));
		ArrayList<Team> all = Team.getAllteams();
		for(int i = 0; i < all.size(); i++) {
			Team team = all.get(i);
			if(team.getId() == Integer.parseInt(request.getParameter("id"))) {
				Team addteam = all.get(i);
				addteam.addPlayer(fname, lname, age);
			}
		}
		response.sendRedirect("/TeamRoster/teams?id=" + request.getParameter("id"));
	}
	// Once the form is submitted, we grab the form information which is passed into
	// the route parameters and then we get the list of all our teams
	// Then we find the specific team we want to add the new player to (by using the id in
	// the route parameters and searching for it in the list of all teams and then we
	// run our addPlayer() method from our Team class to add the player
	// Finally we redirect the user to that team's display page

}
