<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>	
<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8" />
		<title>狗眼旅行</title>
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="icon" href="img/favicon.ico" />
		<link rel="stylesheet" href="css/bootstrap.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/index.css" />
		<link rel="stylesheet" href="css/osSlider.css" /> 
		<script type="text/javascript" src="js/osSlider.js"></script>
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script>
			$(function() {
				$(".lefta").mouseover(function() {
					$(".left").stop().animate({
						opacity: '1',
						height: "120px",
					}, "slow")
				}).mouseout(function() {
					$(".left").stop().animate({
						height: "0px",
						opacity: '0',
					}, "slow")
				})

				$(".righta").mouseover(function() {
					$(".right").stop().animate({
						opacity: '1',
						height: "120px",
					}, "slow")
				}).mouseout(function() {
					$(".right").stop().animate({
						height: "0px",
						opacity: '0',
					}, "slow")
				})

				var slider = new osSlider({ //开始创建效果
					pNode: '.slider', //容器的选择器 必填
					cNode: '.slider-main li', //轮播体的选择器 必填
					speed: 3000, //速度 默认3000 可不填写
					autoPlay: true //是否自动播放 默认true 可不填写
				});
			})
		</script>
	</head>

	<body>
		<div class="top">
			<div class="inner-top">
				<div class="logo">
					<img src="img/logo-1.png" />
				</div>
			</div>
		</div>

		<div class="middle">
			<div class="slider">
				<ul class="slider-main">
					<li>
						<img src="img/1.jpg" alt="">
					</li>
					<li>
						<img src="img/2.jpg" alt="">
					</li>
					<li>
						<img src="img/3.jpg" alt="">
					</li>
					<li>
						<img src="img/4.jpg" alt="">
					</li>
				</ul>
			</div>
		</div>
		
		<div class="main">
			<hr style="z-index: 999; margin-top: 650px; border: none; height: 2px; background-color: rgba(255,0,0,0.4); width: 80%; margin-left: 10%;" />
			<div class="ci">Dog Eyes</div>
			<div class="introduce">我们致力于打造优质的出游生活...</div>
			<div class="left">
				<ul>
					<li>特色景点</li>
					<li>假期折扣</li>
					<li>全家出行游</li>
				</ul>
			</div>
			<div class="right">
				<ul>
					<li>高品质住房</li>
					<li>假期折扣</li>
					<li>常住</li>
				</ul>
			</div>
		</div>
		<div class="select">
			<div class="travel">
				<div class="word to">选择旅游？</div>
				<div class="button-loc">
					<a href="showAllTravel" class="lefta">Travel</a>
					<!--描述：特效-->
				</div>
			</div>
			<div class="OR">OR?</div>
			<div class="hotel">
				<div class="button-loc">
					<a href="#" class="righta">Hotel</a>
					<!--描述：特效-->
				</div>
				<div class="word bo">选择住宿？</div>
			</div>
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