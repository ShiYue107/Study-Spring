package com.admin.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.admin.pojo.Article;
import com.admin.pojo.User;
import com.admin.pojo.Zan;
import com.admin.service.UserService;
import com.admin.vo.QueryVo;

@Controller
@RequestMapping("/user")
public class userController {

	
	@Autowired(required=false)
	private UserService userService;
		
	
	@RequestMapping("/about")
	public String about(HttpServletRequest reuqest, 
			 Model model) throws Exception{
		return "front/about";
	}
	
	
	@RequestMapping("/queryuse")
	public ModelAndView queryuse(HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<User> list = userService.query();
		int total = list.size();
		model.addAttribute("list", list);
		model.addAttribute("total", total);
		mv.setViewName("admin/userquery");		
		return mv; 
	}
	
	
	
	@RequestMapping("/del/{uid}")
	public ModelAndView del(@PathVariable("uid") Integer uid,HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		int d = userService.delete(uid);	
		mv.setViewName("admin/userquery");		
		return mv; 

	}
	
	

}
