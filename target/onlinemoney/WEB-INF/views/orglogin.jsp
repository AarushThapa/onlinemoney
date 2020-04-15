<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin</title>
	<!--  link rel="stylesheet" type="text/css" href="css.css" -->
</head>
<body>
	<div class='container'>
	
                           
		<form role='form' action="j_spring_security_check" method="post">
		<p style='color:red;'>${message}</p> 
			OrganizatinID:
			<input type="text" id="j_username" name="j_username"  placeholder="Username" required autofocus>
			Password:
			<input type="password" id="j_password" name="j_password"  placeholder="Password" required>
			<button type='submit' name="login">Log In</button>
		</form>
		
	</div>
</body>
</html>
