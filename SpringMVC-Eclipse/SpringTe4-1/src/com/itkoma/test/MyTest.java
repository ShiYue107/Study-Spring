package com.itkoma.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itkoma.pojo.Cust;
import com.itkoma.pojo.User;
import com.itkoma.service.CustService;
import com.itkoma.service.UserService;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustService custService = (CustService) context.getBean("custService");
		//示例4.4
//		Cust cust = new Cust();
//		cust.setCustId("1101");
//		cust.setPhone("12312312312");
//		int row = custService.modifyCustById(cust);
		//示例4.5
//		int row = custService.deleteCustById(cust);
//		if (row > 0) {
//			System.out.println("操作成功！");
//		}
		//示例4.6
//		Cust cust = custService.getCustById("1104");
//		System.out.println(cust.getCustId()+"----"+cust.getCustName()+"----"
//				+cust.getPhone()+"----"+cust.getAddress());
		//实践练习4.2
//		int count = custService.getCustListCount();
//		System.out.println("客户总数为："+count);
//		List<Cust> list = custService.getCustList();
//		for (Cust cust : list) {
//			System.out.println(cust.getCustId()+"----"+cust.getCustName()+"----"
//					+cust.getPhone()+"----"+cust.getAddress());
//		}
		//实践练习4.3
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		user.setId(8088);
		user.setName("王麻子");
		user.setPassword("1q2w3e4r5t");
		int row = userService.insertUser(user);
		if (row > 0) {
			System.out.println("新增用户:"+user.getName()+"成功!");
		}else {
			System.out.println("新增用户失败！");
		}
	}
}
