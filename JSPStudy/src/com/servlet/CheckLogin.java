package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.User;
import com.service.Service;

public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckLogin() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		if(username != null && password != null){
			User user = new User();
			user.setName(username);
			user.setPassword(password);
			boolean bool = new Service().check(user);
			
			System.out.println(bool);
			if(bool){
				rd = request.getRequestDispatcher("/02/success.jsp");
				rd.forward(request, response);
			}else{
				request.setAttribute("msg", "用户名或密码错误");
				rd = request.getRequestDispatcher("/02/error.jsp");
				rd.forward(request, response);
			}
		}else{
			request.setAttribute("msg", "用户名或密码为空");
			rd = request.getRequestDispatcher("/02/error.jsp");
			rd.forward(request, response);			
		}
	}

}
