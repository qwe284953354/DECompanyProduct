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
		<link rel="stylesheet" href="css/admin-a.css" />
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script type="text/javascript" language="javascript" src="js/jquery.js"></script>
		<script type="text/javascript" language="javascript" src="js/jquery.dataTables.js"></script>
		<script type="text/javascript" language="javascript" src="js/dataTables.bootstrap.js"></script>
		<script type="text/javascript" language="javascript" class="init">
			$(document).ready(function() {
				$('#example01').DataTable();
			});
		</script>
		<script type="text/javascript" language="javascript" class="init">
			$(document).ready(function() {
				$('#example02').DataTable();
			});
		</script>
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
						<a href="userinfo" class="uleft-laber">基本信息</a>
						<a href="userorder" class="uleft-laber" style="background-color: rgba(135,206,250,1);color: white;">我的订单</a>
					</div>
				</div>
				<div class="uinfo-right">
					<div class="uright-title">
						<h4>我的订单</h4>
					</div>
					<div class="uright-info">
						<div class="order-travel">
							<h5>旅行订单</h5>
							<table id="example01" class="table table-striped table-bordered" cellspacing="0" width="100%">
								<thead>
									<tr>
										<th>日期</th>
										<th>用户名</th>
										<th>旅行项目名称</th>
										<td>价格</td>
										<th>操作</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>日期</th>
										<th>用户名</th>
										<th>旅行项目名称</th>
										<td>价格</td>
										<th>操作</th>
									</tr>
								</tfoot>
								<tbody>
									<c:forEach items="${user.travelOrderlist }" var="ut">
										<tr>
											<td>${ut.orderTravel.tdate }</td>
											<td>${uname}</td>
											<td>${ut.orderTravel.tname }</td>
											<td>${ut.toprice }</td>
											<td>
												<a href="celTravelOrder?toid=${ut.toid }"><button type="button" class="btn-newbtn" id="del-torder" onclick="">取消</button></a>
											</td>
										</tr>
									</c:forEach>
									
								</tbody>
							</table>
						</div>

						<div class="order-hotel">
							<h5>酒店订单</h5>
							<table id="example02" class="table table-striped table-bordered" cellspacing="0" width="100%">
								<thead>
									<tr>
										<th>真实姓名</th>
										<th>预订入驻时间</th>
										<th>酒店名称</th>
										<th>价格</th>
										<th>预定到店时间</th>
										<th>用户</th>
										<th>操作</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>真实姓名</th>
										<th>预订入驻时间</th>
										<th>酒店名称</th>
										<th>价格</th>
										<th>预定到店时间</th>
										<th>用户</th>
										<th>操作</th>
									</tr>
								</tfoot>
								<tbody>
									<c:forEach items="${user.hotelOrderlist }" var="uh">
										<tr>
											<td>${uh.honame }</td>
											<td>${uh.hodate }</td>
											<td>${uh.orderHotel.hname }</td>
											<td>${uh.hoprice }</td>
											<td>${uh.hobooktime }</td>
											<td>${uname }</td>
											<td>
												<a href="celHotelOrder"><button type="button" class="btn-newbtn" id="del-horder" onclick="#">取消</button></a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>

					</div>
				</div>
			</div>
		</div>

		<div class="uio-footer">
			<br/><br /><br />
			<p>违法和不良信息举报电话:4006666666 举报邮箱:jubao.gouyan@gouyan.com </p>
			<p>友情链接：
				<a>狗眼电影</a>
			</p>
			<p>©2016 狗眼电影 gouyan.com 京ICP证000000号 京ICP备00000000号-1 京公网安备 00000000000000号 网络文化经营许可证 电子公告服务规则</p>
			<p>杭州狗眼文化传媒有限公司</p>
		</div>
	</body>

</html>