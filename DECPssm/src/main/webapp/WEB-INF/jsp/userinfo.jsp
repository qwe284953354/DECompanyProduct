<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<meta charset="utf-8" />
		<title>狗眼旅行</title>
		<link rel="icon" href="img/favicon.ico" />
		<link rel="stylesheet" type="text/css" href="css/userinfo.css" />
		<link rel="stylesheet" href="css/bootstrap.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/index.css" />
		<link rel="stylesheet" href="css/osSlider.css" /> 
		<script type="text/javascript" src="js/osSlider.js"></script>
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
		<div class="top">
			<div class="inner-top">
				<div class="logo">
					<img src="img/logo-1.png" />
				</div>
				<div class="back-home">
					<h4><a href="showAllTravel">回到主页</a></h4>
				</div>
			</div>
		</div>
		
		<div class="uio-background">
					<div class="uinfo-uorder">
						<div class="uinfo-left">
							<div class="uleft-title">
								<h1>个人中心</h1>
							</div>
							<div class="uleft-menu">
								<a href="userinfo" class="uleft-laber" style="background-color: rgba(135,206,250,1);color: white;">基本信息</a>
								<a href="userorder" class="uleft-laber">我的订单</a>
							</div>
						</div>
						<div class="uinfo-right">
							<div class="uright-title">
								<h4>基本信息</h4>
							</div>
							<div class="uright-info">
								<form>
									<div class="form-items">
										<span class="form-name"><img src="img/用.png"></span>
										<div class="form-membertype">
											<input type="text" readonly="true" class="form-control" placeholder="${user.uname }" style=" border-radius: 30px;">
										</div>
									</div>
									<div class="form-items">
										<span class="form-name"><img src="img/邮.png"></span>
										<div class="form-membertype">
											<input type="email" class="form-control" id="inputEmail" placeholder="${user.umail }" style=" border-radius: 30px;">
										</div>
									</div>
									<div class="form-items">
										<span class="form-name"><img src="img/生.png"></span>
										<div class="form-membertype">
											<input type="text" class="form-control" placeholder="${user.ubirth }" style=" border-radius: 30px;">
										</div>
									</div>
									<div class="form-items">
										<span class="form-name"><img src="img/电.png"></span>
										<div class="form-membertype">
											<input type="text" class="form-control" placeholder="${user.utel }" style=" border-radius: 30px;">
										</div>
									</div>
									<div class="form-items">
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										&nbsp;&nbsp;&nbsp;&nbsp;
										<input type="submit" value="保存" class="btn-save"/>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
		
		
		<div class="uio-footer">
			<br/><br /><br />
			<p>违法和不良信息举报电话:4006666666 举报邮箱:jubao.gouyan@gouyan.com </p>
			<p>友情链接：<a>狗眼电影</a></p>
			<p>©2016 狗眼电影 gouyan.com 京ICP证000000号 京ICP备00000000号-1 京公网安备 00000000000000号 网络文化经营许可证 电子公告服务规则</p>
			<p>杭州狗眼文化传媒有限公司</p>
		</div>
	</body>
</html>