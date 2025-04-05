<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="<%=basePath%>/resource/favicon.ico" >
<link rel="Shortcut Icon" href="<%=basePath%>/resource/favicon.ico" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/resource/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/resource/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/resource/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/resource/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/resource/static/h-ui.admin/css/style.css" />
<script type="text/javascript" src="<%=basePath%>/resource/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>/resource/static/h-ui/js/H-ui.min.js"></script> 
<title>我的桌面</title>
</head>
<body>
<div class="page-container">
	<p class="f-20 text-success">欢迎使用伯牙博客管理系统</p>
	<img width="100%" height="100%" src="<%=basePath%>/resource/image/bg3.jpg">
</div>

<footer class="footer mt-20">
	<div class="container">
		<p>版权所有 2021-2031 www.xxxxxx.com 云南理工职业学院大数据学院A项目组</p>
	</div>
</footer>

</body>
</html>