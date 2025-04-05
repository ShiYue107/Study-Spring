package com.admin.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.admin.pojo.Admin;
import com.admin.pojo.Post;
import com.admin.service.AdminService;
import com.admin.service.CatelogService;
import com.admin.service.PostService;

@Controller
@RequestMapping("/post")
public class postController {
	
	@Autowired(required=false)
	private PostService postService;
	
	@Autowired(required=false)
	private CatelogService catelogService;
	
	@Autowired(required=false)
	private AdminService adminService;
	
	@RequestMapping("/post_index")
	public ModelAndView  post_list(Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Post> postlist = postService.findPost();
		int post_total = postlist.size();
		model.addAttribute("postlist", postlist);
		model.addAttribute("post_total", post_total);
	    mv.setViewName("admin/post_index");		
	    return mv;  
	}
	
	@RequestMapping("/edit/{gid}")
	public ModelAndView  edit(@PathVariable("gid") Integer gid,Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		Post post = postService.findPostById(gid);
		model.addAttribute("post", post);
	    mv.setViewName("admin/post_edit");		
	    return mv;  
	}
	
	@RequestMapping("/post_edit")
	public String  post_edit(Post post,Model model,HttpServletRequest request) throws Exception{
		int n = postService.updatePost(post);
		List<Post> postlist = postService.findPost();
		int post_total = postlist.size();
		model.addAttribute("postlist", postlist);
		model.addAttribute("post_total", post_total);
		request.setAttribute("msg", "修改成功！");
	    return "admin/post_edit";  
	}
	
	@RequestMapping("/post_add")
	public String  post_add(Model model,HttpServletRequest request) throws Exception{
	    return "admin/post_add";  
	}
	
	
	@RequestMapping("/post_add_submit")
	public String  post_add_submit(Post post,Model model,HttpServletRequest request) throws Exception{
		List<Admin> adminlist = adminService.selectName(post.getAuthor());
		int superid = adminlist.get(0).getSuperid();
		post.setSuperid(superid);
		Calendar calendar = Calendar.getInstance();
		Date time = calendar.getTime();
		post.setTime(time);
		int n = postService.insert(post);
		request.setAttribute("msg", "添加成功！");
		return "admin/post_add";
	}
	
	@RequestMapping("/post_del/{gid}")
	public ModelAndView post_del(@PathVariable("gid") Integer gid,HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		int n = postService.delete(gid);
		mv.setViewName("admin/articlemana");		
		return mv; 
	}
	
	

}
