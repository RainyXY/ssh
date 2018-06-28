<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
							<caption>合同信息</caption>
							<thead>
								<tr>
									<th width="60" height="30px">房主</th>
									<th width="100">合同id</th>
									<th width="100">房屋号</th>
									<th width="100"></th>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="contract" items="${contractModels}">
									<tr class="bgColor_02">
										<td>${contract.user_id}</td>
										<td>${contract.c_id}</td>
										<td>${contract.house_id}</td>
									</tr>
								</c:forEach>			
					
							</tbody>
							<tfoot>
								<tr>
						</table>
					</form>
					<div class="select">
						<a href="contract/contract/tomodify.action">查询合同信息</a>
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

