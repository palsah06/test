package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String username= request.getParameter("user");
			String password= request.getParameter("pass");
			RequestDispatcher view= null;
			if(username.equalsIgnoreCase("pallavi")&& password.equalsIgnoreCase("palsah61")){
				request.setAttribute("responseString", "Welcome Pallavi");
				view=request.getRequestDispatcher("Home.jsp");
			} else {
				request.setAttribute("responseString", "UserName or Password incorrect...");
				view=request.getRequestDispatcher("New.jsp");
			}
			
			view.forward(request, response);
		}catch(Exception exception){
			exception.printStackTrace();
		}
	}

}
