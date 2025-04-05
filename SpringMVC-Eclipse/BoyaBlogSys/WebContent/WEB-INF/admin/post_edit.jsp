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
<link rel="stylesheet" type="text/css" href="<%=path%>/resource/lib/webuploader/0.1.5/webuploader.css" />
<script type="text/javascript" src="<%=path%>/resource/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=path%>/resource/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=path%>/resource/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="<%=path%>/resource/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="<%=path%>/resource/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="<%=path%>/resource/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="<%=path%>/resource/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript" src="<%=path%>/resource/lib/webuploader/0.1.5/webuploader.min.js"></script> 
<title>公告编辑</title>
</head>
<body>
<div class="page-container">
	<form class="form form-horizontal" id="form-article-add" action="<%=path%>/post/post_edit" 
	method="post">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>公告主题：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<input type="hidden" class="input-text" value="${post.gid} " id="gid" name="gid">
				<input type="text" class="input-text" value="${post.gname} " id="gname" name="gname">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">文章内容：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="content" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-8000" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,8000)">${post.content}</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>发布日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  name="time" disabled="disabled"
					value="<fmt:formatDate value="${post.time}" pattern="yyyy-MM-dd HH:mm:ss"/>" />
					<input type="hidden" class="input-text"  name="time" value="${post.time}" />
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">发布者：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${post.author}" placeholder="" id="" name="author">
				<input type="hidden" class="input-text" value="${post.superid}" placeholder="" id="superid" name="superid">
			</div>
		</div>
		
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onClick="post_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保 存</button>
				<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</div>


<button style="VISIBILITY: hidden" class="btn btn-primary btn-lg"  data-toggle="modal" data-target="#myModal2" id="dialog"></button>
    
   <!-- 模态框（Modal） -->
   <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">
					提示
				</h4>
			</div>
			<div class="modal-body">
				<p>${msg}</p>
			</div>
			<div class="modal-footer">
				<button type="button" onClick="layer_close();" class="btn btn-default" data-dismiss="modal">关闭
				</button>
			</div>
		</div><!-- /.modal-content -->
	  </div><!-- /.modal -->
     </div>



<script type="text/javascript">
function post_save(){
	alert("刷新父级的时候会自动关闭弹层。")
	window.parent.location.reload();
}

var msg="${msg}";    
if(msg != 'null' && msg != ""){
	 $(function(){
        $("#myModal2").modal({
           keyboard: true
       });
   });	
}

</script>
</body>
</html>
