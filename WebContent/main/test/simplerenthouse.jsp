<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>房屋中介管理系统</title>
 <base href="http://localhost:8080/JHouseManger/"/>
<link href="main/css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css'>
<!------ Light Box ------>
<link rel="stylesheet" href="main/css/swipebox.css">
<script type="text/javascript" src="main/js/jquery-1.9.0.min.js"></script>
<script src="main/js/ios-orientationchange-fix.js"></script>
<script src="main/js/jquery.swipebox.min.js"></script>
<script type="text/javascript">
	jQuery(function($) {
		$(".swipebox").swipebox();
	});
</script>
<!------ Eng Light Box ------>
</head>
<body>
	<!------ Header------------>
	 <header>
          <%@include file="head.jsp" %>
        </header>
	<!------ End Header ------------>
	<!------Content ------------>
	<div class="main">
		<div class="wrap">
			<div class="about">
				<div class="services">
					<div class="section group">

						<div class="grid_1_of_4 main/images_1_of_4">
							<c:forEach var="renthouse" items="${rentHouseModels}">
								<a href="" class="swipebox" title="Image Title"> <img
									src="main/test/showrentphoto.action?r_house_id=${renthouse.r_house_id}" alt=""><span
									class="zoom-icon"></span>
								</a>
								<h4>${renthouse.r_house_address}</h4>
								<p>${renthouse.r_house_note}</p>
								<a href="main/test/torentmessage.action?r_house_id=${renthouse.r_house_id}"
									class="link">Read More</a>
								<br />
							</c:forEach>
						</div>

						<div class="clear"></div>
					</div>

				</div>
				<div class="col span_1_of_about1">

					<div id="loginbox" class="loginbox"></div>
					<div class="single-right">
						<h3>Search~</h3>
						<div id="loginbox" class="loginbox">
							<form action="main/test/torentshow.action" method="post" name="login"
								id="login-form">
								<fieldset class="input">
									<p id="login-form-username">
										<input id="modlgn_username" type="text" name="id"
											class="inputbox" size="18" autocomplete="off">
									</p>
									<div class="more2">
										<!-- <a href="#" class="button1">Search</a> -->
										 <input name="search" type="submit" id="submit" value="搜索">
									</div>
								</fieldset>
							</form>
						</div>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<!------End Content ------------>
		<div class="footer">
			<div class="footer-top">
				<div class="col_1_of_4 span_1_of_4">
					<h3>INFORMATION</h3>
					<ul>
						<li><a href="#">About us</a></li>
						<li><a href="#">Sitemap</a></li>
						<li><a href="#">Contact</a></li>
						<li><a href="#">Terms and conditions</a></li>
						<li><a href="#">Legal Notice</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>CATEGORIES</h3>
					<ul>
						<li><a href="#">New products</a></li>
						<li><a href="#">top sellers</a></li>
						<li><a href="#">Specials</a></li>
						<li><a href="#">Products</a></li>
						<li><a href="#">Comments</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>My ACCOUNT</h3>
					<ul>
						<li><a href="#">Your Account</a></li>
						<li><a href="#">Personal info</a></li>
						<li><a href="#">Prices</a></li>
						<li><a href="#">Address</a></li>
						<li><a href="#">Locations</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_footer-lastgrid">
					<h3>CONTACT US</h3>
					<div class="footer-grid-address">
						<p>Tel.800-255-9999</p>
						<p>Fax: 1234 568</p>
						<p>
							Email:<a class="email-link" href="#">email(at)realdeal.com</a>
						</p>
					</div>
					<ul class="follow_icon">
						<li><a href="#" style="opacity: 1;"><img
								src="main/images/facebook.png" alt=""></a></li>
						<li><a href="#" style="opacity: 1;"><img
								src="main/images/twitter.png" alt=""></a></li>
						<li><a href="#" style="opacity: 1;"><img
								src="main/images/feed.png" alt=""></a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>
