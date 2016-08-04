<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>首页</h3><br/><br/>
<a href="<%=request.getContextPath()%>/10/hello.jsp">Hello.jsp</a><br/><br/>
<%
String flag = "";
Object obj = session.getAttribute("falg");

if(obj != null){
	flag = obj.toString();
}
if(flag.equals("login_success")){
%>
<a href="<%=request.getContextPath()%>/LogoutServlet10">退出</a><br/>
<%} else {%>
<a href="<%=request.getContextPath()%>/10/Login.jsp">登陆</a>
<%} %>

</body>
</html>