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
		<div><button type="button" class="btn-add" data-toggle="modal" data-target="#add-hotel">+</button></div>
		<!--表格主体-datatables插件-->
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>编号</th>
					<th>酒店名称</th>
					<th>酒店星级</th>
					<th>酒店类型</th>
					<th>图片</th>
					<th>地址</th>
					<th>评分</th>
					<th>操作</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>编号</th>
					<th>酒店名称</th>
					<th>酒店星级</th>
					<th>酒店类型</th>
					<th>图片</th>
					<th>地址</th>
					<th>评分</th>
					<th>操作</th>
				</tr>
			</tfoot>
			<tbody>
				<c:forEach items="${hlist}" var="h">
					<tr>
						<td>${h.hid}</td>
						<td>${h.hname}</td>
						<td>${h.hstar}</td>
						<td>${h.htype}</td>
						<td>
							<img src="${h.himg}" width="75px" height="50px">
						</td>
						<td>${h.haddress}</td>
						<td>${h.hmark}</td>
						<td>
							<button type="button" class="btn-newbtn" data-toggle="modal" data-target="#edit-hotel">修改</button>
							<button type="button" class="btn-newbtn" id="del-hotel" onclick="#">删除</button>
						</td>
					</tr>
				</c:forEach>
				<!-- <tr>
					<td>1</td>
					<td>如家</td>
					<td>4</td>
					<td>便捷式</td>
					<td>
						<img src="images/酒店.jpg"/ width="75px" height="50px">
					</td>
					<td>杭州银泰（西湖店）</td>
					<td>8.8</td>
					<td>
						<button type="button" class="btn-newbtn" data-toggle="modal" data-target="#edit-hotel">修改</button>
						<button type="button" class="btn-newbtn" id="del-hotel" onclick="#">删除</button>
					</td>	
				</tr> -->
			</tbody>
		</table>	
		
		<!--模态框-->
		<!--add-hotel-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="add-hotel">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">酒店添加</h4>
     		 		</div>
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-home"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hotelname" aria-describedby="basic-addon1" id="hname">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-star"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hotelstar " aria-describedby="basic-addon1" id="hstar">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-tag"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hoteltype" aria-describedby="basic-addon1" id="htype">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-picture"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hotelimage" aria-describedby="basic-addon1" id="himg">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-file"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hoteladdress" aria-describedby="basic-addon1" id="haddress">	
						</div>	
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-heart"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Mark" aria-describedby="basic-addon1" id="hmark">	
						</div>	
      				</div>
     		 		<div class="modal-footer">
       					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        				<button type="button" class="btn btn-primary" onclick="#">Save</button>
      				</div>
   				</div>
  			</div>
		</div>
		
		<!--edit_hotel-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="edit-hotel">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">酒店修改</h4>
     		 		</div>
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-home"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hotelname" aria-describedby="basic-addon1" id="hname">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-star"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hotelstar " aria-describedby="basic-addon1" id="hstar">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-tag"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hoteltype" aria-describedby="basic-addon1" id="htype">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-picture"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hotelimage" aria-describedby="basic-addon1" id="himg">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-file"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Hoteladdress" aria-describedby="basic-addon1" id="haddress">	
						</div>	
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-heart"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Mark" aria-describedby="basic-addon1" id="hmark">	
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
