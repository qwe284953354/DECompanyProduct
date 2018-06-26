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
		<title></title>
		<style >
			.block{ margin:300px  auto;width: 50px; height: 50px; transform: skew(-15deg,10deg) rotate(45deg); background-color: #000000;}
		</style>
	</head>
	<body>
		<div class="block"></div>
	</body>
</html>
