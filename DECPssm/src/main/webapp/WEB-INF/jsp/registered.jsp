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
<meta charset="UTF-8">
		<title>狗眼旅行</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="css/registered.css" />
		<link rel="icon" href="img/favicon.ico" />
		<link rel="stylesheet" href="css/bootstrap.css" />
		<link rel="stylesheet" href="css/bootstrap-theme.css" />
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
		<div class="logo">
			<img src="img/logo02.png" />
		</div>
		<br />
		<hr style="height:2px;border:none;background-color: lightblue; width: 60%; margin: 0 auto;" />
		<div class="login-form-loc">
			<form method="post" class="form-type">
				<div class="title">
					<span>用户注册</span>
				</div>
				<div class="body">
					<div class="form-items">
						<span class="form-name"><img src="img/用.png"></span>
						<div class="form-membertype">
							<input type="text" class="form-control" placeholder="请输入用户名..." style=" border-radius: 30px;">
						</div>
					</div>
					<div class="form-items">
						<span class="form-name"><img src="img/密.png"></span>
						<div class="form-membertype">
							<input type="password" class="form-control" placeholder="请输入密码..." style=" border-radius: 30px;">
						</div>
					</div>
					<div class="form-items">
						<span class="form-name"><img src="img/邮.png"></span>
						<div class="form-membertype">
							<input type="email" class="form-control" id="inputEmail" placeholder="请输入您的邮箱..." style=" border-radius: 30px;">
						</div>
					</div>
					<div class="form-items">
						<span class="form-name"><img src="img/生.png"></span>
						<div class="form-membertype">
							<input type="text" class="form-control" placeholder="请输入您的生日..." style=" border-radius: 30px;">
						</div>
					</div>
					<div class="form-items">
						<span class="form-name"><img src="img/电.png"></span>
						<div class="form-membertype">
							<input type="text" class="form-control" placeholder="请输入您的电话号码..." style=" border-radius: 30px;">
						</div>
					</div>
					
					<div class="form-items">
						<input type="submit" value="确认注册" class="btn-registered"/>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset"  class="btn-registered"/>
					</div>
			</form>
			</div>
			<div class="footer">
				<br/><br /><br />
				<p>违法和不良信息举报电话:4006666666 举报邮箱:jubao.gouyan@gouyan.com </p>
				<p>友情链接：<a>狗眼电影</a></p>
				<p>©2016 狗眼电影 gouyan.com 京ICP证000000号 京ICP备00000000号-1 京公网安备 00000000000000号 网络文化经营许可证 电子公告服务规则</p>
				<p>杭州狗眼文化传媒有限公司</p>
			</div>
	</body>
</html>