<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

    
<!DOCTYPE html>
<html>
<head>
	<title>Register Accountant</title>
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
<c:choose>	
<c:when  test="${not empty username}">
 <a href="<c:url value='/logout' />" >Log Out</a>
 
 <sf:form method="POST" modelAttribute="user" commandName="user">
		First Name:
		<sf:input type="text" path="fname" /><br>
		Last name:
		<sf:input type="text" path="lname" /><br>
		Username:
		<sf:input type="text" path="username" /><br>
		Password:
		<sf:input type="password" path="password" /><br>
		Address:
		<sf:input type="text" path="address" /><br>
		Email:
		<sf:input type="email" path="email" /><br>
		Contact:
		<sf:input type="number" path="phone_number" /><br>
		<sf:input type="hidden" path="org_name" value="${username}" /><br>
		<sf:button type="submit" name='submit'>Submit</sf:button>
		</sf:form>
		
  </c:when>
  <c:otherwise>
  
		
	</div>
	</c:otherwise>
</c:choose>
</body>
</html>