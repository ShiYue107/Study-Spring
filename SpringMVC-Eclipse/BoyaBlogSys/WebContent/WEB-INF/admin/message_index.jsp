<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<% String path = request.getContextPath(); %>
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
<style>
        .line-limit-length {
		max-width: 600px;
		overflow: hidden;
		text-overflow: ellipsis;
		white-space: nowrap;
        }   
        .line-content-length {
		overflow:hidden; 
		text-overflow:ellipsis;
		display:-webkit-box; 
		-webkit-box-orient:vertical;
		-webkit-line-clamp:1;
        }   
    </style>
<title>意见反馈</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 评论管理 <span class="c-gray en">&gt;</span> 意见反馈 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="r">共有数据：<strong>${message_total}</strong> 条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="60">用户ID</th>
					<th>留言内容</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${messagelist}" var="c" varStatus="status">
				<tr class="text-c">
					<td><input type="checkbox" value="1" name=""></td>
					<td>${c.uid}</td>
					<td class="text-l"><div class="c-999 f-12">
						<div>留言内容:${c.content}</div>
						<div>发表日期:<fmt:formatDate type="date" value="${c.date}" /></div>
					</td>
					<td class="td-manage"> <a title="删除" href="javascript:;" onclick="message_del(this,${c.mid})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>


<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  {"orderable":false,"aTargets":[0,2,3]}// 制定列不参与排序
		]
	});

});


/*留言-删除*/
function message_del(obj,mid){
	var supername="${supername}";
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
		var cid=mid;		
		$.ajax({
			type:"post",
			url:"<%=path%>/message/deleteByMid/"+mid,
			contentType:"application/json;charset=utf-8",
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
				location.reload();
			},
			error:function(data) {
				console.log(data.msg);
			},
		});	
			
	});
  }
}




</script>
</body>
</html>