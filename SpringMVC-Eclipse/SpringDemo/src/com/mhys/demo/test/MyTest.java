package com.mhys.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhys.demo.service.EmployeeService;

public class MyTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		employeeService.work();
		employeeService.drink();
		employeeService.knock();
	}
}
