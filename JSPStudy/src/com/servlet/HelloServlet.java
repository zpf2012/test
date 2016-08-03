package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 3660479052081412660L;

	@Override
	public void init() throws ServletException {
		System.out.println("init without parameters");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init with parameters");
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service");
		PrintWriter pw = response.getWriter();
		pw.write("Hello Servlet");
		pw.close();
	}

	@Override
	public void destroy() {
		System.out.println("destory");
		super.destroy();
	}

}
