<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
request.setCharacterEncoding("utf-8");
 %> 
 <fmt:setBundle basename="pers.lisiyan.relestate.message.Info" />
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <title>房屋中介管理系统</title>
  		  <base href="http://localhost:8080/JHouseManger/"/>
        <link href="main/css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
        <link href="main/css/register.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <!------ Header------------>
        <header>
          <%@include file="head.jsp" %>
        </header>

        <!------ End Header ------------>
        <!------Content ------------>
        <div class="main">
            <div class="wrap">
                <div class="about">
                    <div id="form-table">
                        <h2><fmt:message key="zhuce" /><!-- 注册信息 --></h2>
                        <form method="post" action="main/test/processRentHouseadd.action" enctype="multipart/form-data">
                            <table>
                              <tr> 
                              		<td class="left-td left-td1"><span>* </span> <fmt:message key="dizhi" /><!-- 地址 --></td>
                                    <td class="right-td">
                                    	&nbsp;&nbsp;&nbsp;&nbsp;
										<input type="radio" name="sex" value='male'/><label> <fmt:message key="guonei" /><!-- 国内 --></label>
										<input name="sex" checked type="radio" value="female"/><label> <fmt:message key="guowai" /><!-- 国外 --></label>
                                    </td>
	                                
                                </tr>
                                <tr>
                                    <td class="left-td left-td1"><span>* </span> <fmt:message key="dizhi" /><!-- 地址 --></td>
                                    <td class="right-td">
                                        <input name="r_house_address" id="address" class="inputsty1 inputsty3" type="text" />
                                    </td>
                                </tr>
                              
                                <tr>
                                    <td class="left-td left-td1"><span>* </span> <fmt:message key="daxiao" /><!-- 大小 --></td>
                                    <td class="right-td">
                                        <input name="r_house_size" id="squre" class="inputsty1 inputsty2" type="text" /><span>㎡</span></td>
                                </tr>
                                <tr>
                                    <td class="left-td left-td1"><span>* </span> <fmt:message key="jiage" /><!-- 价格 --></td>
                                    <td class="right-td">
                                        <input name="r_house_price" id="price" class="inputsty1 inputsty2" type="text" /><span> <fmt:message key="yuan" /><!-- 元/季 --></span></td>
                                </tr>
                                <tr>
                                    <td class="left-td left-td1"><span>* </span> <fmt:message key="cengshu" /><!-- 层数 --></td>
                                    <td class="right-td">
                                        <select name="r_house_floor" id="floor" class="">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                        </select>
                                        <span> <fmt:message key="ceng" /><!-- 层 --></span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="left-td left-td1"><fmt:message key="shangchuan" /><!-- 文件上传 --></td>
                                    <td class="right-td">
                                        <input name="photo" id="localfiles" class="inputsty1" type="file" />
                                    </td>
                                </tr>
                                <tr>
                                    <td class="left-td2" colspan="2"><fmt:message key="fujia" /><!-- 附加信息 --></td>
                                </tr>
                                <tr>
                                    <td class="left-td left-td1"></td>
                                    <td class="">
                                        <textarea name="r_house_note" cols="40" rows="15"></textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="left-td3" colspan="2">
                                        <input name="" type="submit" id="submit" value="注册">
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
                <!------End Content ------------>
                <div class="footer">
                    <div class="footer-top">
                        <div class="col_1_of_4 span_1_of_4">
                            <h3>INFORMATION</h3>
                            <ul>
                                <li><a href="#">About us</a></li>
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
                                <p>Email:<a class="email-link" href="#">email(at)realdeal.com</a></p>
                            </div>
                            <ul class="follow_icon">
                                <li>
                                    <a href="#" style="opacity: 1;"><img src="main/images/facebook.png" alt=""></a>
                                </li>
                                <li>
                                    <a href="#" style="opacity: 1;"><img src="main/images/twitter.png" alt=""></a>
                                </li>
                                <li>
                                    <a href="#" style="opacity: 1;"><img src="main/images/feed.png" alt=""></a>
                                </li>
                            </ul>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>
    </body>

    </html>
