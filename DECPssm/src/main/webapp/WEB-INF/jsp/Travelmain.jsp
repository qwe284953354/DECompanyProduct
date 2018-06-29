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
		<c:if test="${msg1!=null }">
			<script type="text/javascript">
				alert("暂无此城市信息");
			</script>
		</c:if>
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
							href="tologin" class="loginbtn">登陆</a>
					</div>
				</c:if>
				<c:if test="${uname != null }">
					<div class="logined">
						<span>您好：&nbsp;${uname}</span> <br /> <a href="userinfo?username=${uname }">个人空间</a>
					</div>
				</c:if>
					<!-- <div class="login">
						<img src="img/none-login.png">
						<span class="glyphicon glyphicon-chevron-down"></span>
						<a href="login.jsp" class="loginbtn">登陆</a>
					</div> -->
				</div>
			</div>
		</div>
		<div class="picture">
			<img src="img/toppic01.jpg" />
		</div>
		<div class="navegation">
			<div class="btn-loc">
				<div class="typebtn tt1">
					<a id="t1" href="oneDay">一日游</a>
					<div class="def-box" id="d1"></div>
				</div>
				<div class="typebtn">
					<a id="t2" href="twoDay">二日游</a>
					<div class="def-box" id="d2"></div>
				</div>
				<div class="typebtn">
					<a id="t3" href="threeDay">假日游</a>
					<div class="def-box" id="d3"></div>
				</div>
				<div class="typebtn">
					<a id="t4" href="diyOrder">定制游</a>
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
							类型：${t.travelType.ttname }
						</div>
						<div class="detailbox scenic">
							包含景点：${t.travelScenic.tsdetail }
						</div>
						<div class="detailbox city">
							所在城市：${t.city.cname }
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
				<form class="form-inline" action="selectCity" method="post">
				<div data-toggle="distpicker" >
					<div class="form-group" >
						<label class="sr-only" for="province" >Province</label>
						<select class="form-control" id="province" name="province" data-province="---- 选择省 ----"></select>
					</div>
					<div class="form-group">
						<label class="sr-only" for="city">City</label>
						<select class="form-control" id="city" name="city" data-city="---- 选择市 ----" style="width: 150px;" ></select>
					</div>
					<div class="form-group">
							<input class="btn btn-primary" type="submit" value="确定">
					</div>
				</div>
			
			</form>
			</div>
		</div>
		
	</body>
	<script src="js/distpicker.data.js"></script>
	<script src="js/distpicker.js"></script>

</html>