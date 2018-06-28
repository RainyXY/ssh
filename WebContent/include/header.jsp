<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>工资管理系统</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script src="../js/Clock.js"></script>
<style type="text/css">
<!--
.STYLE1 {font-size: 36px}
.STYLE2 {
	font-size: 36px;
	color: orange;
	font-weight: bold;
	
}

-->
}
</style>
</head>

<body>
<div id="topFrame">
<!-- <div class="topLeft"><img src="../images/people.gif" width="200" height="120" /></div> -->
<div class="topRight STYLE1">
  <div align="center">
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p class="STYLE2">&nbsp;</p>
    <p class="STYLE2">Boss In</p>
  </div>
</div>
<div class="userInfo"><span id="clock"></span>
<ul>
<li><a href="login.do">注销</a></li>
<li class="blank"></li>
<li><a href="#">管理员</a></li>
<li>您的身份是：</li>
<li class="blank"></li>
<li><a href="#">张晓雨</a></li>
<li>欢迎您登陆，</li>
</ul>
</div>
</div>
<script type="text/javascript">
var clock = new Clock();
    clock.display(document.getElementById("clock"));

</script>
</body>
</html>
