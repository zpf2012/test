<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String username=request.getParameter("username");
	String loves = "";
	String [] arrLove = request.getParameterValues("loves");
	if(arrLove != null && arrLove.length > 0){
		for(String love : arrLove){
			loves = love + loves +" ";
		}
	}
	
	request.setAttribute("username", username);
	request.setAttribute("loves", loves);
%>
<<jsp:forward page="welcome.jsp"></jsp:forward>

