<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>clock</title>
</head>
<body>
<center>
	<%
	response.setIntHeader("Refresh", 1);
	Calendar calendar = new GregorianCalendar();
	String am_pm;
	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);
	
	if(calendar.get(Calendar.AM_PM) == 0){
		am_pm = "AM";
	}else{
		am_pm = "PM";
	}
	String time = hour+":"+minute+":"+second+" "+am_pm;
	out.print(time);
	%>
	</center>
</body>
</html>