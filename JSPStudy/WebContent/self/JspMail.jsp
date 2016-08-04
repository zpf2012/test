<%@page import="java.io.*,java.util.*,javax.mail.*"%>
<%@page import="javax.mail.internet.*,javax.activation.*" %>
<%@page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String result;
	String to = "shengli.yuan@hand-china.com";
	String from = "pengfei.zhang@hand-china.com";
	String host = "localhost";
	Properties properties = System.getProperties();
	
	properties.setProperty("mail.smtp.host", host);
	Session mailSession = Session.getDefaultInstance(properties);
	
	try{
		
		MimeMessage message = new MimeMessage(mailSession);
		message.setFrom(new InternetAddress(from));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		message.setSubject("This is the subject line");
		message.setContent("<h1>This is actual message</h1>","text/html");
		Transport.send(message);
		
		result = "Send the message successfully";
		
	}catch(MessagingException me){
		me.printStackTrace();
		result = "Unable to send massage";
	}
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Send Email</title>
</head>
<body>
<p>
	<%out.print(result); %>
</p>
</body>
</html>