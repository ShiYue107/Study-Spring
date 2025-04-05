<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"
		+request.getServerPort()+path;
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
		<script type="text/javascript" src="<%=basePath%>/resource/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="<%=basePath%>/resource/static/h-ui/js/H-ui.min.js"></script>
		<script type="text/javascript" src="<%=basePath%>/resource/static/h-ui.admin/js/H-ui.admin.js"></script>
		<script type="text/javascript" src="<%=basePath%>/resource/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
		<title>伯牙博客管理系统</title>
		<meta name="keywords" content="">
		<meta name="description" content="">
	</head>
<body>
	<% HttpSession s = request.getSession();  %>  
	<header class="navbar-wrapper">
		<div class="navbar navbar-fixed-top">
			<div class="container-fluid cl">
				<span class="logo navbar-logo f-l mr-10 hidden-xs">伯牙博客管理系统</span>
				<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
				<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
					<ul class="cl">
						<li>超级管理员</li>
						<li class="dropDown dropDown_hover">
							<% if(s.getAttribute("supername")==null) {%>
								<a href="#" class="dropDown_A">
									未登录<i class="Hui-iconfont">&#xe6d5;</i>
								</a>
						    <% }else{ %>
						        <a href="#" class="dropDown_A">
						        	<%=session.getAttribute("supername")%>
						        	<i class="Hui-iconfont">&#xe6d5;</i>
						        </a>
						     <%}%>
							<ul class="dropDown-menu menu radius box-shadow">
								<% if(s.getAttribute("supername")==null) {%>
									<li>
										<a href="<%=basePath%>/admin/login">登录</a>
									</li>
					        	<% }else{ %>
					       			<li>
					       				<a href="<%=basePath%>/admin/adminReset">退出</a>
					       			</li>
					        	<%}%>
						    </ul>
						</li>
						<li id="Hui-skin" class="dropDown right dropDown_hover">
							<a href="javascript:;" class="dropDown_A" title="换肤">
								<i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i>
							</a>
							<ul class="dropDown-menu menu radius box-shadow">
								<li>
									<a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a>
								</li>
								<li>
									<a href="javascript:;" data-val="blue" title="蓝色">蓝色</a>
								</li>
								<li>
									<a href="javascript:;" data-val="green" title="绿色">绿色</a>
								</li>
								<li>
									<a href="javascript:;" data-val="red" title="红色">红色</a>
								</li>
								<li>
									<a href="javascript:;" data-val="yellow" title="黄色">黄色</a>
								</li>
								<li>
									<a href="javascript:;" data-val="orange" title="橙色">橙色</a>
								</li>
							</ul>
						</li>
					</ul>
				</nav>
			</div>
		</div>
	</header>
	<aside class="Hui-aside">
		<div class="menu_dropdown bk_2">
			<dl id="menu-article">
				<dt>
					<i class="Hui-iconfont">&#xe616;</i>
					用户管理
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/user/queryuse" data-title="用户管理" href="javascript:void(0)">
								用户管理
							</a>
						</li>
					</ul>
				</dd>
			</dl>
			<dl id="menu-picture">
				<dt>
					<i class="Hui-iconfont">&#xe613;</i>
					文章管理
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/article/articlemana" data-title="文章管理" href="javascript:void(0)">
								文章管理
							</a>
						</li>
					</ul>
				</dd>
			</dl>
			<dl id="menu-product">
				<dt>
					<i class="Hui-iconfont">&#xe620;</i>
					分类管理
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/catelog/catelog_index"  data-title="分类管理" href="javascript:void(0)">
								分类管理
							</a>
						</li>
					</ul>
				</dd>
			</dl>
			<dl id="menu-comments">
				<dt>
					<i class="Hui-iconfont">&#xe622;</i>
					评论管理
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/comment/comment_index" data-title="评论管理" href="javascript:void(0)">
								评论管理
							</a>
						</li>
					</ul>
				</dd>
			</dl>
			<dl id="menu-comments">
				<dt>
					<i class="Hui-iconfont">&#xe622;</i>
					留言管理
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/message/message_index" data-title="留言管理" href="javascript:void(0)">
								留言管理
							</a>
						</li>
					</ul>
				</dd>
			</dl>
			<dl id="menu-comments">
				<dt>
					<i class="Hui-iconfont">&#xe622;</i>
					公告管理
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/post/post_index" data-title="公告管理" href="javascript:void(0)">
								公告管理
							</a>
						</li>
					</ul>
				</dd>
			</dl>
			<dl id="menu-admin">
				<dt>
					<i class="Hui-iconfont">&#xe62d;</i>
					管理员管理
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/admin/admin_index" data-title="管理员管理" href="javascript:void(0)">
								管理员管理
							</a>
						</li>
					</ul>
				</dd>
			</dl>
			<dl id="menu-tongji">
				<dt>
					<i class="Hui-iconfont">&#xe61a;</i>
					点赞统计
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</dt>
				<dd>
					<ul>
						<li>
							<a data-href="<%=basePath%>/zan/zan_index" data-title="点赞统计" href="javascript:void(0)">
								点赞统计
							</a>
						</li>
					</ul>
				</dd>
			</dl>
		</div>
	</aside>
	<div class="dislpayArrow hidden-xs">
		<a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a>
	</div>
	<section class="Hui-article-box">
		<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
			<div class="Hui-tabNav-wp">
				<ul id="min_title_list" class="acrossTab cl">
					<li class="active">
						<span title="我的桌面">
							我的桌面
						</span>
						<em></em>
					</li>
				</ul>
			</div>
			<div class="Hui-tabNav-more btn-group">
				<a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;">
					<i class="Hui-iconfont">&#xe6d4;</i>
				</a>
				<a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;">
					<i class="Hui-iconfont">&#xe6d7;</i>
				</a>
			</div>
		</div>
		<div id="iframe_box" class="Hui-article">
			<div class="show_iframe">
				<div style="display:none" class="loading"></div>
				<iframe scrolling="yes" frameborder="0" src="<%=basePath%>/resource/html/welcome.jsp"></iframe>
			</div>
		</div>
	</section>
	<div class="contextMenu" id="Huiadminmenu">
		<ul>
			<li id="closethis">关闭当前 </li>
			<li id="closeall">关闭全部 </li>
		</ul>
	</div>
</body>
</html>