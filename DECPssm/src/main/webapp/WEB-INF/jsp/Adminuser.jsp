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
	<title>adminuser</title>
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		
	<link rel="stylesheet" type="text/css" href="css/dataTables.bootstrap.css">
	<style type="text/css" class="init">
	
	</style>
	<link rel="stylesheet" type="text/css" href="css/admin-a.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	
	<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" language="javascript" src="js/jquery.js"></script>
	<script type="text/javascript" language="javascript" src="js/jquery.dataTables.js"></script>
	<script type="text/javascript" language="javascript" src="js/dataTables.bootstrap.js"></script>
	<script type="text/javascript" language="javascript" class="init">
	
		$(document).ready(function() {
			$('#example').DataTable();
		} );
	</script>
	</head>
	<body>
		<!--添加按钮-->
		<div><button type="button" class="btn-add" data-toggle="modal" data-target="#add-user">+</button></div>
		<!--表格主体-datatables插件-->
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>编号</th>
					<th>用户名</th>
					<th>密码</th>
					<th>邮箱</th>
					<th>电话</th>
					<th>生日</th>
					<th>操作</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>编号</th>
					<th>用户名</th>
					<th>密码</th>
					<th>邮箱</th>
					<th>电话</th>
					<th>生日</th>
					<th>操作</th>
				</tr>
			</tfoot>
			<tbody>
				<c:forEach items="${ulist}" var="u">
					<tr>
						<td>${u.uid}</td>
						<td>${u.uname}</td>
						<td>${u.upwd}</td>
						<td>${u.umail}</td>
						<td>${u.utel}</td>
						<td>${u.ubirth}</td>
						<td>
							<button type="button" class="btn-newbtn" data-toggle="modal" data-target="#edit-user">修改</button>
							<button type="button" class="btn-newbtn" id="del-user" onclick="#">删除</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>		
		
		<!--模态框-->
		<!--add-user-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="add-user">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">用戶添加</h4>
     		 		</div>
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1" id="name">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Password" aria-describedby="basic-addon1" id="pwd">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-envelope"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="E-mail" aria-describedby="basic-addon1" id="umail">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-phone"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Tel" aria-describedby="basic-addon1" id="utel">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-gift"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Birth" aria-describedby="basic-addon1" id="ubirth">	
						</div>				
      				</div>
     		 		<div class="modal-footer">
       					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        				<button type="button" class="btn btn-primary" onclick="#">Save</button>
      				</div>
   				</div>
  			</div>
		</div>
		
		<!--edit-user-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="edit-user">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">用戶修改</h4>
     		 		</div>
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1" id="name">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Password" aria-describedby="basic-addon1" id="pwd">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-envelope"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="E-mail" aria-describedby="basic-addon1" id="umail">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-phone"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Tel" aria-describedby="basic-addon1" id="utel">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-gift"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Birth" aria-describedby="basic-addon1" id="ubirth">	
						</div>				
      				</div>
     		 		<div class="modal-footer">
       					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        				<button type="button" class="btn btn-primary" onclick="#">Save</button>
      				</div>
   				</div>
  			</div>
		</div>
		<!--end-->
		
	</body>
</html>
