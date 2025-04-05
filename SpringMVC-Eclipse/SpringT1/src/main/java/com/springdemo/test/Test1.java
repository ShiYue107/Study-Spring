package com.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.pojo.User;
import com.springdemo.service.UserService;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		User user = userService.getUserInfo("2345");
		System.out.println(user);
		User user1 = new User("12333", "wangwu", "123456", 15, "YunNanHongHe", "1");
		boolean flag = userService.insertUser(user1);
		if (flag) {
			System.out.println("插入成功");
		}
		boolean flag2 = userService.updateUser(user1);
		if (flag2) {
			System.out.println("修改成功");
		}
		boolean flag3 = userService.delUser(user1);
		if (flag3) {
			System.out.println("删除成功");
		}
	}
}
