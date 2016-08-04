<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function return_check(form) {
		if(document.forms.LoginForm.username.value==""){
			alert("请输入用户名");
			document.forms.LoginForm.username.focus();
		}
		
		if(document.forms.LoginForm.password.value==""){
			alert("请输入密码");
			document.forms.LoginForm.password.focus();
		}
	}
</script>
<body>
	<center>
		<form action="<%=request.getContextPath()%>/LoginServlet10"
			method="post" name="LoginForm">
			<%
				if (request.getAttribute("return_uri") != null) {
			%>
			<input type="hidden" name="return_uri" value="<%=request.getAttribute("return_uri")%>" />
			<%
				}
			%>
			username:<input type="text" name="username" /><br /> 
			password:<input	type="password" name="password" /><br /> 
			<input type="submit" value="提交" onclick="return_check(this);" /> 
			<input type="reset"	value="重置" />
		</form>
	</center>
</body>
</html>