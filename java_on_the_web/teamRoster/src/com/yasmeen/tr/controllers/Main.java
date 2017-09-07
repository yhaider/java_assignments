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


public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Team> all = Team.getAllteams();
		session.setAttribute("all", all);
		// This is grabbing all the teams from the static method in Team
		// that will grab all the teams
		
		if(request.getParameter("id") != null) {
			for(int i = 0; i < all.size(); i++) {
				Team team = all.get(i);
				if(team.getId() == Integer.parseInt(request.getParameter("id"))) {
					all.remove(i);
				}
			}
			response.sendRedirect("/TeamRoster/main");
		}
		// If there is an id in the parameter, it means we want to delete the team
		// associated with that id
		// So it goes through our whole array of teams and looks for the team with the
		// id that we pulled from the route parameter
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/main.jsp");
			view.forward(request,response);
		}
		// Otherwise it should just display our table of teams
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
