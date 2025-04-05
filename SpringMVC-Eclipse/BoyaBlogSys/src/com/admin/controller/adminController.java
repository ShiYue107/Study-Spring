package com.admin.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.admin.pojo.Admin;
import com.admin.pojo.Article;
import com.admin.pojo.Catelog;
import com.admin.pojo.User;
import com.admin.service.AdminService;



@Controller
@RequestMapping("/admin")
public class adminController {
	
	@Autowired(required=false)
	private AdminService adminService;
	
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/index");		
		return mv; 
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/login");		
		return mv; 
	}
	
	
	
	@RequestMapping("/welcome")
	public ModelAndView welcome(HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/welcome");		
		return mv; 
	}

	
	
	@RequestMapping("/loginsubmit")
	public ModelAndView userSubmit(String supername, String superpassword ,HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		ModelAndView modelAndView = new ModelAndView();
		List<Admin> list = adminService.selectName(supername);
		if(list.size()==0) {
			request.setAttribute("msg", "对不起，登录名错误，请重试！");
			modelAndView.setViewName("admin/login");		
			return modelAndView;
		}else {
			Admin admin = list.get(0);		
			if(admin.getSuperpassword().equals(superpassword)) {
				session.setAttribute("supername", supername);
				modelAndView.setViewName("admin/index");
				return new ModelAndView("redirect:/admin/index");
			}else {			
				request.setAttribute("msg", "对不起，密码错误，请重试！");
				modelAndView.setViewName("admin/login");		
				return modelAndView;
			}
			
		}	
	}	
	
	@RequestMapping("/adminReset")
	public String userReset(HttpServletRequest request) throws Exception{
		HttpSession session   =   request.getSession();  
		session.invalidate();
		return "redirect:/admin/login";
	}

	
	@RequestMapping("/admin_index")
	public String admin_index(HttpServletRequest request,Model model) throws Exception{
		List<Admin> adminList = adminService.queryList();
		int admin_total = adminList.size();
		model.addAttribute("adminList", adminList);
		model.addAttribute("admin_total", admin_total);
		return "admin/admin_index";
	}
	
	
	@RequestMapping("/admin_edit/{id}")
	public ModelAndView  admin_edit(@PathVariable("id") Integer superid,Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		Admin admin = adminService.queryById(superid);
		model.addAttribute("admin", admin);
	    mv.setViewName("admin/admin_edit");		
	    return mv;  
	}
	
	
	@RequestMapping("/adminedit_submit")
	public String  adminedit_submit(Admin admin,Model model,HttpServletRequest request) throws Exception{
		int n = adminService.update(admin);
		request.setAttribute("msg", "修改成功！");
	    return "admin/admin_edit";  
	}
	
	@RequestMapping("/admin_add")
	public String  admin_add(Model model,HttpServletRequest request) throws Exception{
	    return "admin/admin_add";  
	}
	
	
	@RequestMapping("/admin_add_sub")
    public String  admin_add_sub(Admin admin,Model model,HttpServletRequest request) throws Exception{
		Calendar calendar = Calendar.getInstance();
		Date time = calendar.getTime();
		admin.setDate(time);
		int n = adminService.insert(admin);
		request.setAttribute("msg", "添加成功！");
		return "admin/admin_add";
	}
	
	@RequestMapping("/admin_del/{superid}")
	public ModelAndView article_del(@PathVariable("superid") Integer superid,HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		int n = adminService.delete(superid);
		mv.setViewName("admin/admin_index");		
		return mv; 
	}
	
	
	
}
