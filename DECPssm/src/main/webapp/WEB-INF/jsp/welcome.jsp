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
		<title>网站后台管理</title>
		<link rel="stylesheet" type="text/css" href="layui/css/layui.css"/>
		<link rel="stylesheet" type="text/css" href="css/admin.css"/>
	</head>
	<body>
		<div class="wrap-container welcome-container">
			<div class="row">
				<div class="welcome-left-container col-lg-9">
					<div class="data-show">
						<ul class="clearfix">
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg bg-org f-l">
										<span class="iconfont">&#xe606;</span>
									</div>
									<div class="right-text-con">
										<p class="name">用户数</p>
										<p><span class="color-org">89</span></p>
									</div>
								</a>
							</li>
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg bg-blue f-l">
										<span class="iconfont">&#xe604;</span>
									</div>
									<div class="right-text-con">
										<p class="name">景点数</p>
										<p><span class="color-blue">189</span></p>
									</div>
								</a>
							</li>
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg layui-bg-orange f-l">
										<span class="layui-icon" style="font-size: 50px; color: white;">&#xe62e;</span>
									</div>
									<div class="right-text-con">
										<p class="name">酒店数</p>
										<p><span class="color-green">221</span></p>
									</div>
								</a>
							</li>
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg bg-green f-l">
										<span class="iconfont">&#xe607;</span>
									</div>
									<div class="right-text-con">
										<p class="name">旅行项目数</p>
										<p><span class="color-green">20</span></p>
									</div>
								</a>
							</li>
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg layui-bg-green f-l">
										<span class="iconfont">&#xe608;</span>
									</div>
									<div class="right-text-con">
										<p class="name">订单数</p>
										<p><span class="color-green">10</span></p>
									</div>
								</a>
							</li>
							
						</ul>
					</div>
					<!--留言-->
					<div class="chart-panel panel panel-default">
						<div class="panel-body" id="chart" style="height: 400px;">
							<div class="panel-header">最新留言</div>
						<div class="panel-body">
							<div class="commentbox">
								<ul class="commentList">
								  <li class="item cl"> <a href="#"><i class="avatar size-L radius"><img alt="" src="#"></i></a>
								    <div class="comment-main">
								      <header class="comment-header">
								        <div class="comment-meta"><a class="comment-author" href="#">UY</a> 评论于
								          <time title="2014年8月31日 下午3:20" datetime="2014-08-31T03:54:20">2018-06-25 15:20</time>
								        </div>
								      </header>
								      <div class="comment-body">
								        <p><a href="#">@所有人</a> 感谢您使用狗眼后台！！！</p>
								      </div>
								    </div>
								  </li>
								  <li class="item cl"> <a href="#"><i class="avatar size-L radius"><img alt="" src="#"></i></a>
								    <div class="comment-main">
								      <header class="comment-header">
								        <div class="comment-meta"><a class="comment-author" href="#">HMC</a> 评论于
								          <time title="2014年8月31日 下午3:20" datetime="2014-08-31T03:54:20">2014-8-31 15:20</time>
								        </div>
								      </header>
								      <div class="comment-body">
								        <p><a href="#">@所有人</a> 9999999</p>
								      </div>
								    </div>
								  </li>
								   <li class="item cl"> <a href="#"><i class="avatar size-L radius"><img alt="" src="#"></i></a>
								    <div class="comment-main">
								      <header class="comment-header">
								        <div class="comment-meta"><a class="comment-author" href="#">WST</a> 评论于
								          <time title="2014年8月31日 下午3:20" datetime="2014-08-31T03:54:20">2014-8-31 15:20</time>
								        </div>
								      </header>
								      <div class="comment-body">
								        <p><a href="#">@所有人</a> 6666666</p>
								      </div>
								    </div>
								  </li>
								</ul>
							</div>
							<div id="pagesbox" style="text-align: center;padding-top: 5px;">
								
							</div>
						</div>
						</div>
					</div>
					<!--服务器信息-->
					<div class="server-panel panel panel-default">
						<div class="panel-header">服务器信息</div>
						<div class="panel-body clearfix">
							<div class="col-md-2">
								<p class="title">服务器环境</p>
								<span class="info">Apache/2.4.4 (Win32) PHP/5.4.16</span>
							</div>
							<div class="col-md-2">
								<p class="title">服务器IP地址</p>
								<span class="info">127.0.0.1   </span>
							</div>
							<div class="col-md-2">
								<p class="title">服务器域名</p>
								<span class="info">localhost </span>
							</div>
							<div class="col-md-2">
								<p class="title"> PHP版本</p>
								<span class="info">5.4.16</span>
							</div>
							<div class="col-md-2">
								<p class="title">数据库信息</p>
								<span class="info">5.6.12-log </span>
							</div>
							<div class="col-md-2">
								<p class="title">服务器当前时间</p>
								<span class="info">2018-06-29 15:23:33</span>
							</div>
						</div>
					</div>
				</div>
				<div class="welcome-edge col-lg-3">
					
					<!--关于-->
					<div class="panel panel-default contact-panel">
						<div class="panel-header">关于我们</div>
						<div class="panel-body">
							<p>感谢您使用狗眼公司管理系统</p>
							<p>有任何问题请使用以下联系方式</p>
							<p>QQ：1234567890</p>
							<p>E-mail:123456@qq.com</p>
							<p>Phone：11100002345</p>
							<p>地址：xx省xx市xx区xx街道xxx号</p>	
						</div>
						<div class="panel-header">违法举报</div>
						<div class="panel-body">
							<p>违法和不良信息举报电话:4006666666</p>
							<p>举报邮箱:jubao.gouyan@gouyan.com</p>
							<p>©2016 狗眼电影 gouyan.com </p>
							<p>京ICP证000000号</p>
							<p>京ICP备00000000号-1</p>
							<p>京公安网备 00000000000000号</p>	
							<p>网络文化经营许可证 电子公告服务规则</p>
						</div>
						<div class="panel-body">
							<p>杭州狗眼文化传媒有限公司</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="lib/echarts/echarts.js"></script>
		<script type="text/javascript"></script>
	</body>
</html>
