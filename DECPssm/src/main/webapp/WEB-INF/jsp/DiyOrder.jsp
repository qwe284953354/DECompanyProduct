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
<title>狗眼旅行</title>
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="icon" href="img/favicon.ico" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-theme.css" />
<link rel="stylesheet" href="css/DiyOrder.css" />
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
				<div class="login">
					<img src="img/none-login.png"> <span
						class="glyphicon glyphicon-triangle-bottom"></span> <a
						href="login.jsp" class="loginbtn">登陆</a>
				</div>
			</div>
		</div>
	</div>
	<div class="picture">
		<img src="img/toppic01.jpg" />
	</div>
	<div class="navegation">
		<div class="btn-loc">
			<div class="typebtn tt1">
				<a id="t1" href="#">一日游</a>
				<div class="def-box" id="d1"></div>
			</div>
			<div class="typebtn">
				<a id="t2" href="#">二日游</a>
				<div class="def-box" id="d2"></div>
			</div>
			<div class="typebtn">
				<a id="t3" href="#">假日游</a>
				<div class="def-box" id="d3"></div>
			</div>
			<div class="typebtn">
				<a id="t4" href="#">定制游</a>
				<div class="def-box" id="d4"></div>
			</div>
		</div>
	</div>

	<div class="bgcolor">

		<div class="Diyloc">
			<form class="form-inline" method="post" action="">
				<div class="word-diy">
					<h1 style="font-family: '微软雅黑'; font-weight: 700;">定制游</h1>
					<br /> 在这里您可以自由的定制自己所需的旅游形式 <br /> 填写下方的表格，开始您的个性化定制旅游 <br /> <br />
					<p>
						第一步： <br /> 给您的出行取一个名字.这将会加入到我们未来的旅行计划制定的参考中
					</p>

					<div class="form-group">
						项目名：<input class="form-control" type="text" />
					</div>
					<p></p>
					<p>
						第二步： <br /> 请选择您想要游览的地区
					</p>
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
					</div>
					<p></p>
					<p>
						我们会为您安排当地的旅游项目 <br /> 第三步：请填写您已心有所向的当地景点若没有可以不填写
					</p>
					<div class="form-group">
						其他景点需求：<input class="form-control" type="text" />
					</div>
					<p></p>
					<p>
						第四步： <br /> 是否需要提供住宿，如需要我们会有专人向您联系并提供优质住宿
					</p>
					<p></p>
					<div class="form-group">
						<input type="radio" name="yesOrno" />是 &nbsp;&nbsp;&nbsp;&nbsp; <input
							type="radio" name="yesOrno" />否
					</div>
					<p></p>
					<p>十分感谢您耐心的配合，提交之后我们将会在七个工作日之内和您联系。</p>
					<div class="submitbox">
						<br />
						<div class="form-group">
							<input type="submit" class="btn btn-default" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
								type="reset" class="btn btn-default" />
						</div>
					</div>
				</div>


			</form>
		</div>

		<div class="footer">
			<br />
			<br />
			<br />
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

</body>
<script src="js/distpicker.data.js"></script>
<script src="js/distpicker.js"></script>
</html>