<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>登陆成功</h3>
		用户名：<%=request.getParameter("username")%>
		密码：<%=request.getParameter("password")%>
		<a href="<%=request.getContextPath() %>/02/Login.jsp">返回登陆页面</a>
	</center>
</body>
</html>