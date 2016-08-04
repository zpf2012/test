package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet10
 */
public class LoginServlet10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet10() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String returnUri = request.getParameter("return_uri");
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("returnUri:"+returnUri);
		
		RequestDispatcher rd = null;
		if(username == null || password == null){
			request.setAttribute("msg", "用户名或者密码为空");
			rd = request.getRequestDispatcher("/10/Login.jsp");
			rd.forward(request, response);
		}else{
			if(username.equals("xiaofei") && password.equals("123")){
				request.getSession().setAttribute("flag", "login_success");
				if (returnUri != null) {
					rd = request.getRequestDispatcher(returnUri);
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("/10/index.jsp");
					rd.forward(request, response);
				}
			}else{
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "用户名或密码输入错误");
				rd = request.getRequestDispatcher("/10/Login.jsp");
				rd.forward(request, response);
			}
		}
	}

}
