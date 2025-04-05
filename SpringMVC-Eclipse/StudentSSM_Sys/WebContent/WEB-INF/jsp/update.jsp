<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>koma培训学生管理系统</title>
</head>
<body>

	<h1>修改学生信息</h1>
	<form action="updateStudent" method="post">
		<input type="hidden" name="id" value="${stu.id }"/> 
		<table border="1">
			<tr>
				<td>学生姓名</td>
				<td><input name="studentName" value="${stu.studentName }"/></td>
			</tr>
			<tr>
				<td>准考证号</td>
				<td><input name="studentNo" value="${stu.studentNo }"/></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<input type="radio" name="gender" value="0" checked="checked"/>男
					<input type="radio" name="gender" value="1"/>女
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input name="age" value="${stu.age }"/></td>
			</tr>
			<tr>
				<td>专业</td>
				<td><input name="major" value="${stu.major }"/></td>
			</tr>
			<tr>
				<td>年级</td>
				<td><input name="grade" value="${stu.grade }"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" >修改</button>
					<button type="reset" >取消</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>