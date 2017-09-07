package com.yasmeen.tr.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yasmeen.tr.models.Team;

public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Team> all = Team.getAllteams();
		session.setAttribute("all", all);
		// First on load we grab all the teams in existence by running the
		// static class method from Team to do so
		
		if(request.getParameter("playerid") != null) {
			Team team = all.get(Integer.parseInt(request.getParameter("id")));
			team.removePlayer(Integer.parseInt(request.getParameter("playerid")));
			response.sendRedirect("/TeamRoster/teams?id="+team.getId());
		}
		// If there is a player id in our route parameter it means we are attempting to
		// delete a player from the team we have on display, so we then use the team's id
		// from the route parameters to grab the correct team from our list of all teams
		// and then we run our removePlayer() method from our Team class, which takes an id
		// (which we are feeding in as the player id from the route parameters)
		// and then we are redirecting it to the display page for the team we just deleted a 
		// player from
		
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/team.jsp");
			view.forward(request,response);
		}
		// Otherwise, just display the team!
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getParameter("teamname");
		new Team(name);
		response.sendRedirect("/TeamRoster/main");
	}
	// If we are running a post, that means we are creating a team! Thus we just 
	// create a new team using the name from the form submitted which is passed into the route
	// parameters

}
