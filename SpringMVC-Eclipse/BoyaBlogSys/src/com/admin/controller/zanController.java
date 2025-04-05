package com.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.admin.pojo.Zan;
import com.admin.service.ZanService;
@Controller
@RequestMapping("/zan")
public class zanController {
	@Autowired(required=false)
	private ZanService zanService;
	
	@RequestMapping("/zan_index")
	public ModelAndView index(HttpServletRequest request, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Zan> lists = zanService.findZanAll();
		int size = lists.size();
		String[] str = new String[size];
		int[] data = new int[size];
		for(int i = 0;i<size;i++) {
			str[i]=lists.get(i).getAid().toString();
			data[i]=lists.get(i).getQuantity();
		}		
		model.addAttribute("str", str);
		model.addAttribute("data", data);
		model.addAttribute("size", size);
		mv.setViewName("admin/zan_index");		
		return mv; 
	}
}
