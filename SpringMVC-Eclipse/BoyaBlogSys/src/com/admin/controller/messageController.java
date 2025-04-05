package com.admin.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import com.admin.pojo.Catelog;
import com.admin.pojo.Comment;
import com.admin.pojo.Message;
import com.admin.pojo.Zan;
import com.admin.service.MessageService;
import com.admin.vo.QueryVo;

@Controller
@RequestMapping("/message")
public class messageController {
	
	@Autowired(required=false)
	private MessageService messageService;
	
	@RequestMapping("/message_index")
	public ModelAndView  message_index(Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Message> messagelist = messageService.findMessage();
		int message_total = messagelist.size();
		mv.addObject("messagelist", messagelist);
		mv.addObject("message_total", message_total);
	    mv.setViewName("admin/message_index");		
	    return mv;  
	}
	
	@RequestMapping("/deleteByMid/{mid}")
	public ModelAndView deleteByMid(@PathVariable("mid") Integer mid,HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		int n = messageService.delete(mid);
		mv.setViewName("admin/articlemana");		
		return mv; 
	}
	

	
	

}
