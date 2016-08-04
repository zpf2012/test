<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理提交的内容</title>
</head>
<body>
<jsp:useBean id="user" class="com.entities.User"></jsp:useBean>
<jsp:setProperty property="username" name="user"/>
<jsp:setProperty property="password" name="user"/>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	out.println(username);
	out.println(password);
	out.println("<br/>");
	out.println("<br/>");
%>
<jsp:getProperty property="username" name="user"/>
<jsp:getProperty property="password" name="user"/>
</body>
</html>