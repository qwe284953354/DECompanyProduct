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
		<meta charset="UTF-8">
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>狗眼旅行|后台</title>
		<link rel="icon" href="img/favicon.ico" />
		<link rel="stylesheet" type="text/css" href="layui/css/layui.css"/>
		<link rel="stylesheet" type="text/css" href="css/admin.css"/>
	</head>
	<body>
		<div class="main-layout" id='main-layout'>
			<!--侧边栏-->
			<div class="main-layout-side">
				<div class="m-logo">
				</div>
				<ul class="layui-nav layui-nav-tree" lay-filter="leftNav">
				  <li class="layui-nav-item">
				    <a href="javascript:;" data-url="Admin/Adminuser" data-id='1' data-text="用户管理"><i class="iconfont">&#xe606;</i>用户管理</a>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe607;</i>内容管理</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;" data-url="Admin/Admintravel" data-id='2' data-text="旅行管理"><span class="l-line"></span>旅行管理</a></dd>
				      <dd><a href="javascript:;" data-url="Admin/Adminscenic" data-id='3' data-text="景点管理"><span class="l-line"></span>景点管理</a></dd>
				      <dd><a href="javascript:;" data-url="Admin/Adminhotel" data-id='4' data-text="酒店管理"><span class="l-line"></span>酒店管理</a></dd>
				    </dl>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe608;</i>订单管理</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;" data-url="Admin/Admintorder" data-id='5' data-text="旅行订单管理"><span class="l-line"></span>旅行订单管理</a></dd>
				      <dd><a href="javascript:;" data-url="Admin/Adminhorder" data-id='6' data-text="住宿订单管理"><span class="l-line"></span>住宿订单管理</a></dd>
				    </dl>
				  </li>
				</ul>
			</div>
			<!--右侧内容-->
			<div class="main-layout-container">
				<!--头部-->
				<div class="main-layout-header">
					<div class="menu-btn" id="hideBtn">
						<a href="javascript:;">
							<span class="iconfont">&#xe60e;</span>
						</a>
					</div>
					<ul class="layui-nav" lay-filter="rightNav">
					  <li class="layui-nav-item">
					    <a href="javascript:;">超级管理员HMC</a>
					  </li>
					  <li class="layui-nav-item"><a href="javascript:;">退出</a></li>
					</ul>
				</div>
				<!--主体内容-->
				<div class="main-layout-body">
					<!--tab 切换-->
					<div class="layui-tab layui-tab-brief main-layout-tab" lay-filter="tab" lay-allowClose="true">
					  <ul class="layui-tab-title">
					    <li class="layui-this welcome">后台主页</li>
					  </ul>
					  <div class="layui-tab-content">
					    <div class="layui-tab-item layui-show" style="background: #f5f5f5;">
					    	<!--1-->
					    	<iframe src="welcome.jsp" width="100%" height="100%" name="iframe" scrolling="auto" class="iframe" framborder="0"></iframe>
					    	<!--1end-->
					    </div>
					  </div>
					</div>
				</div>
			</div>
			<!--遮罩-->
			<div class="main-mask">
				
			</div>
		</div>
		<script type="text/javascript">
			var scope={
				link:'welcome.jsp'
			}
		</script>
		<script src="layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/common.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/main.js" type="text/javascript" charset="utf-8"></script>
		
	</body>
</html>
