<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@ page import="java.io.*,java.util.*,javax.servlet.*" %> 
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.output.*" %>
<%
File file;
int maxFileSize = 5000*1024;
int maxMemSize = 5000*1024;
ServletContext context = pageContext.getServletContext();
String filePath = context.getInitParameter("file-upload");
String contentType = request.getContentType();
if((contentType.indexOf("multipart/form-data")>=0)){
	DiskFileItemFactory factory = new DiskFileItemFactory();
	factory.setSizeThreshold(maxMemSize);
	factory.setRepository(new File("c:\\temp"));
	ServletFileUpload upload = new ServletFileUpload(factory);
	upload.setSizeMax(maxFileSize);
	
	try{
//此处出错与Servlet有关
		List<FileItem> fileItems = (List<FileItem>)upload.parseRequest(request);
//		List fileItems = upload.parseRequest(request);
		Iterator i = fileItems.iterator();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>JSP File upload</title>");
		out.print("</head>");
		out.print("<body>");
		while(i.hasNext()){
			FileItem fi = (FileItem)i.next();
			if(!fi.isFormField()){
				String fieldName = fi.getFieldName();
				String fileName = fi.getName();
				boolean isInMemery = fi.isInMemory();
				long sizeInBytes = fi.getSize();
				if(fileName.lastIndexOf("\\") >= 0){
					file = new File(filePath+fileName.substring(fileName.lastIndexOf("\\")));
				}else{
					file = new File(filePath+fileName.substring(fileName.lastIndexOf("\\")+1));
				}
				fi.write(file);
				out.println("Uploaded Filename:"+filePath+fileName+"<br/>");
			}
		}
		out.println("</body>");
		out.println("</html>");
	}catch(Exception e){
		System.out.println(e);
	}
}else{
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Servlet upload</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<p>No file uploaded</p>");
	out.println("</body>");
	out.println("<html>");
}
%>