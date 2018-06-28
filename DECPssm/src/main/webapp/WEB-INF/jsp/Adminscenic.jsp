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
		<div><button type="button" class="btn-add" data-toggle="modal" data-target="#add-scenic">+</button></div>
		<!--表格主体-datatables插件-->
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>编号</th>
					<th>景点名称</th>
					<th>景点地址</th>
					<th>图片</th>
					<th>简介</th>
					<th>操作</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>编号</th>
					<th>景点名称</th>
					<th>景点地址</th>
					<th>图片</th>
					<th>简介</th>
					<th>操作</th>
				</tr>
			</tfoot>
			<tbody>
				<c:forEach items="${tslist}" var="ts">
					<tr>
						<td>${ts.tsid}</td>
						<td>${ts.tsname}</td>
						<td>${ts.tsaddress}</td>
						<td>
							<img src="${ts.tsimg}" width="75px" height="50px">
						</td>
						<td>${ts.tsdetail}</td>
						<td>
							<button type="button" class="btn-newbtn" data-toggle="modal" data-target="#edit-scenic">修改</button>
							<a href="./Admin/Adminscenic/del?tsid=${ts.tsid}">
								<button type="button" class="btn-newbtn" id="del-scenic">删除</button>
							</a>
						</td>
					</tr>
				</c:forEach>
				<!-- <tr>
					<td>1</td>
					<td>西湖</td>
					<td>杭州西湖</td>
					<td>
						<img src="images/西湖.jpg"/ wwidth="75px" height="50px">
					</td>
					<td>西湖，位于浙江省杭州市西面，是中国大陆首批国家重点风景名胜区和中国十大风景名胜之一。它是中国大陆主要的观赏性淡水湖泊之一，也是现今《世界遗产名录》中少数几个和中国唯一一个湖泊类文化遗产。</td>
					<td>
						<button type="button" class="btn-newbtn" data-toggle="modal" data-target="#edit-scenic">修改</button>
						<button type="button" class="btn-newbtn" id="del-scenic" onclick="#">删除</button>
					</td>	
				</tr> -->
			</tbody>
		</table>	
		<!--模态框-->
		<!--add-scenic-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="add-scenic">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">景点添加</h4>
     		 		</div>
     		 		<form:form modelAttribute="scenic" method="post" action="./Admin/Adminscenic/add">
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-tree-conifer"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenic" aria-describedby="basic-addon1" id="tsname" name="tsname">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-file"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenicaddress" aria-describedby="basic-addon1" id="tsaddress" name="tsaddress">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-picture"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenicimg" aria-describedby="basic-addon1" id="tsimg" name="tsimg">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-th-list"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenicdetail" aria-describedby="basic-addon1" id="tsdetail" name="tsdetail">	
						</div>		
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-th-list"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Cid" aria-describedby="basic-addon1" id="cid" name="cid">	
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
		<!--edit-scenic-->
		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="edit-scenic">
 			<div class="modal-dialog modal-lg" role="document">
   				<div class="modal-content">
     		 		<div class="modal-header">
     		 			<h4 class="modal-title" id="myModalLabel">景点修改</h4>
     		 		</div>
     		 		<div class="modal-body">
              			<div class="input-group">
              				<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-tree-conifer"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenic" aria-describedby="basic-addon1" id="tsname">
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-file"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenicaddress" aria-describedby="basic-addon1" id="tsaddress">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-picture"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenicimg" aria-describedby="basic-addon1" id="tsimg">	
						</div>
						<br />
						<div class="input-group">
							<!--标签样式-->
  					  	 	<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-th-list"></span></span>
  					  	 	<!--输入框text-->
 							<input type="text" class="form-control" placeholder="Scenicdetail" aria-describedby="basic-addon1" id="tsdetail">	
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
