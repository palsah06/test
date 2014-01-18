<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%=request.getAttribute("responseString") != null ? request.getAttribute("responseString") : ""%>
	<form action="Login" method="post">
		<label>USERNAME :</label><input type="text" name="user"><br>
		<label>PASSWORD :</label><input type="text" name="pass"> <br>
		<input type="submit">
	</form>
</body>
</html>