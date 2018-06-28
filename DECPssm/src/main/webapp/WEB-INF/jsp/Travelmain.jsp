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
		<title>狗眼旅行</title>
		<link rel="icon" href="img/favicon.ico" />
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="css/bootstrap.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-theme.css" />
		<link rel="stylesheet" href="css/Travelmain.css" />
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script type="text/javascript" src="js/Travelmain.js" ></script>
	</head>

	<body>
		<div class="top">
			<div class="inner-top">
				<div class="logo">
					<img src="img/logo-1.png" />
				</div>
				<div class="form-loc">
					<div class="login">
						<img src="img/none-login.png">
						<span class="glyphicon glyphicon-chevron-down"></span>
						<a href="login.jsp" class="loginbtn">登陆</a>
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
			<c:forEach items="${tlist }" var="t">
				<!-- items循环体开始 -->
			<div class="items">
				<div class="borders">
					<div class="photoes">
						${t.tsid }
					</div>
					<div class="details-info">					
						<div class="titlebox name">
							${t.tname }
						</div>
						<div class="detailbox type">
							类型：${t.ttid }
						</div>
						<div class="detailbox scenic">
							包含景点：${t.tsid }
						</div>
						<div class="detailbox city">
							所在城市：${t.cid }
						</div>
						<div class="detailbox dates">
							出发日期：${t.tdate }
						</div>
						<div class="detailbox price">
							¥${t.tprice }
						</div>
						<div class="introduce">
							&nbsp;&nbsp;&nbsp;&nbsp;
							${t.tdetail }
						</div>
						<div class="buy">
							<button class="buybtn">立刻预订</button>
						</div>
					</div>
				</div>
			</div>
			<br />
			<hr style="border: dashed 1.5px; border-color: rgba(0,100,255,0.6); border-radius: 10px; height: 0.5px; width: 90%; margin-left: 5%;" />
			<!-- items循环体结束 -->
			</c:forEach>
			<!-- items循环体开始 -->
			<div class="items">
				<div class="borders">
					<div class="photoes">
						<img src="img/西湖.jpg" />
					</div>
					<div class="details-info">					
						<div class="titlebox name">
							杭州京杭大运河+杭州宋城景区半自助一日游杭州京杭大运河+杭州宋城景区半自助一日游
						</div>
						<div class="detailbox type">
							类型：一日游
						</div>
						<div class="detailbox scenic">
							包含景点：京杭大运河,杭州宋城景区
						</div>
						<div class="detailbox city">
							所在城市：杭州
						</div>
						<div class="detailbox dates">
							出发日期：2018-10-01
						</div>
						<div class="detailbox price">
							¥188
						</div>
						<div class="introduce">
							&nbsp;&nbsp;&nbsp;&nbsp;
							杭州京杭大运河+杭州宋城景区半自助一日游【下午13：00集合，含宋城演出+运河游船+车费】集合：小河路336号中国刀剪剑博物馆西门口集合
							具体时间地点以导游通知为准。（出发前一天21:30之前会电话短信通知，出发前一天21:30之后预定的游客，当天早上10:00通知）
							桥西直街依着拱宸桥，这里有着近现代工业发展的痕迹，大量保留着肌理的街巷里弄、传统合院，还有住了一辈子的原住民。
							最难得的是，作为近现代工业遗产的那些旧产房，因为工美博物馆群的进驻，让“遗产”散发着新的魅力。
							1889年，拱宸桥西，建起了杭州最早的机械纺织企业——通益公纱厂，拉开了杭州近代工业的序幕，这就是杭一棉的前身。
							很多住在桥西一带的居民，从十几岁就进到了厂里上班，一直干到退休。
							杭州京杭大运河+杭州宋城景区半自助一日游【下午13：00集合，含宋城演出+运河游船+车费】集合：小河路336号中国刀剪剑博物馆西门口集合
							具体时间地点以导游通知为准。（出发前一天21:30之前会电话短信通知，出发前一天21:30之后预定的游客，当天早上10:00通知）
						</div>
						<div class="buy">
							<button class="buybtn">立刻预订</button>
						</div>
					</div>
				</div>
			</div>
			<br />
			<hr style="border: dashed 1.5px; border-color: rgba(0,100,255,0.6); border-radius: 10px; height: 0.5px; width: 90%; margin-left: 5%;" />
			<!-- items循环体结束 -->

			
			
		<div class="footer">
			<br/><br /><br />
			<p>违法和不良信息举报电话:4006666666 举报邮箱:jubao.gouyan@gouyan.com </p>
			<p>友情链接：<a>狗眼电影</a></p>
			<p>©2016 狗眼电影 gouyan.com 京ICP证000000号 京ICP备00000000号-1 京公网安备 00000000000000号 网络文化经营许可证 电子公告服务规则</p>
			<p>杭州狗眼文化传媒有限公司</p>
		</div>
		</div>

		<a style="display:none" href="javascript:;" id="btn" title="回到顶部"></a>

		<div class="location">
			<span>选择城市</span>
			<div class="address">
				<form class="form-inline">
				<div data-toggle="distpicker" >
					<div class="form-group" >
						<label class="sr-only" for="province" >Province</label>
						<select class="form-control" id="province" data-province="---- 选择省 ----"></select>
					</div>
					<div class="form-group">
						<label class="sr-only" for="city">City</label>
						<select class="form-control" id="city" data-city="---- 选择市 ----" style="width: 150px;" ></select>
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