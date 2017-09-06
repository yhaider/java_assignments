package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Dog;
// We imported the dog model created so we can use it
// on our display page


public class DisplayDog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dog dog = new Dog(request.getParameter("dogname"), 
				request.getParameter("dogbreed"), 
				Double.parseDouble(request.getParameter("dogweight")));
		// Here we create the dog from the information from the parameters
		
		request.setAttribute("dog", dog);
		// Here we set dog to the dog we just created so we can refer to it
		// in our jsp file
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dog.jsp");
		view.forward(request,response);		
		// This displays the jsp file at the specific route
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
