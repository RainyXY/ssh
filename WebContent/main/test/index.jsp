<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setBundle basename="pers.lisiyan.relestate.message.Info" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>房屋中介管理系统</title>
<base href="http://localhost:8080/JHouseManger/" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
<link href="main/css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="main/css/slider.css" rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="main/cssee/animate.css" type="text/css" media="all">
<link rel="stylesheet" href="main/cssee/bootstrap.css" type="text/css" media="all">
<link rel="stylesheet" href="main/cssee/style.css" type="text/css" media="all">
	

<script type="text/javascript" src="main/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="main/js/jquery.nivo.slider.js"></script>
<script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
</script>

<script type="text/javascript" src="main/jsee/jquery.min.js"></script>
<script type="text/javascript" src="main/jsee/scripts.js"></script>
<script type="text/javascript" src="main/jsee/responsiveslides.min.js"></script>
  	<script type="text/javascript" src="main/jsee/jquery.min.js"></script>
<script type="text/javascript" src="main/jsee/responsiveslides.min.js"></script>
<script>
   $(function () {
     $("#slider").responsiveSlides({
     	auto: true,
     	speed: 500,
       namespace: "callbacks",
       pager: true,
     });
   });
</script>

<style>
nav div {
	height: 150px;
	width: 80px;
	display: none;
}

.new a {
	display: inline;
}

#news:hover div {
	display: block;
}
</style>
		
</head>

<body>
<!------ Header------------>
	<div class="wrap-box"></div>
	<div class="header">
		<div class="header-top">
			<div class="wrap">
				<div class="top-header-left">
					<p>+15541166003 张晓雨</p>
				</div>
				<div class="right-left">
					<c:if test="${result==null}">
						<form action="login/todispatch.action" method="post">
							<ul>
								<li class="login"><input type="submit" id="logininput" name="read" value="login"
									style="border: 0px; background-color: #ffd133"></li>
								<li class="sign"><input type="submit" id="signinput" name="read" value="register"
									style="border: 0px; background-color: #ffd133"></li>
							</ul>
						</form>
					</c:if>
					<c:if test="${result != null}">

						<nav>
						<form>
							<ul class="fancyNav">
								<!-- <li id="home"><a href="#" class="homeIcon">Home</a></li> -->
								<li id="news"><a href="#" class="new-h"><fmt:message key="yonghu" /><!-- 用户 --> </a>
									<div class="new">
										<hr width="110px">
										<a href="contract/contract/tomessage.action" ><fmt:message key="hetong" /><!-- 合同 --></a><br>
										<a href="employee/emp/tomain.action" ><fmt:message key="shenfenyanzheng" /><!-- 身份验证 --></a><br>
										<a href="login/logout.action" ><fmt:message key="zhuxiao" /><!-- 注销 --></a>
									</div></li>
							</ul>
						</form>
						</nav>
					</c:if>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="header-bottom">
			<div class="wrap">
				<div class="logo">
					<a href="index.html"><img src="main/images/logo.png" alt="" /></a>
				</div>
				<div class="top-nav">
					<form action="main/test/navi.action" method="post">
						<ul>
							<li><input type="submit" name="navi" class="" value="<fmt:message key="zhuye" />">
							</li>
							<li class="active"><input type="submit" name="navi" class=""
								value="<fmt:message key="chushou" />"></li>
							<li><input type="submit" name="navi" class="" value="<fmt:message key="ershoufang" />">
							</li>
							<li><input type="submit" name="navi" class="" value="<fmt:message key="zufang" />">
							</li>
							<li><input type="submit" name="navi" class="" value="<fmt:message key="chuzu" />">
						</ul>
					</form>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!------End Header ------------>
<!--header-->
<div class=" header-right">
		<div class=" banner">
			 <div class="slider">
			    <div class="callbacks_container">
			      <ul class="rslides" id="slider">		       
					 <li>
			          	 <div class="banner1">
			           		<div class="caption">
					          	<h3><span><fmt:message key="biaoti" /></span>  <fmt:message key="xiu" /></h3>
					          	<p><fmt:message key="miaoshu" /></p>
			          		</div>
			          	</div>
			         </li>
					 <li>
			          	 <div class="banner2">
			           		<div class="caption">
					          	<h3><span><fmt:message key="biaoti" /></span>  <fmt:message key="xiu" /></h3>
					          	<p><fmt:message key="miaoshu" /></p>
			          		</div>
			          	</div>
			         </li>
			         <li>
			          	 <div class="banner3">
			           		<div class="caption">
					          	<h3><span><fmt:message key="biaoti" /></span>  <fmt:message key="xiu" /></h3>
					          	<p><fmt:message key="miaoshu" /></p>
			          		</div>
			          	</div>
			         </li>		
			      </ul>
			  </div>
			</div>
		</div>
	</div>		
<!--concent-->	
	<div class="banner-bottom">
		<div class="container">
			<div class="banner-bottom-grids">
				<div class="col-md-3 banner-bottom-grid">
					<img src="main/imgs/1.jpg" alt=" " class="img-responsive" />
					<div class="banner-bottom-grid-info">
						<div class="col-xs-4 banner-bottom-grid-infol">
							<p>.01</p>
						</div>
						<div class="col-xs-8 banner-bottom-grid-infor">
							<h3>qui dolorem fugiat</h3>
						</div>
						<div class="clearfix"> </div>
						<p class="vel">Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse 
								quam nihil molestiae consequatur.</p>
							<div class="more m1">
								<a href="single.html">Learn More</a>
							</div>
					</div>
				</div>
				<div class="col-md-3 banner-bottom-grid">
					<img src="main/imgs/3.jpg" alt=" " class="img-responsive" />
					<div class="banner-bottom-grid-info">
						<div class="col-xs-4 banner-bottom-grid-infol">
							<p>.02</p>
						</div>
						<div class="col-xs-8 banner-bottom-grid-infor">
							<h3>qui dolorem fugiat</h3>
						</div>
						<div class="clearfix"> </div>
						<p class="vel">Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse 
								quam nihil molestiae consequatur.</p>
							<div class="more m1">
								<a href="single.html">Learn More</a>
							</div>
					</div>
				</div>
				<div class="col-md-3 banner-bottom-grid">
					<img src="main/imgs/6.jpg" alt=" " class="img-responsive" />
					<div class="banner-bottom-grid-info">
						<div class="col-xs-4 banner-bottom-grid-infol">
							<p>.03</p>
						</div>
						<div class="col-xs-8 banner-bottom-grid-infor">
							<h3>qui dolorem fugiat</h3>
						</div>
						<div class="clearfix"> </div>
						<p class="vel">Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse 
								quam nihil molestiae consequatur.</p>
							<div class="more m1">
								<a href="single.html">Learn More</a>
							</div>
					</div>
				</div>
				<div class="col-md-3 banner-bottom-grid">
					<img src="main/imgs/7.jpg" alt=" " class="img-responsive" />
					<div class="banner-bottom-grid-info">
						<div class="col-xs-4 banner-bottom-grid-infol">
							<p>.04</p>
						</div>
						<div class="col-xs-8 banner-bottom-grid-infor">
							<h3>qui dolorem fugiat</h3>
						</div>
						<div class="clearfix"> </div>
						<p class="vel">Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse 
								quam nihil molestiae consequatur.</p>
							<div class="more m1">
								<a href="single.html">Learn More</a>
							</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!--footer-->
<div>
		<div class="fh5co-cta" style="background-image: url(main/imgs/slide_4.jpg);">
		<div class="overlay"></div>
		<div class="container">
			<div class="col-md-12 text-center animate-box" data-animate-effect="fadeIn">
				<h3>We Try To Update The Site Everyday</h3>
				<p><a href="#" class="btn btn-primary btn-outline with-arrow">Get started now! <i class="icon-arrow-right"></i></a></p>
			</div>
		</div>
	</div>

	
	<footer id="fh5co-footer" role="contentinfo">
	
		<div class="container">
			<div class="col-md-3 col-sm-12 col-sm-push-0 col-xs-12 col-xs-push-0">
				<h3>INFORMATION</h3>
				<ul>
					<li><a href="#">registerhouse us</a></li>
					<li><a href="#">Sitemap</a></li>
					<li><a href="#">Contact</a></li>
					<li><a href="#">Terms and conditions</a></li>
					<li><a href="#">Legal Notice</a></li>
				</ul>	
			</div>
			<div class="col-md-3 col-md-push-1 col-sm-12 col-sm-push-0 col-xs-12 col-xs-push-0">
				<h3>CATEGORIES</h3>
				<ul>
					<li><a href="#">New products</a></li>
					<li><a href="#">top sellers</a></li>
					<li><a href="#">Specials</a></li>
					<li><a href="#">Products</a></li>
					<li><a href="#">Comments</a></li>
				</ul>
			</div>

			<div class="col-md-3 col-md-push-1 col-sm-12 col-sm-push-0 col-xs-12 col-xs-push-0">
				<h3>My ACCOUNT</h3>
				<ul>
					<li><a href="#">Your Account</a></li>
					<li><a href="#">Personal info</a></li>
					<li><a href="#">Prices</a></li>
					<li><a href="#">Address</a></li>
					<li><a href="#">Locations</a></li>
				</ul>
			</div>
			
			<div class="col-md-3 col-md-push-1 col-sm-12 col-sm-push-0 col-xs-12 col-xs-push-0">
				<h3>CONTACT US</h3>
				<div class="footer-grid-address">
					<p>Tel.800-666-9999</p>
					<p>Fax: 1234 568</p>
					<p>
						Email:<a class="email-link" href="#">email(at)realdeal.com</a>
					</p>
				</div>
				<ul class="follow_icon">
					<li><a href="#" style="opacity: 1;"><img
							src="main/imgs/facebook.png" alt=""></a></li>
					<li><a href="#" style="opacity: 1;"><img
							src="main/imgs/twitter.png" alt=""></a></li>
					<li><a href="#" style="opacity: 1;"><img
							src="main/imgs/feed.png" alt=""></a></li>
				</ul>
			</div>
		</div>
	</footer>
	</div>
	
</div>

</body>
</html>