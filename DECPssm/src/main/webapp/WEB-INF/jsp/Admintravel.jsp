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
	<title>DataTables example - Bootstrap 3</title>
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
		$('#edit-travel').on('show.bs.modal', function (event) {
			var datas = $(event.relatedTarget);
			var id=datas.data("id");
		 	 $.ajax("Admin/Admintravel/find",// 发送请求的URL字符串。
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
							  $("#tname").val(data.tname);
							  $("#tprice").val(data.tprice);	
							  $("#tdate").val(data.tdate);	
							  $("#tdetail").val(data.tdetail);
							  $("#tid").val(data.tid);
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
		<div><button type="button" class="btn-add" data-toggle="modal" data-target="#add-travel">+</button></div>
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>编号</th>
					<th>旅行项目名称</th>
					<th>出发日期</th>
					<th>简介</th>
					<th>价格/元</th>
					<th>操作</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>编号</th>
					<th>旅行项目名称</th>
					<th>出发日期</th>
					<th>简介</th>
					<th>价格/元</th>
					<th>操作</th>
				</tr>
			</tfoot>
			<tbody>
				<c:forEach items="${tlist}" var="t">
					<tr>
						<td>${t.tid}</td>
						<td>${t.tname}</td>
						<td>${t.tdate}</td>
						<td>${t.tdetail}</td>
						<td>${t.tprice}</td>
						<td>
							<button type="button" class="btn-newbtn" data-toggle="modal" data-id="${t.tid }" data-target="#edit-travel">修改</button>
							<a href="./Admin/Admintravel/del?tid=${t.tid}">
								<button type="button" class="btn-newbtn" id="del-travel">删除</button>
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	
		
		<!--模态框-->
		<!--add-travel-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="add-travel">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">旅行项目添加</h4>
     		 		</div>
     		 		<form:form modelAttribute="travel" method="post" action="./Admin/Admintravel/add">
     		 		<div class="modal-body">
              			<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-th-list"></span></span>
 							<input type="text" class="form-control" placeholder="Travel" aria-describedby="basic-addon1" name="tname">
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-calendar"></span></span>
 							<input type="text" class="form-control" placeholder="Traveldate" aria-describedby="basic-addon1" name="tdate">	
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-file"></span></span>
 							<input type="text" class="form-control" placeholder="Traveldetail" aria-describedby="basic-addon1" name="tdetail">	
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-yen"></span></span>
 							<input type="text" class="form-control" placeholder="Travelprice" aria-describedby="basic-addon1" name="tprice">	
						</div>	
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-yen"></span></span>
 							<input type="text" class="form-control" placeholder="Cid" aria-describedby="basic-addon1" name="cid">	
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-yen"></span></span>
 							<input type="text" class="form-control" placeholder="Ttid" aria-describedby="basic-addon1" name="ttid">	
						</div>
						<br />
						<div class="input-group">
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-yen"></span></span>
 							<input type="text" class="form-control" placeholder="Tsid" aria-describedby="basic-addon1" name="tsid">	
						</div>			
      				</div>
     		 		<div class="modal-footer">
       					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        				<input type="submit" class="btn btn-primary" value="Save">
      				</div>
      				</form:form>
   				</div>
  			</div>
		</div>
		<!--edit-travel-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="edit-travel">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">旅行项目修改</h4>
     		 		</div>
     		 		<form:form action="Admin/Admintravel/edit" modelAttribute="user" method="post">
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-th-list"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Travel" aria-describedby="basic-addon1" id="tname" name="tname">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-calendar"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Traveldate" aria-describedby="basic-addon1" id="tdate" name="tdate">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-file"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Traveldetail" aria-describedby="basic-addon1" id="tdetail" name="tdetail">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-yen"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Travelprice" aria-describedby="basic-addon1" id="tprice" name="tprice">	
						</div>				
      				</div>
      				<input type="hidden" id="tid" name="tid">
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

