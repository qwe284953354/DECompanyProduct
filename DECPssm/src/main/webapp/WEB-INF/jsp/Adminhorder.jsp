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
	<meta charset="utf-8">
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=2.0">
	<title>DataTables example - Bootstrap 3</title>
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/dataTables.bootstrap.css">
	<style type="text/css" class="init">
	
	</style>
	<link rel="stylesheet" type="text/css" href="css/admin-a.css">
	<script type="text/javascript" language="javascript" src="js/jquery.js">
	</script>
	<script type="text/javascript" language="javascript" src="js/jquery.dataTables.js">
	</script>
	<script type="text/javascript" language="javascript" src="js/dataTables.bootstrap.js">
	</script>
	<script type="text/javascript" language="javascript" class="init">
	
	$(document).ready(function() {
		$('#example').DataTable();
	} );
</script>
	</head>
	<body>
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>编号</th>
					<th>真实姓名</th>
					<th>入住日期</th>
					<th>联系方式</th>
					<th>酒店名称</th>
					<th>价格</th>
					<th>预订到店时间</th>
					<th>用户</th>
					<th>操作</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>编号</th>
					<th>真实姓名</th>
					<th>入住日期</th>
					<th>联系方式</th>
					<th>酒店名称</th>
					<th>价格</th>
					<th>预订到店时间</th>
					<th>用户</th>
					<th>操作</th>
				</tr>
			</tfoot>
			<tbody>
				<c:forEach items="${holist}" var="ho">
					<tr>
						<td>${ho.hoid}</td>
						<td>${ho.honame}</td>
						<td>${ho.hodate}</td>
						<td>${ho.hotel}</td>
						<td>${ho.hname}</td>
						<td>${ho.hprice}</td>
						<td>${ho.uname}</td>
						<td>${ho.hobooktime}</td>
						<td>
							<a href="./Admin/Adminhorder/del?hoid=${ho.hoid}">
								<button type="button" class="btn-newbtn" id="del-horder" >删除</button>
							</a>
						</td>
					</tr>
				</c:forEach>
				<!-- <tr>
					<td>1</td>
					<td>张三</td>
					<td>2018-06-22</td>
					<td>如家</td>
					<td>188</td>
					<td>2018-06-20</td>
					<td>zs1991</td>
					<td>
						<button type="button" class="btn-newbtn" id="del-horder" onclick="#">删除</button>
					</td>	
				</tr> -->
			</tbody>
		</table>		
	</body>
</html>


