<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%
request.setCharacterEncoding("utf-8");
 %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrap-box"></div>
    <div class="header">
        <div class="header-top">
            <div class="wrap">
                <div class="top-header-left">
                    <p>+15541166003 张晓雨</p>
                </div>

                <div class="clear"> </div>
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
							</li>
						</ul>
					</form>
				</div>
				<div class="clear"></div>
			</div>
		</div>
    </div>
</body>
</html>