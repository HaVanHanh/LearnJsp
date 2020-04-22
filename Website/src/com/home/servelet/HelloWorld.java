package com.home.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(description = "This is a demo", urlPatterns = { "/hello" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		loadParameter(request, response, "by get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		loadParameter(request, response, "by post");
	}

	private void loadParameter(HttpServletRequest request, HttpServletResponse response,String method) 
	throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter writer = response.getWriter();
		writer.println("User name: " +username);
		writer.println("Password : " +password);

	}
}

