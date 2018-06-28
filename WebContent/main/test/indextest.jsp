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
<link href="main/css/slider.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="main/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="main/js/jquery.nivo.slider.js"></script>
<script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
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
					<c:if test="${result == null}">
						<form action="login/todispatch.action" method="post">
							<ul>
								<li class="login"><input type="submit" id="logininput"
									name="read" value="登录" 
									style="border: 0px; background-color: #ffd133"></li>
								<li class="sign"><input type="submit" id="signinput"
									name="read" value="注册"
									style="border: 0px; background-color: #ffd133"></li>
							</ul>
						</form>
					</c:if>
					<c:if test="${result != null}">
						<nav>
						<form>
							<ul class="fancyNav">
								<li id="home"><a href="#home" class="homeIcon">Home</a></li>
								<li id="news"><a href="#news" class="new-h">用户 </a>
									<div class="new">
										<hr width="110px">
										<a href="contract/contract/tomessage.action" >合同</a>
										<a href="employee/emp/tomain.action" >身份验证</a>
										<a href="login/logout.action" >注销</a>
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
							<li><input type="submit" name="navi" class="" value="主页">
							</li>
							<li class="active"><input type="submit" name="navi" class=""
								value="出售"></li>
							<li><input type="submit" name="navi" class="" value="二手房">
							</li>
							<li><input type="submit" name="navi" class="" value="租房">
							</li>
							<li><input type="submit" name="navi" class="" value="出租">
							</li>
						</ul>
					</form>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!------End Header ------------>
	<!------ Slider ------------>
	<div class="slider">
		<div class="slider-wrapper theme-default">
			<div id="slider" class="nivoSlider">
				<img src="main/images/banner1.jpg" data-thumb="main/images/1.jpg"
					alt="" /> <img src="main/images/banner2.jpg"
					data-thumb="main/images/2.jpg" alt="" /> <img
					src="main/images/banner3.jpg" data-thumb="main/images/3.jpg" alt="" />
				<img src="main/images/banner4.jpg" data-thumb="main/images/4.jpg"
					alt="" /> <img src="main/images/banner5.jpg"
					data-thumb="main/images/5.jpg" alt="" />
			</div>
		</div>
	</div>
	<!------End Slider ------------>
	<!------Content ------------>
	<div class="main">
		<div class="wrap">
			<div class="module-title">
				<h2 class="title">今日消息</h2>
				<p class="modulePretext">临近年末，开发商冲刺年终目标，不少购房者也希望在年前买到称心如意的好房。本周六，安居客携手中国国旅走进河西中央商场幸福蓝海，共同打造新春旅游嘉年华。现场人头攒动，保利、明发和新城开发商为网友们带来了精致好房，同时也准备了精美礼品！
				</p>
			</div>
			<div class="section group">
				<div class="col_1_of_3 span_1_of_3">
					<div class="grid_img">
						<div class="hover_img">
							<img src="main/images/pic.jpg" alt="" />
						</div>
						<p class="desc">
							<a href="#">Lorem ipsum dolor sit amet</a> consectetur
							adipisicing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim venia.
						</p>
					</div>
				</div>
				<div class="col_1_of_3 span_1_of_3">
					<div class="grid_img">
						<div class="hover_img">
							<img src="main/images/pic1.jpg" alt="" />
						</div>
						<p class="desc">
							<a href="#">Lorem ipsum dolor sit amet</a> consectetur
							adipisicing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim venia.
						</p>
					</div>
				</div>
				<div class="col_1_of_3 span_1_of_3">
					<div class="grid_img">
						<div class="hover_img">
							<img src="main/images/pic2.jpg" alt="" />
						</div>
						<p class="desc">
							<a href="#">Lorem ipsum dolor sit amet</a> consectetur
							adipisicing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim venia.
						</p>
					</div>
				</div>
				<div class="clear"></div>
			</div>
			<div class="section group">
				<div class="col_1_of_3 span_1_of_3">
					<div class="grid_img">
						<div class="hover_img">
							<img src="main/images/pic3.jpg" alt="" />
						</div>
						<p class="desc">
							<a href="#">Lorem ipsum dolor sit amet</a> consectetur
							adipisicing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim venia.
						</p>
					</div>
				</div>
				<div class="col_1_of_3 span_1_of_3">
					<div class="grid_img">
						<div class="hover_img">
							<img src="main/images/pic4.jpg" alt="" />
						</div>
						<p class="desc">
							<a href="#">Lorem ipsum dolor sit amet</a> consectetur
							adipisicing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim venia.
						</p>
					</div>
				</div>
				<div class="col_1_of_3 span_1_of_3">
					<div class="grid_img">
						<div class="hover_img">
							<img src="main/images/pic5.jpg" alt="" />
						</div>
						<p class="desc">
							<a href="#">Lorem ipsum dolor sit amet</a> consectetur
							adipisicing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim venia.
						</p>
					</div>
				</div>
				<div class="clear"></div>
			</div>
			<div class="more">
				<form action="">
					<input class="button" type="submit" name="" value="View All Offers">
				</form>
			</div>
			<div class="content-bottom">
				<div class="col_1_of_3 span_1_of_3">
					<h3>欢迎来到21世纪不动产</h3>
					<p class="desc2">
						<strong>21世纪不动产（CENTURY21）于1971年在美国创立，是美国Realogy公司旗下最大的不动产服务体系。.</strong>
					</p>
					<p class="desc1">21世纪中国不动产已经在全国22个主要城市设立806家门店，拥有超过10,700名经纪人及780多万条房源量，构成了强大的销售网络。覆盖全国的庞大的销售网络现已成为21世纪中国不动产平台各项业务开展的坚实基础。</p>
					<p class="desc1">作为21世纪不动产在中国的唯一特许授权商，我们很好地利用了公司在全球房地产业的影响力和广泛的行业联系及经验。同时，我们也积极地利用中国公司的全国网络，设计先进、标准的信息系统及培训项目，并保证房源数据库的不断更新。这一强强联合加上我们独特的商业模式使得21世纪中国不动产得以迅速扩展业务网络及服务范围，并屡获殊荣。</p>
					<div class="more1">
						<form action="">
							<input class="button1" type="submit" name="" value="more">
						</form>
					</div>
				</div>
				<div class="col_1_of_3 span_1_of_3">
					<h3>Deals Calender</h3>
					<div class="module-text">
						<strong class="module-item">28.09.2013</strong>
						<h4>
							<a class="moduleItemTitle" href="#">Lorem ipsum dolor sit
								amet, consec teer adipiscing. Prsent vestibulum.</a>
						</h4>
						<p>Lorem ipsum dolor sit amet, consec tetuer adipi scing.
							Praesent vestibu. lum molestie lacuiirhs. Aenean non ummy
							hendreriauris. Phasellllus.</p>
					</div>
					<div class="module-text">
						<strong class="module-item">29.09.2013</strong>
						<h4>
							<a class="moduleItemTitle" href="#">Lorem ipsum dolor sit
								amet, consec teer adipiscing. Prsent vestibulum.</a>
						</h4>
						<p>Lorem ipsum dolor sit amet, consec tetuer adipi scing.
							Praesent vestibu. lum molestie lacuiirhs. Aenean non ummy
							hendreriauris. Phasellllus.</p>
					</div>
				</div>
				<div class="col_1_of_3 span_1_of_3">
					<h3>最新消息</h3>
					<div class="latest-news-grid">
						<div class="latest-news-pic">
							<img src="main/images/pic6.jpg" title="imag-name">
						</div>
						<div class="latest-news-info">
							<a href="#">Oct 21.01.2016</a>
							<p class="desc1">Lorem ipsum dolor sit amet consectetur adi
								elit, sed do eiusmod tempor sed do eiusmod</p>
						</div>
						<div class="clear"></div>
					</div>
					<div class="latest-news-grid">
						<div class="latest-news-pic">
							<img src="main/images/pic7.jpg" title="imag-name">
						</div>
						<div class="latest-news-info">
							<a href="#">Oct 21.01.2013</a>
							<p class="desc1">Lorem ipsum dolor sit amet consectetur adi
								elit, sed do eiusmod tempor sed do eiusmod</p>
						</div>
						<div class="clear"></div>
					</div>
					<div class="latest-news-grid">
						<div class="latest-news-pic">
							<img src="main/images/pic8.jpg" title="imag-name">
						</div>
						<div class="latest-news-info">
							<a href="#">Oct 21.01.2013</a>
							<p class="desc1">Lorem ipsum dolor sit amet consectetur adi
								elit, sed do eiusmod tempor sed do eiusmod</p>
						</div>
						<div class="clear"></div>
					</div>
					<div class="more1">
						<form action="">
							<input class="button1" type="submit" name="" value="more">
						</form>
					</div>
				</div>
				<div class="clear"></div>
			</div>
			<!------End Content ------------>
			<!------footer ------------>
			<div class="footer">
				<div class="footer-top">
					<div class="col_1_of_4 span_1_of_4">
						<h3>INFORMATION</h3>
						<ul>
							<li><a href="#">registerhouse us</a></li>
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
