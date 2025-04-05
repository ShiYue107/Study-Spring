package com.itkoma.controller;

import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itkoma.pojo.Product;
import com.itkoma.pojo.ProductList;

@Controller
public class ProductController {

	@RequestMapping("/batchUpdateProduct")
	@ResponseBody
	public String batchUpdateProduct(ProductList pdtList) {
		StringBuffer sb = new StringBuffer();
		for (Product pdt : pdtList.getProducts()) {
			sb.append(pdt);
		}
		return "批量添加商品信息成功:"+sb.toString();
	}
}
