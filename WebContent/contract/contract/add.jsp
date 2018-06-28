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
<h4>增加员工</h4>
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
						<form action="contract/contract/processadd.action" method="post">
							甲方：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
								name="sellUserId" value="${sellUserId}" /><br />
							<br /> 乙方：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
								name="userId" value="${userId}"/><br />
							<br /> 内容：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
								name="c_note" value=""/><br />
							<br /> 房屋id：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="text" name="s_house_id" value="${s_house_id}"/><br />
							<br /> <input type="submit" value="提交" /><br />
						</form>
						<div class="select">
							<a href="employee/emp/toempadd.do">添加合同信息</a>
						</div>
						<div class="c"></div>
					</div>
				</div>
			</div>
		<div style="clear:both;"></div>
		</div>
	</div>

</body>
</html>



