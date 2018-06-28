<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="http://localhost:8080/JHouseManger/" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="employee/css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.STYLE3 {
	font-weight: bold;
	font-size: 18px;
	font-family: "宋体";
}

#main {
	float:left;
	margin-left:400px;
}
#left{
float:left;
}
-->
</style>
<link rel="stylesheet" type="text/css" href="../css/oa.css">

</head>
<h4>主页</h4>
<body>
	<div id="header">
		<%@ include file="../../include/header.jsp"%>
		<div id="mainarea">
			<div id="left">
			
				<%@include file="../../include/left.jsp"%>
			</div>
			<div id="main">
				<div id="container">
					<div id="jobPublish">
					
						今日公告<br/>
						沈房权证（区）字第。 市件：沈房权证市（区）字第；沈房权证（中心）字第。
						 简单区分来看的话第一次与开发商交易如果是全款基本上为区件，
						 贷款为市件。
						<div class="c"></div>
					</div>
				</div>
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>

</body>
</html>



