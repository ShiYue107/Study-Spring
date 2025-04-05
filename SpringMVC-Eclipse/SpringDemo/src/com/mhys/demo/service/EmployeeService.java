package com.mhys.demo.service;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	public void work() {
		System.out.println("正在努力工作中！");
	}
	
	public void drink() {
		System.out.println("口渴了，喝一点水！");
	}
	
	public void knock() {
		System.out.println("看着屏幕，敲键盘！");
	}
}
