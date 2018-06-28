<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
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
	<script type="text/javascript" language="javascript" src="js/jquery.dataTables.js"></script>
	<script type="text/javascript" language="javascript" src="js/dataTables.bootstrap.js"></script>
	<script type="text/javascript" language="javascript" class="init">
	
		$(document).ready(function() {
			$('#example').DataTable();
		} );
	</script>
	<script type="text/javascript">
	$(function(){
		$('#edit-user').on('show.bs.modal', function (event) {
			var datas = $(event.relatedTarget);
			var id=datas.data("id");
		 	 $.ajax("Admin/Adminuser/find",// 发送请求的URL字符串。
					{
						dataType : "json", // 预期服务器返回的数据类型。
						type : "post", //  请求方式 POST或GET
						//contentType : "application/json", //  发送信息至服务器时的内容编码类型
						// 发送到服务器的数据。
						data :{
							id : id,
						},
						async : true, // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
						// 请求成功后的回调函数。
						success : function(data) {
							  $("#uname").val(data.uname);
							  $("#upwd").val(data.upwd);	
							  $("#ubirth").val(data.ubirth);	
							  $("#umail").val(data.umail);
							  $("#utel").val(data.utel);
							  $("#uid").val(data.uid);
						},
						// 请求出错时调用的函数
						error : function() {
							alert("数据发送失败");
						}
					}); 

		})
	})
		
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
							<button type="button" class="btn-newbtn" data-toggle="modal" data-target="#edit-user" data-id=${u.uid }>修改</button>
							<a href="./Admin/Adminuser/del?uid=${u.uid}">
								<button type="button" class="btn-newbtn" id="del-user">删除</button>
							</a>
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
     		 		<form:form modelAttribute="user" method="post" action="./Admin/Adminuser/add">
     		 		<div class="modal-body">
              			<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user"></span></span>
 							<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1" name="uname">
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
 							<input type="text" class="form-control" placeholder="Password" aria-describedby="basic-addon1" name="upwd">	
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-envelope"></span></span>
 							<input type="text" class="form-control" placeholder="E-mail" aria-describedby="basic-addon1" name="umail">	
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-phone"></span></span>
 							<input type="text" class="form-control" placeholder="Tel" aria-describedby="basic-addon1" name="utel">	
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-gift"></span></span>
 							<input type="text" class="form-control" placeholder="Birth" aria-describedby="basic-addon1" name="ubirth">	
						</div>				
      				</div>
     		 		<div class="modal-footer">
       					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        				<input type="submit" class="btn btn-primary" value="Save">
      				</div>
      				</form:form >
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
     		 		<form:form action="Admin/Adminuser/edit" method="post" modelAttribute="user">
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1" id="uname" name="uname">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Password" aria-describedby="basic-addon1" id="upwd" name="upwd">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-envelope"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="E-mail" aria-describedby="basic-addon1" id="umail" name="umail">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-phone"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Tel" aria-describedby="basic-addon1" id="utel" name="utel">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-gift"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Birth" aria-describedby="basic-addon1" id="ubirth" name="ubirth">	
						</div>				
      				</div>
      				<input type="hidden" id="uid" name="uid">
     		 		<div class="modal-footer">
       					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        				<input type="submit" class="btn btn-primary" value="Save">
      				</div>
      				</form:form>
   				</div>
  			</div>
		</div>
		<!--end-->
		
	</body>
</html>
