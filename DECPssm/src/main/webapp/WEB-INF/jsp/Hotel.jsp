<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basepath%>">
<meta charset="UTF-8">
<title>狗眼住宿</title>
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="icon" href="img/favicon.ico" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-theme.css" />
<link rel="stylesheet" href="css/Travelmain.css" />
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
		<img src="img/酒店主页.jpg" />
	</div>
	<div class="navegation">
		<div class="btn-loc">
			<div class="typebtn tt1">
				<a id="t1" href="Hotel/showHotel/经济型">经济型</a>
				<div class="def-box" id="d1"></div>
			</div>
			<div class="typebtn">
				<a id="t2" href="Hotel/showHotel/舒适三星">舒适三星</a>
				<div class="def-box" id="d2"></div>
			</div>
			<div class="typebtn">
				<a id="t3" href="Hotel/showHotel/高档四星">高档四星</a>
				<div class="def-box" id="d3"></div>
			</div>
			<div class="typebtn">
				<a id="t4" href="Hotel/showHotel/豪华五星">豪华五星</a>
				<div class="def-box" id="d4"></div>
			</div>
		</div>
	</div>

	<div class="bgcolor">
	<c:forEach items="${hlist }" var="h">
		<!-- items循环体开始 -->
		<div class="items">
			<div class="borders">
				<div class="photoes">
					<img src="${h.himg} " />
				</div>
				<div class="details-info">
					<div class="titlebox name">${h.hname}</div>
					<div class="detailbox type">${h.htype}</div>
					<div class="detailbox haddress">${h.haddress}</div>
					<div class="detailbox hstar">${h.hstar}</div>
					<div class="detailbox price">
						￥${h.hotelRoom.hprice} <i class="smallnumber">起</i>
					</div>
					<div class="detailbox hmark">
						${h.hmark} <i class="smallnumber">分</i>
					</div>
					<div class="buy">
						<a href="./Hotel/detail?hid=${h.hid}">
							<button class="buybtn">详情</button>
						</a>
					</div>
					<div class="listbox">
						<img src="img/listbox-01.png" />
					</div>
				</div>
			</div>
		</div>
		<br />
		<hr
			style="border: dashed 1.5px; border-color: rgba(0, 100, 255, 0.6); border-radius: 10px; height: 0.5px; width: 90%; margin-left: 5%;" />
	</c:forEach>

		<div class="footer">
			<br /> <br /> <br />
			<p>违法和不良信息举报电话:4006666666 举报邮箱:jubao.gouyan@gouyan.com</p>
			<p>
				友情链接：<a>狗眼电影</a>
			</p>
			<p>©2016 狗眼电影 gouyan.com 京ICP证000000号 京ICP备00000000号-1 京公网安备
				00000000000000号 网络文化经营许可证 电子公告服务规则</p>
			<p>杭州狗眼文化传媒有限公司</p>
		</div>
	</div>

	<a style="display: none" href="javascript:;" id="btn" title="回到顶部"></a>

	<div class="location">
		<span>选择城市</span>
		<div class="address">
			<form class="form-inline">
				<div data-toggle="distpicker">
					<div class="form-group">
						<label class="sr-only" for="province">Province</label> <select
							class="form-control" id="province" data-province="---- 选择省 ----"></select>
					</div>
					<div class="form-group">
						<label class="sr-only" for="city">City</label> <select
							class="form-control" id="city" data-city="---- 选择市 ----"
							style="width: 150px;"></select>
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