<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		<link rel="Bookmark" href="<%=path%>/resource/favicon.ico" >
		<link rel="Shortcut Icon" href="<%=path%>/resource/favicon.ico" />
		<link rel="stylesheet" type="text/css" href="<%=path%>/resource/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="<%=path%>/resource/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="<%=path%>/resource/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="<%=path%>/resource/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="<%=path%>/resource/static/h-ui.admin/css/style.css" />
		<script type="text/javascript" src="<%=path%>/resource/lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="<%=path%>/resource/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="<%=path%>/resource/static/h-ui/js/H-ui.min.js"></script> 
		<script type="text/javascript" src="<%=path%>/resource/static/h-ui.admin/js/H-ui.admin.js"></script>
		<script type="text/javascript" src="<%=path%>/resource/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
		<script type="text/javascript" src="<%=path%>/resource/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
		<script type="text/javascript" src="<%=path%>/resource/lib/laypage/1.2/laypage.js"></script>
		<title>管理员列表</title>
	</head>
	<body>
		<% HttpSession s = request.getSession(); %> 
		<nav class="breadcrumb">
			<i class="Hui-iconfont">&#xe67f;</i>
			首页
			<span class="c-gray en">&gt;</span>
			管理员管理 
			<span class="c-gray en">&gt;</span>
			管理员列表
			<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" 
				href="javascript:location.replace(location.href);" title="刷新" >
				<i class="Hui-iconfont">&#xe68f;</i>
			</a>
		</nav>
		<div class="page-container">
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l"> 
					<a class="btn btn-primary radius"  href="javascript:;" 
						onclick="admin_add('添加管理员','<%=path%>/admin/admin_add')">
						<i class="Hui-iconfont">&#xe600;</i>
						添加管理员
					</a>
				</span>
				<span class="r">
					共有数据：
					<strong>${admin_total}</strong>
					条
				</span>
			</div>
			<table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
				<thead>
					<tr>
						<th scope="col" colspan="9">管理员列表</th>
					</tr>
					<tr class="text-c">
						<th width="25">
							<input type="checkbox" name="" value="">
						</th>
						<th width="40">ID</th>
						<th width="150">登录名</th>
						<th width="90">手机</th>
						<th width="150">邮箱</th>
						<th width="130">加入时间</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${adminList}" var="c" varStatus="status">
						<tr class="text-c">
							<td>
								<input type="checkbox" value="1" name="">
							</td>
							<td>${c.superid}</td>
							<td>${c.supername}</td>
							<td>${c.phone}</td>
							<td>${c.email}</td>
							<td>
								<fmt:formatDate type="date" value="${c.date}" />
							</td>
							<td class="td-manage">
								<a style="text-decoration:none" class="ml-5" 
									onClick="admin_edit('管理员编辑',${c.superid})" 
									href="javascript:;" title="编辑">
									<i class="Hui-iconfont">&#xe6df;</i>
								</a>
								<a title="删除" href="javascript:;" onclick="admin_del(this,'${c.superid}')" 
									class="ml-5" style="text-decoration:none">
									<i class="Hui-iconfont">&#xe6e2;</i>
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<script type="text/javascript">
			$('.table-sort').dataTable({
				"aaSorting": [[ 1, "desc" ]],//默认第几个排序
				"bStateSave": false,//状态保存
				"pading":false,
				"aoColumnDefs": [
				  {"orderable":false,"aTargets":[0,2,3,4,6]}// 不参与排序的列
				]
			});
		
			/*管理员-删除*/
			function admin_del(obj,id){
				var supername='${supername}';
				if(supername == null || supername == ""){
					layer.confirm('你登录已失效，请前往登录！', {
						btn: ['关闭'] //按钮
						,cancel: function(index, layero){
							//取消操作，点击右上角的X
						}
					}, function(){
						location.reload();
					});
				}else{
					layer.confirm('确认要删除吗？',function(index){
						var superid=id;		
						$.ajax({
							type:"post",
							url:"<%=path%>/admin/admin_del/"+superid,
							contentType:"application/json;charset=utf-8",
							success: function(data){
								$(obj).parents("tr").remove();
								layer.msg('已删除!',{icon:1,time:1000});
								location.reload();
							},
							error:function(data) {
								console.log(data.msg);
							}
						});		
					});
				}
			}
		
			/*管理员-编辑*/
			function admin_edit(title,id){
				var supername='${supername}';
				if(supername == null || supername == ""){
					layer.confirm('你登录已失效，请前往登录！', {
						btn: ['关闭'] //按钮
						,cancel: function(index, layero){
							//取消操作，点击右上角的X
						}
					}, function(){
						location.reload();
					});
				}else{
					var index = layer.open({
						type: 2,
						title: title,
						content:"<%=path%>/admin/admin_edit/"+id,
						end: function () {
			            	location.reload();
			            }
					});
					layer.full(index);
				}
			}
		
			/*管理员-添加*/
			function admin_add(title,url){
				var supername='${supername}';
				if(supername == null || supername == ""){
					layer.confirm('你登录已失效，请前往登录！', {
						btn: ['关闭'] //按钮
						,cancel: function(index, layero){
							//取消操作，点击右上角的X
						}
					}, function(){
						location.reload();
					});
				}else{
				    var index = layer.open({
						type: 2,
						title: title,
						content: url,
						end: function () {
							location.reload();
						}
				    });
					layer.full(index);
			  	}
			}
		</script>
	</body>
</html>