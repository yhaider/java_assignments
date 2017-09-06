package com.yasmeenhaider.buttonclicker.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		HttpSession session = request.getSession();
		String count = (String) session.getAttribute("count");
		Integer number = 0;
		// We need this integer number so that we can add things to it
		// since in session it is stored as a string
		// Count is what is currently stored in session so we can pull it
		
		if(count == null) {
			session.setAttribute("count", "0");
			// If there's nothing in the count, that means it is
			// the first time a user has loaded the page, so the count
			// is zero
		}
		else {
			number = Integer.parseInt(count);
			number += 1;
			count = number.toString();
			session.setAttribute("count", count);
			// However, if count is not null, it is not the first time
			// so we set the number to the integer version of count (which is a string)
			// and then we can add one to number
			// Then we take count, which is the attribute of the session to the string
			// version of the updated number and then we set session to this updated string
			// version of number
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/main.jsp");
        view.forward(request, response);
        // This makes sure that it displays the correct jsp file on load
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
