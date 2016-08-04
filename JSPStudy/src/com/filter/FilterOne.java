package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterOne implements Filter {


    public FilterOne() {
    	System.out.println("=========构造函数=========");
    }


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("===========开始执行doFilter方法============");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("========初始化=========");
		String param = fConfig.getInitParameter("param");
		System.out.println(param);
	}
	
	public void destroy() {
		System.out.println("==========销毁Filter===========");
	}

}
