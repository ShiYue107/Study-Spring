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
		//ʾ��4.4
//		Cust cust = new Cust();
//		cust.setCustId("1101");
//		cust.setPhone("12312312312");
//		int row = custService.modifyCustById(cust);
		//ʾ��4.5
//		int row = custService.deleteCustById(cust);
//		if (row > 0) {
//			System.out.println("�����ɹ���");
//		}
		//ʾ��4.6
//		Cust cust = custService.getCustById("1104");
//		System.out.println(cust.getCustId()+"----"+cust.getCustName()+"----"
//				+cust.getPhone()+"----"+cust.getAddress());
		//ʵ����ϰ4.2
//		int count = custService.getCustListCount();
//		System.out.println("�ͻ�����Ϊ��"+count);
//		List<Cust> list = custService.getCustList();
//		for (Cust cust : list) {
//			System.out.println(cust.getCustId()+"----"+cust.getCustName()+"----"
//					+cust.getPhone()+"----"+cust.getAddress());
//		}
		//ʵ����ϰ4.3
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		user.setId(8088);
		user.setName("������");
		user.setPassword("1q2w3e4r5t");
		int row = userService.insertUser(user);
		if (row > 0) {
			System.out.println("�����û�:"+user.getName()+"�ɹ�!");
		}else {
			System.out.println("�����û�ʧ�ܣ�");
		}
	}
}
