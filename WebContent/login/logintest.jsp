<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="java.util.List" import="java.util.*"  import="java.sql.*" pageEncoding="UTF-8"%>
   
   
   <%@ taglib uri="/struts-tags" prefix="s" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Paper Stack</title>
	 <base href="http://localhost:8080/JHouseManger/"/>
<link rel="stylesheet" type="text/css" href="login/resources/style/login.css" />
<script type="text/javascript" src="login/resources/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="login/resources/js/jquery.form.js"></script>


</head>
<body>

<div class="container">
	<section id="content">
		<form action="login/login.action" method="post">
			<h1>Login Form</h1>
			<div>
			
			<s:textfield name="id"/>
			<s:fielderror fieldName="id"></s:fielderror>

			</div>
			<div>
			
			<s:password name="password"></s:password>
				
			</div>

			<s:submit key="login.submit"/>
		</form><!-- form -->
		<div class="button">
			<a href="#">Download source file</a>
		</div><!-- button -->
	</section
	><!-- content -->
</div><!-- container -->
</body>
</html>