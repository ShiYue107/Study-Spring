<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>批量添加商品信息</title>
</head>
<body>
	<form action="batchUpdateProduct.do" method="post">
		商品1编号:<input type="text" name="products[0].productId" />
		商品1名称:<input type="text" name="products[0].productName" />
		商品1价格:<input type="text" name="products[0].price" />
		商品1描述:<input type="text" name="products[0].detail" /><br/><br/>
		商品2编号:<input type="text" name="products[1].productId" />
		商品2名称:<input type="text" name="products[1].productName" />
		商品2价格:<input type="text" name="products[1].price" />
		商品2描述:<input type="text" name="products[1].detail" /><br/><br/>
		商品3编号:<input type="text" name="products[2].productId" />
		商品3名称:<input type="text" name="products[2].productName" />
		商品3价格:<input type="text" name="products[2].price" />
		商品3描述:<input type="text" name="products[2].detail" /><br/><br/>
		<input type="submit" value="批量提交" />
	</form>
</body>
</html>