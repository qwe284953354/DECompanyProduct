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
					<th>日期</th>
					<th>用户名</th>
					<th>旅行项目名称</th>
					<td>价格</td>
					<th>操作</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>编号</th>
					<th>日期</th>
					<th>用户名</th>
					<th>旅行项目名称</th>
					<td>价格</td>
					<th>操作</th>
				</tr>
			</tfoot>
			<tbody>
				<tr>
					<td>1</td>
					<td>2018-06-22</td>
					<td>test</td>
					<td>testtravel</td>
					<td>688</td>
					<td>
						<button type="button" class="btn-newbtn" id="del-torder" onclick="#">删除</button>
					</td>	
				</tr>
			</tbody>
		</table>		
	</body>
</html>

