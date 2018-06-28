<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>
<base href="http://localhost:8080/JHouseManger/" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房屋中介管理系统</title>
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
<fmt:setLocale value="zh_CN" />
<fmt:setBundle basename="com.city.oa.message.Info" />
</head>
<body>
	<div id="header">
		<%@ include file="../../include/header.jsp"%>
	</div>
	<div id="mainarea">
		<div id="left">
			<%@include file="../../include/left.jsp"%>
		</div>
		<div id="main">
			<div id="container">
				<div id="jobPublish">
					<form>
						<table cellpadding="0" cellspacing="1" border="0" width="700px">
							<caption>用户实名制验证</caption>
							<thead>
								<tr>
									<th width="60" height="30px">用户身份证号</th>
									<th width="100">用户姓名</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="identityModel" items="${identityModels}">
									<tr class="bgColor_02">
										<td>${identityModel.i_id}</td>
										<td>${identityModel.user_id}</td>
										<td><a
											href="employee/emp/ ?id=${identityModel.i_id}">修改</a>&nbsp;&nbsp;<a
											href="employee/emp/processdelete?i_id=${identityModel.i_id}">删除</a></td>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
						</table>
					</form>
					<div class="select">
						<a href="employee/emp/toadd.action">实名制认证合同·</a>
					</div>
					<div class="c"></div>
				</div>
			</div>
		</div>
		<div style="clear:both;"></div>
	</div>
	<div id="footer">
		<%@ include file="../../include/footer.jsp"%>
	</div>
</body>
</html>