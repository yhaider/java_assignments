package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Cat;
// Here we import the cat model we created so we can
// create a cat


public class DisplayCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cat cat = new Cat(request.getParameter("catname"), 
				request.getParameter("catbreed"), 
				Double.parseDouble(request.getParameter("catweight")));
		// Here we create a cat from pulling the form information from the route
		// Check the jsp file form section to see the route it goes to
		
		request.setAttribute("cat",cat);
		// Now we set cat to the cat we made so we can use it in the jsp file
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/cat.jsp");
		view.forward(request,response);
		// Here we display the correct jsp file
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
