package com.koma.stu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koma.stu.pojo.Student;
import com.koma.stu.serviceAndImpl.StudentService;

@Controller
public class StudentController {

	//自动装配
	@Autowired
	private StudentService studentService;
	
	//查询/模糊查询
	@RequestMapping("/selAll")
	public String selAll(@RequestParam(name="studentName",required = false,defaultValue = "")String studentName,Model model) {
		//调用查询方法
		List<Student> stuList = studentService.selAll(studentName);
		
		//将查询到的数据添加到model
		model.addAttribute("list", stuList);
		return "main";
	}
	
	//跳转到新增页面
	@RequestMapping("/goAdd")
	public String goAdd() {
		return "add";
	}
	
	//新增
	@RequestMapping("/addStudent")
	public String addStudent(Student student,Model model) {
		//调用新增方法
		int result = studentService.addStudent(student);
		
		//判断是否添加成功
		if(result <= 0) {
			model.addAttribute("error", "数据添加失败");
		}
		return "redirect:selAll";
	}
	
	//删除
	@RequestMapping("/delStudent")
	public String delStudent(int id,Model model) {
		//调用删除方法
		int result = studentService.delStudent(id);
		
		//判断是否删除成功
		if(result <= 0) {
			model.addAttribute("error", "数据删除失败");
		}
		return "redirect:selAll";
	}
	
	//查询单条数据
	@RequestMapping("/selOneById")
	public String selOneById(int id,Model model) {
		//调用查询单条方法
		Student stu = studentService.selOneById(id);
		
		//将查询到的数据添加到model
		model.addAttribute("stu", stu);
		return "update";
	}
	
	//修改方法
	@RequestMapping("/updateStudent")
	public String updateStudent(Student student,Model model) {
		//调用修改方法
		int result = studentService.updateStudent(student);
		
		//判断是否删除成功
		if(result <= 0) {
			model.addAttribute("error", "数据修改失败");
		}
		return "redirect:selAll";
	}
}