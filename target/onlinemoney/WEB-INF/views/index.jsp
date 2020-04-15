<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value='/resources/css/mystyle.css' />" rel="stylesheet" type="text/css">
</head>
<body>
	<div class='container'>
		<nav class='mainnav'>
			<ul>
				<li><a href="<c:url value='/' />" >Home</a></li>
				<li>About</li>
				<li>How to use?</li>
			</ul>
		</nav>
		
<c:choose>
  <c:when  test="${not empty username}">
   Welcome ${username}. <a href="<c:url value='/logout' />" >Log Out</a>
   <a href="<c:url value='newuser' />" >Add Accountant</a>
   <a href="<c:url value='transaction' />" >Add Transaction</a>
   
	   
	      
	        <div>
	        <h1>Deposit</h1>
	        <table>
	        <tr>
	        <th>ID</th>
	        <th>User</th>
	        <th>Deposit Amount</th>
	        <th>Deposit Time</th>
	        <th>Deposit Reason</th>
	        </tr>
	        
	        <c:forEach var="element" items="${alldeposit}" >
	        <c:if test="${username.equals(element.username)}">
	        <tr>
	        	 <td>${element.ftra_id}</td>
		          <td>${element.username}</td>
			      <td>${element.ftra_amt}</td>
			      <td>${element.ftra_time}</td>
			      <td>${element.ftra_reason}</td>
			 </tr>
			</c:if>
			 </c:forEach>   
	         </table>
	        </div>
	        
	         <div>
	        <h1>Withdraw</h1>
	        <table>
	        <tr>
	        <th>ID</th>
	        <th>User</th>
	        <th>Withdraw Amount</th>
	        <th>Withdraw Time</th>
	        <th>Withdraw Reason</th>
	        </tr>
	        
	        <c:forEach var="element" items="${allwithdraw}" >
	        <c:if test="${username.equals(element.username)}">
	        <tr>
	        	 <td>${element.ftra_id}</td>
		          <td>${element.username}</td>
			      <td>${element.ftra_amt}</td>
			      <td>${element.ftra_time}</td>
			      <td>${element.ftra_reason}</td>
			 </tr>
		</c:if>
			 </c:forEach>   
	         </table>
	        </div>
	        
	         <div>
	        <h1>Payable</h1>
	        <table>
	        
	        <tr>
	        <th>ID</th>
	        <th>User</th>
	        <th>Payable Amount</th>
	        <th>Payable Time</th>
	        <th>Payable Reason</th>
	        </tr>
	        
	        <c:forEach var="element" items="${allpayable}" >
	        <c:if test="${username.equals(element.username)}">
	        <tr>
	        	 <td>${element.ftra_id}</td>
		          <td>${element.username}</td>
			      <td>${element.ftra_amt}</td>
			      <td>${element.ftra_time}</td>
			      <td>${element.ftra_reason}</td>
			 </tr>
		</c:if>
			 </c:forEach>   
	         </table>
	        </div>
	        
	         <div>
	        <h1>Receivable</h1>
	        <table>
	        <tr>
	        <th>ID</th>
	        <th>User</th>
	        <th>Receivable Amount</th>
	        <th>Receivable Time</th>
	        <th>Receivable Reason</th>
	        </tr>
	        
	        <c:forEach var="element" items="${allreceivable}" >
	        <c:if test="${username.equals(element.username)}">
	        <tr>
	        	 <td>${element.ftra_id}</td>
		          <td>${element.username}</td>
			      <td>${element.ftra_amt}</td>
			      <td>${element.ftra_time}</td>
			      <td>${element.ftra_reason}</td>
			 </tr>
		</c:if>
			 </c:forEach>   
	         </table>
	        </div>
	        
	        
	         <div>
	        <h1>All transactions</h1>
	        <table>
	        <tr>
	        <th>ID</th>
	        <th>User</th>
	        <th>Amount</th>
	        <th>Type</th>
	        <th>Time</th>
	        <th>Reason</th>
	        </tr>
	        
	        <c:forEach var="element" items="${allt}" >
	        <c:if test="${username.equals(element.username)}">
	        <tr>
	        	 <td>${element.ftra_id}</td>
		          <td>${element.username}</td>
			      <td>${element.ftra_amt}</td>
			      <td>${element.ftra_type}</td>
			      <td>${element.ftra_time}</td>
			      <td>${element.ftra_reason}</td>
			 </tr>
		</c:if>
			 </c:forEach>   
	         </table>
	        </div>
	         
	  </c:when>
  <c:otherwise>
    <div class='boxex'>
			<form action='acclogin' method='GET'>
			Login as Accountant
			<button type='submit'  class='button'>Login</button>
			</form>
		</div>
		<div class='boxex'>
			<form action='orglogin' method='GET'>
			Login as Organization
			<button type='submit'  class="button">Login</button>
			</form>
		</div>
		<div class='boxex'>
			<form action='registeruser' method='GET'>
			New User
			<button type='submit'  class="button">Create Account</button>
			</form>
		</div>
	
  </c:otherwise>
</c:choose>
		
</body>
</html>