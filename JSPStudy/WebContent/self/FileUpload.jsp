<html>
<head>
<title>Upload File</title>
</head>
<body>
<h3>请选择需要上传的文件：</h3>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
	<input type="file" name ="file" size="50"/><br/><br/>
	<input type="submit" value="UploadFile"/>
</form>
</body>
</html>