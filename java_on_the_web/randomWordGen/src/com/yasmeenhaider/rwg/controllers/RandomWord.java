package com.yasmeenhaider.rwg.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class RandomWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String count = (String) session.getAttribute("count");
		Integer number = 0;
		Random random = new Random();
		char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','m','o','p','q','r','s','t','u','v','w','x','y','z'};
		String randstr = "";
		int randstrindex;
		// We set up our session first
		// count and number are used to keep track of 
		// the number of times a person has generated a word
		// The random is used to generate a random string index
		// which is stored in randstrindex that will be used to
		// pull a random character from our chars index
		
		if(count == null) {
			session.setAttribute("count", "0");
			session.setAttribute("date", "N/A");
			// If there's nothing in the count, that means it is
			// the first time a user has loaded the page, so the count
			// is zero and the last time a user generated a word was never
		}
		else {
			number = Integer.parseInt(count);
			number += 1;
			count = number.toString();
			session.setAttribute("count", count);
			Date date = new Date();
			session.setAttribute("date", date);
			// However, if count is not null, it is not the first time
			// so we set the number to the integer version of count (which is a string)
			// and then we can add one to number
			// Then we take count, which is the attribute of the session to the string
			// version of the updated number and then we set session to this updated string
			// version of number
			// We also need a date of the last time a word was generated so we save a date 
			// into our session
		}
		for(int i = 0; i <= 14; i++) {
			randstrindex = random.nextInt(chars.length);
			randstr += chars[randstrindex];
		}
		// This randomly generates a number within the chars array's length
		// and it adds a random character to our string 14 times
		
		request.setAttribute("randword",randstr);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/random.jsp");
        view.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}