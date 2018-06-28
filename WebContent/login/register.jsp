<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
   <fmt:setBundle basename="pers.lisiyan.relestate.message.Info" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="keywords" content="注册页面模板,网站注册页面,注册模板页面,网站模板,注册页面表单验证">
<meta name="description" content="JS代码网提供大量的注册页面模板的学习和下载">
<link rel="shortcut icon" href="resources/images/favicon.ico" />
<link href="resources/style/register.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../login/resources/js/jquery.js"></script>
<script type="text/javascript" src="../login/resources/js/jquery.i18n.properties-1.0.9.js" ></script>
<script type="text/javascript" src="../login/resources/js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript" src="../login/resources/js/jquery.validate.js"></script>
<script type="text/javascript" src="../login/resources/js/md5.js"></script>
<script type="text/javascript" src="../login/resources/js/page_regist.js?lang=zh"></script>


</head>
<body class="loginbody">
<div class="dataEye">
	<div class="loginbox registbox">
		
		<div class="login-content reg-content">
			<div class="loginbox-title">
				<h3><fmt:message key="zhuce" /><!-- 注册 --></h3>
			</div>
			<form action="../login/processadd.action" method="post">
			<div class="login-error"></div>
			
			
			<div class="row">
				<label class="field" for="email"><fmt:message key="youxiang" /><!-- 注册邮箱 --></label>
				<input type="text" value="" class="input-text-user noPic input-click" name="user_email" id="email">
			</div>
			
			<div class="row">
				<label class="field" for="password"><fmt:message key="mima" /><!-- 密码 --></label>
				<input type="password" value="" class="input-text-password noPic input-click" name="user_password" id="password">
			</div>
			
			<div class="row">
				<label class="field" for="passwordAgain"><fmt:message key="queren" /><!-- 确认密码 --></label>
				<input type="password" value="" class="input-text-password noPic input-click" name=" passwordAgain" id="passwordAgain">
			</div>
			
	
			<div class="row">
				
				<label class="field" for="tel"><fmt:message key="dianhua" /><!-- 电话 --></label>
			  <input type="text" value="" class="input-text-user noPic input-click" name="user_tel" id="tel">
			</div>
			
			
			 
			<div class="row tips">
				<input type="checkbox" id="checkBox">
				<label>
				<fmt:message key="yuedu" /><!-- 我已阅读并同意 -->
				<a href="#" target="_blank"><fmt:message key="tiaokuan" /><!-- 隐私政策、服务条款 --></a>
				</label>
			</div>
			<div class="row btnArea">
				<input type="submit" class="login-btn" id="submit" value="<fmt:message key="zhuce" />"/>
			</div>
			</form>
		</div>
		<div class="go-regist">
			<fmt:message key="yiyou" /><!-- 已有帐号,请 --><a href="#" class="link"><fmt:message key="denglu" /><!-- 登录 --></a>
		</div>
	</div>
	
<div id="footer">

</div>
</div>
<div class="loading">
	
</div>
</body>
</html>