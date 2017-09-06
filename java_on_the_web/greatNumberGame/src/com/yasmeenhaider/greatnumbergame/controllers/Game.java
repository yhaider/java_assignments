package com.yasmeenhaider.greatnumbergame.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Random;


public class Game extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/game.jsp");
		view.forward(request,response);
		// On load just show the correct JSP file
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = "";
		Integer guess = Integer.parseInt(request.getParameter("guess"));
		HttpSession session = request.getSession();
		Random random = new Random();
		// Our result is what message the display will show
		// Our guess is grabbed from the route parameters
		// Our session is used to store a number for the user to guess
		// We need random to generate a number
		
		if(session.getAttribute("number") == null) {
			session.setAttribute("number", random.nextInt(100));
		}
		// If there is no number for the user to guess, then generate one!
		else {
			Integer number = (Integer) session.getAttribute("number");
			if(guess == number) {
				result = "Correct! Play again?";
				session.setAttribute("number", random.nextInt(100));
			}
			else if(guess > number) {
				result = "Too high!";
			}
			else if (guess < number){
				result = "Too low!";
			}
			session.setAttribute("result", result);
		}
		// If there is a number, then check their guess:
		// If it is equal to the number then the result is correct
		// If it is less than or greater than then the results display that
		// At the end, set the result in session to the result generated so
		// it can be used in our JSP for the logic that determines what message
		// to display
	
		
		doGet(request, response);
	}

}
