<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>Home</title>
	<meta charset="UTF-8">
	<meta name="description" content="Photo Gallery HTML Template">
	<meta name="keywords" content="endGam,gGaming, magazine, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Favicon -->
	<link href="<c:url value='resources/img/logo.png' />" rel="shortcut icon"/>  

	<!-- Google Font -->
	<link href="https://fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i" rel="stylesheet">


	<!-- Stylesheets -->
	<link rel="stylesheet" href="<c:url value='resources/css/bootstrap.min.css'/> "/>
	<link rel="stylesheet" href="<c:url value='resources/css/font-awesome.min.css'/>"/>  
	<link rel="stylesheet" href="<c:url value='resources/css/owl.carousel.min.css'/> "/>
	<link rel="stylesheet" href="<c:url value='resources/css/animate.css'/> "/>

	<!-- Main Stylesheets -->
	<link rel="stylesheet" href="<c:url value='resources/css/style.css'/> "/>


	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>
<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Top right elements -->
	<div class="spacial-controls">
		<div class="search-switch"><img src="<c:url value='resources/img/search-icon.png'/> " alt=""></div>
		<div class="nav-switch-warp">
			<div class="nav-switch">
				<div class="ns-bar"></div>
			</div>
		</div>
	</div>
	<!-- Top right elements end -->

	<div class="main-warp">
		<!-- header section -->
		<header class="header-section">
			<div class="header-close">
				<i class="fa fa-times"></i>
			</div>
			<div class="header-warp">
				<a href="" class="site-logo">
					<img src="<c:url value='resources/img/logo.png'/> " alt="">
				</a>
				<img src="<c:url value='resources/img/menu-icon.png'/> " alt="" class="menu-icon">
				<ul class="main-menu">
					<li class="active"><a href="<c:url value='/' />">Home</a></li>
					<li><a href="<c:url value='howto' />">How to Use</a></li>
					<li><a href="<c:url value='about' />">About</a></li>
					<c:choose>
 					 <c:when  test="${not empty username}"> 
					<li><a href="transaction">Add Transaction</a></li>
					<li><a href="checkdeposit">Check Deposit</a></li>
					<li><a href="checkwithdraw">Check Withdraw</a></li>
					<li><a href="checkpayable">Check Payable</a></li>
					<li><a href="checkreceivable">Check Receivable</a></li>
					<li><a href="alltransaction">Check All Transaction</a></li>
					
					<li><a href="logout">Log Out</a></li>
					</c:when>
					<c:otherwise>
					<li><a href="<c:url value='orglogin' />">Login</a></li>
					<li><a href="<c:url value='registeruser' />">Create a Account</a></li>
					</c:otherwise>
					</c:choose>
				</ul>
				<div class="social-links-warp">
					<div class="social-links">
						<a href=""><i class="fa fa-twitter"></i></a>
						<a href=""><i class="fa fa-facebook"></i></a>
					</div>
					<div class="social-text">Find us on</div>
				</div>
			</div>
			<div class="copyright">OMMS 2019  @ All rights reserved</div>
		</header>
		<!-- header section end -->

		<!-- Page section -->
		<div class="page-section home-page">
			<div class="hero-slider owl-carousel">
				<div class="slider-item d-flex align-items-center set-bg" data-setbg="<c:url value='resources/img/slider-bg-1.jpg'/> " data-hash="slide-1">
				<c:choose>
 					 <c:when  test="${not empty username}">
 					 <div class="si-text-box">
						<h2>Add Transaction</h2>
						<p>
							Keep record of all your transactions and never worry about anything.
						</p>
						<a href="<c:url value='transaction' />" class="site-btn">Add Transaction</a>
					</div>
 					 </c:when>
					<c:otherwise>
					<div class="si-text-box">
						<h2>Registration</h2>
						<p>This system is generally designed for ORGANIZATIONS for proper management of money. Once, an organization has an account, they can enable the following features of withdraw, deposit, payable and many more.
						
						</p>
						<a href="<c:url value='registeruser' />" class="site-btn">Join Us Now</a>
					</div>
					</c:otherwise>
					</c:choose>
					<div class="next-slide-show set-bg" data-setbg="<c:url value='resources/img/slider.jpg'/> ">
						<a href="#slide-2" class="ns-btn">Next</a>
					</div>
				</div>
				<div class="slider-item d-flex align-items-center set-bg" data-setbg="<c:url value='resources/img/slider.jpg'/>"  data-hash="slide-2">
					
					<c:choose>
 					 <c:when  test="${not empty username}">
 					 <div class="si-text-box">
						<h2>Check All Transactions</h2>
						<p>See all the transactions my organization has made. </p>
						<a href="<c:url value='alltransaction' />" class="site-btn">All Transactions</a>
							</div>
 					  </c:when>
					<c:otherwise>
					<div class="si-text-box">
						<h2>Login</h2>
						<p>Already have an account? </p>
						<a href="<c:url value='orglogin' />" class="site-btn">Login</a>
							</div>
					</c:otherwise>
					</c:choose>
				
					<div class="next-slide-show set-bg" data-setbg="<c:url value='resources/img/slider-bg-1.jpg'/> ">
						<a href="#slide-1" class="ns-btn">Next</a>
					</div>
					
				</div>
			</div>
			<div id="snh-1"></div>
		</div>
		<!-- Page section end-->
	</div>

	<!-- Search model -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">x</div>
			<form class="search-moderl-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search model end -->


	<!--====== Javascripts & Jquery ======-->
	<script src="<c:url value='resources/js/jquery-3.2.1.min.js'/> "></script>
	<script src="<c:url value='resources/js/bootstrap.min.js'/> "></script>
	<script src="<c:url value='resources/js/owl.carousel.min.js'/> "></script>
	<script src="<c:url value='resources/js/jquery.nicescroll.min.js'/> "></script>
	<script src="<c:url value='resources/js/isotope.pkgd.min.js'/> "></script>
	<script src="<c:url value='resources/js/imagesloaded.pkgd.min.js'/> "></script>
	<script src="<c:url value='resources/js/circle-progress.min.js'/> "></script>
	<script src="<c:url value='resources/js/main.js'/> "></script>

	</body>
</html>

