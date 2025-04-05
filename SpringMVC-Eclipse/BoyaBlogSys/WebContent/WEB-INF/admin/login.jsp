<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"
		+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="<%=basePath %>/resource/image/favicon.ico">
		<title>伯牙博客管理系统</title>
		<link rel="stylesheet" href="<%=basePath %>/resource/css/bootstrap.css" >
		<link rel="stylesheet" href="<%=basePath %>/resource/css/blog.css" >
		<link rel="stylesheet" href="<%=basePath %>/resource/css/signin.css" >
		<script src="<%=basePath %>/resource/js/jquery-3.2.1.js"></script>
		<script src="<%=basePath %>/resource/js/bootstrap.js"></script>
	</head>
	<body style="padding-top: 0px;">
		<% HttpSession s = request.getSession();  %>        
		<div class="container" style="margin-top: 80px">
			<form class="form-signin" id="login" method="post" 
				action="<%=basePath %>/admin/loginsubmit">
				<h2 class="form-signin-heading" align="center">管理员登录</h2>
				<label for="inputEmail" class="sr-only">用户名</label>
				<input type="text"  name="supername" id="inputEmail" 
					class="form-control" placeholder="name" required autofocus>
				<label for="inputPassword" class="sr-only">密码</label>
				<input type="password" name="superpassword" id="inputPassword" 
					class="form-control" placeholder="Password" required>
				<button class="btn btn-lg btn-primary btn-block" type="submit">
					login in
				</button>
			</form>
		</div>
		<button style="VISIBILITY: hidden" class="btn btn-primary btn-lg" 
			data-toggle="modal" data-target="#myModal" id="dialog"></button>
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title" id="myModalLabel">
							登录提示
						</h4>
					</div>
					<div class="modal-body">
						<%=s.getAttribute("msg")  %>
					</div>
					<div class="modal-footer">
						<button type="button" onClick="reset()" class="btn btn-default" data-dismiss="modal">关闭</button>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			var msg="<%=session.getAttribute("msg")%>";    
			if(msg != 'null'){
				$(function(){
			        $("#myModal").modal({
			           keyboard: true
					});
		   		});	
			}
			function reset(){
				var url="<%=basePath %>/admin/adminReset";
				window.location.href=url;
			}
		</script>
	</body>
</html>