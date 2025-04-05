<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<script type="text/javascript" src="<%=path%>/resource/lib/hcharts/Highcharts/5.0.6/js/highcharts.js"></script>
<script type="text/javascript" src="<%=path%>/resource/lib/hcharts/Highcharts/5.0.6/js/modules/exporting.js"></script>
<script type="text/javascript" src="<%=path%>/resource/lib/hcharts/Highcharts/5.0.6/js/highcharts-3d.js"></script>
<title>3D柱状图</title>
</head>
<body>
	<% HttpSession s = request.getSession();  %>  
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 
		首页 
		<span class="c-gray en">&gt;</span> 
		统计管理 <span class="c-gray en">&gt;</span> 
		3D柱状图 
		<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" 
			href="javascript:location.replace(location.href);" title="刷新" >
			<i class="Hui-iconfont">&#xe68f;</i>
		</a>
	</nav>
	<div class="page-container">
		<div id="container" style="min-width:700px;height:400px"></div>
	</div>

	<script type="text/javascript">
		﻿$(function () {
			var data = [];
		    var str = [];　
		    <c:forEach items="${data}" var="c" varStatus="status">
		       data.push(${c});
		    </c:forEach>
		    <c:forEach items="${str}" var="c" varStatus="status">
		       str.push(${c});
		    </c:forEach>
		    console.log(data);
		    console.log(str);
		    var chart = new Highcharts.Chart({
		        chart: {
		            renderTo: 'container',
		            type: 'column',
		            margin: 75,
		            options3d: {
		                enabled: true,
		                alpha: 15,
		                beta: 15,
		                depth: 50,
		                viewDistance: 25
		            }
		        },
		        title: {
		            text: '点赞统计'
		        },
		        subtitle: {
		            text: 'About every article statistics'
		        },
		        plotOptions: {
		            column: {
		                depth: 25
		            }
		        },
		        xAxis: {
		            categories: str
		        },
		        yAxis: {
		            title: {
		                text: '点赞数'
		            }
		        },
		        series: [{
		            name: '文章ID',
		            data:data
		        }]
		    });
		    $('#R0').on('change', function(){
		        chart.options.chart.options3d.alpha = this.value;
		        showValues();
		        chart.redraw(false);
		    });
		    
		    $('#R1').on('change', function(){
		        chart.options.chart.options3d.beta = this.value;
		        showValues();
		        chart.redraw(false);
		    });
		
		    function showValues() {
		        $('#R0-value').html(chart.options.chart.options3d.alpha);
		        $('#R1-value').html(chart.options.chart.options3d.beta);
		    }
		    
		    showValues();
		});
	</script>
</body>
</html>