package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
/**
 * Servlet Filter implementation class EncodingFilter
 */

public class EncodingFilter implements Filter {
	private String charEncoding  = null;

    /**
     * Default constructor. 
     */
    public EncodingFilter() {
    	System.out.println("字符编码过滤器");
    }
    
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
//		从配置中取出编码参数
		charEncoding = fConfig.getInitParameter("encoding");
		System.out.println(charEncoding);
		if(charEncoding == null){
			throw new ServletException("EncodingFilter中的字符编码设置为空");
		}
	}

	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		取出请求页面的编码做对比，执行统一编码
		if(!charEncoding.equals(request.getCharacterEncoding())){
			request.setCharacterEncoding(charEncoding);
		}
		System.out.println(request.getCharacterEncoding());
		response.setCharacterEncoding(charEncoding);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
