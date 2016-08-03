<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%
//session创建和最后一次访问时间
	Date createTime = new Date(session.getCreationTime());
	Date lastAccessTime = new Date(session.getLastAccessedTime());
//创建变量
	String title = "Welcome back to my website";
	Integer visitCount = new Integer(0);
	String visitCountKey = new String("VisitCount");
	String userIDKey = new String("userID");
	String userID = new String("ABCD");
//session是否是新建的
	if(session.isNew()){
		title = "Welcome to my website";
//设置属性键值对
		session.setAttribute(userIDKey, userID);
		session.setAttribute(visitCountKey, visitCount);
	}
//session接收用户访问信息
	visitCount = (Integer)session.getAttribute(visitCountKey);
	visitCount = visitCount + 1;
	userID = (String)session.getAttribute(userIDKey);
	session.setAttribute(visitCountKey, visitCount);
//	session.removeAttribute(userIDKey);  移除属性
//	session.invalidate();   移除整个会话，如果使用这个方法，每次的session都是新的
//	session.setMaxInactiveInterval(60*60*24);  设置会话超时时间，以秒为单位
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
	<tr>
		<th>Session Info</th>
		<th>Value</th>
	</tr>
	<tr>
		<td>Create Time</td>
		<td><% out.print(createTime); %></td>
	</tr>
	<tr>
		<td>LastAccess Time</td>
		<td><% out.print(lastAccessTime); %></td>
	</tr>
	<tr>
		<td>User ID</td>
		<td><% out.print(userID); %></td>
	</tr>
	<tr>
		<td>Number of visits</td>
		<td><% out.print(visitCount); %></td>
	</tr>
	
</table>
</body>
</html>