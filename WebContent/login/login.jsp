<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="java.util.List" import="java.util.*"  import="java.sql.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房屋中介管理系统</title>
<base href="http://localhost:8080/JHouseManger/"/>
<style>
*{
	padding:0px;
	margin:0px;
	}

body{
	font-family:Arial, Helvetica, sans-serif;
	background:url(login/images/grass.jpg);
	background-repeat: no-repeat;  
    background-size: 100%; 
	}
img{
	border:0;
	}
.lg{width:468px; height:468px; margin:100px auto; background:url(login/images/login_bg.png) no-repeat;}
.lg_top{ height:200px; width:468px;}
.lg_main{width:400px; height:180px; margin:0 25px;}
.lg_m_1{
	width:290px;
	height:100px;
	padding:60px 55px 20px 55px;
}
.ur{
	height:37px;
	border:0;
	color:#666;
	width:232px;
	margin:4px 28px;
	background:url(login/images/user.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;
}
.pw{
	height:37px;
	border:0;
	color:#666;
	width:232px;
	margin:4px 28px;
	background:url(login/images/password.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;

}
.bn{width:330px; height:72px; background:url(login/images/enter.png) no-repeat; border:0; display:block; font-size:18px; color:#FFF; font-family:Arial, Helvetica, sans-serif; font-weight:bolder;cursor: pointer;}
.lg_foot{
	height:80px;
	width:330px;
	padding: 6px 68px 0 68px;
}
</style>
</head>

<body class="b">
<div class="lg">
<form action="login/login.action" method="post">
    <div class="lg_top"></div>
    <div class="lg_main">
        <div class="lg_m_1">
        
<!--         <input name="username" placeholder="username" class="ur" />
             <input name="password" type="password" placeholder="password" class="pw" /> 
-->
        <s:textfield name="id" class="ur"/>
		<s:fielderror fieldName="id" ></s:fielderror>
        <s:password name="password" class="pw"></s:password>
        
        </div>
    </div>
    <div class="lg_foot">
    <!-- <input type="submit" value="Login In" class="bn" /></div> -->
    <s:submit value="Login In" class="bn" key="login.submit"/>
</form>
</body>
</html>