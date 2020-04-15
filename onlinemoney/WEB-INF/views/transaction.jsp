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
		<sf:form method="POST" modelAttribute="money" commandName="money">
		<sf:input type='text' path="ftra_reason" /><br>
		<sf:input type="number" path="ftra_amt"/><br>
		<sf:select type="text" path="ftra_type">
		<sf:option type='text' value="deposit">Deposit</sf:option>
		<sf:option type='text' value="withdraw">Withdraw</sf:option>
		<sf:option type='text' value="payable">Payable</sf:option>
		<sf:option type='text' value="receivable">Receivable</sf:option>
		</sf:select>
		<sf:input type="hidden" path="username" value="${username}" /><br>
		<sf:button type="submit" name='submit'>Submit</sf:button>
		</sf:form>
	</div>
</body>
</html>