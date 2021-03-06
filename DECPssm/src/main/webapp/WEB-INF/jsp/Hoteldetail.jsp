<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ path +"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basepath%>">
<meta charset="UTF-8">
		<title>狗眼旅行</title>
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="icon" href="img/favicon.ico" />
		<link rel="stylesheet" href="css/bootstrap.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-theme.css" />
		<link rel="stylesheet" href="css/Hoteldetail.css" />
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script type="text/javascript" src="js/Travelmain.js"></script>
</head>
<body>
		<div class="top">
			<div class="inner-top">
				<div class="logo">
					<img src="img/logo-1.png" />
				</div>
				<div class="form-loc">
					<c:if test="${uname == null }">
					<div class="login">
						<img src="img/none-login.png"> <span
							class="glyphicon glyphicon-triangle-bottom"></span> <a
							href="Hotel/login" class="loginbtn">登陆</a>
					</div>
				</c:if>
				<c:if test="${uname != null }">
					<div class="logined">
						<span>您好：&nbsp;${uname}</span> <br /> <a href="userinfo.jsp">个人空间</a>
					</div>
				</c:if>
				</div>
			</div>
		</div>
		<div class="picture">
			<img src="img/toppic01.jpg" />
		</div>
		<div class="navegation">
		</div>
		<div class="bgcolor">
			<div class="detailmain">
				<div class="split"></div>
				<div class="hotelpicture">
					<img src="${hotel.himg}"/>
				</div>
				<div class="hoteldetail">
					<table >
						<tr>
							<th>酒店名称：</th>
							<td>${hotel.hname}</td>
						</tr>
						<tr>
							<th>星级：</th>
							<td>${hotel.hstar}</td>
						</tr>
						<tr>
							<th>类型：</th>
							<td>${hotel.htype}</td>
						</tr>
						<tr>
							<th>地址：</th>
							<td>${hotel.haddress}</td>
						</tr>
						<tr>
							<th>评分：</th>
							<td>${hotel.hmark}</td>
						</tr>
					</table>
				</div>
				
				
					<div class="hotelroom">
					<c:forEach items="${hrlist }" var="hr">
						<div class="room">
							<img src="${hr.himg }" />
							<div class="rname">
								${hr.hrname }
							</div>
							<div class="rdetail">
								上网  WiFi和宽带&nbsp;&nbsp;|&nbsp;&nbsp;
								床&nbsp;${hr.hbed }&nbsp;张&nbsp;&nbsp;|&nbsp;&nbsp;
								可住&nbsp;${hr.hpeople }&nbsp;人&nbsp;&nbsp;|&nbsp;&nbsp;
								窗户&nbsp;有
							</div>
							<div class="rprice">
								￥${hr.hprice }
							</div>
							<div class="btn-room">
								<form:form modelAttribute="hotelOrder" method="post" action="./Hotel/detail/addOrder">
									<div class="uy">
										<input name="hid" value="${hotel.hid}">
										<input name="hoprice" value="${hr.hprice}">
										<input name="uid" value="1">
										<input name="honame" value="张三">
										<input name="hodate" value="2018-07-04">
										<input name="hotel" value="13369869544">
										<input name="hobooktime" value="18:00">
									</div>	
									<input type="submit" class="buybtn" value="立即预订">
								</form:form>	
							</div>
						</div>
						</c:forEach>
					</div>
				
			</div>
			<div class="footer">
				<br/><br /><br />
				<p>违法和不良信息举报电话:4006666666 举报邮箱:jubao.gouyan@gouyan.com </p>
				<p>友情链接：
					<a>狗眼电影</a>
				</p>
				<p>©2016 狗眼电影 gouyan.com 京ICP证000000号 京ICP备00000000号-1 京公网安备 00000000000000号 网络文化经营许可证 电子公告服务规则</p>
				<p>杭州狗眼文化传媒有限公司</p>
			</div>
		</div>
		<a style="display:none" href="javascript:;" id="btn" title="回到顶部"></a>

		<div class="location">
			<span>选择城市</span>
			<div class="address">
				<form class="form-inline">
					<div data-toggle="distpicker">
						<div class="form-group">
							<label class="sr-only" for="province">Province</label>
							<select class="form-control" id="province" data-province="---- 选择省 ----"></select>
						</div>
						<div class="form-group">
							<label class="sr-only" for="city">City</label>
							<select class="form-control" id="city" data-city="---- 选择市 ----" style="width: 150px;"></select>
						</div>
						<div class="form-group">
							<button class="btn btn-primary" id="confirm" type="button">确定</button>
						</div>
					</div>

				</form>
			</div>
		</div>
	</body>
	<script src="js/distpicker.data.js"></script>
	<script src="js/distpicker.js"></script>
</html>