<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>koma培训学生管理系统</title>
</head>
<body>
	<h1>koma培训学生管理系统</h1>
	<form action="selAll" method="get">
		<input name="studentName" placeholder="请输入学生姓名" />
		<input type="submit" value="搜索"/>
	</form>
	<table border="1">
		<tr>
			<td>序号</td>
			<td>学生姓名</td>
			<td>准考证号</td>
			<td>性别</td>
			<td>年龄</td>
			<td>专业</td>
			<td>年级</td>
			<td>操作</td>
		</tr>
		<c:forEach var="stu" items="${list }">
			<tr>
			<td>${stu.id }</td>
			<td>${stu.studentName }</td>
			<td>${stu.studentNo }</td>
			<td>
				<c:if test="${stu.gender == 0 }">男</c:if>
				<c:if test="${stu.gender == 1 }">女</c:if>
			</td>
			<td>${stu.age }</td>
			<td>${stu.major }</td>
			<td>${stu.grade }</td>
			<td>
				<a href="delStudent?id=${stu.id }">删除</a>
				<a href="selOneById?id=${stu.id }">修改</a>
			</td>
		</tr>
		</c:forEach>
		<tr><td colspan="8" align="right"><a href="goAdd">录入</a>共${list.size()}条数据</td></tr>
	</table>
</body>
</html>