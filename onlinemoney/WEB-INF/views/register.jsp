<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Register</title>
	<link rel="stylesheet" type="text/css" href="css.css">
</head>
<body>
	<div class='container'>
		<nav class='mainnav'>
			<ul>
				<li>Home</li>
				<li>About</li>
				<li>How to use?</li>
			</ul>
		</nav>
		<c:if test="${param.message != null}">  <%= request.getParameter("message") %></c:if>
		<sf:form method="POST" modelAttribute="org" commandName="org">

		Organization Name:
		<sf:input type="text" path="org_name"/><br>
		Organization Details:
		<sf:input type="text" path="org_details"/><br>
		Organization Password:
		<sf:input type="password" path="org_pw"/><br>
		Organization Address:
		<sf:input type="text" path="org_address"/><br>
		Organization Email:
		<sf:input type="email" path="org_email"/><br>
		Organization Contact:
		<sf:input type="number" path="org_contact"/><br>
		<sf:button type="submit">submit</sf:button>
		
		</sf:form>
	</div>
</body>
</html>