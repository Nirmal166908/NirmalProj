package com.nk.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nk.model.LoginBean;
import com.nk.model.LoginService;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
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
		// TODO Auto-generated method stub
	
		if( request. getParameter("param").equals("Login")){
			LoginService service = new LoginService();
			LoginBean loginBean = new LoginBean();
			
			//int loginid =  Integer.parseInt(request.getParameter("loginid"));
			String loginid =  request.getParameter("loginid");
			String password = request.getParameter("password");
			
			loginBean.setLoginId(loginid);
			loginBean.setPassword(password);
			
			String retValue = service.authenticateLogin(loginBean);
			if( retValue.equals("failure")){
				System.out.println("Message"+loginBean.getMessage());
				request.setAttribute("Message", loginBean.getMessage());
				request.getRequestDispatcher("Error.jsp").forward(request, response);
			}
			else if( retValue.equals("success")){
				request.setAttribute("Message", loginBean.getMessage());
				request.getRequestDispatcher("Home.jsp").forward(request, response);
			} 
		}
	}

}
