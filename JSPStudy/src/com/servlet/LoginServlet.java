package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 7186374389169889022L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	String forword = null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (username.equals("xiaofei") && password.equals("asd")) {
			forword = "/02/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forword);
			rd.forward(req, resp);
		} else {
			forword = "/02/error.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forword);
			rd.forward(req, resp);
		}

	}

}
