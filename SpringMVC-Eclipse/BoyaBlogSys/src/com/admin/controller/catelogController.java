package com.admin.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.admin.pojo.Article;
import com.admin.pojo.Catelog;
import com.admin.service.CatelogService;

@Controller
@RequestMapping("/catelog")
public class catelogController {

	@Autowired(required=false)
	private CatelogService catelogService;
	
	@RequestMapping("/catelog_index")
	public ModelAndView  catelog_index() throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Catelog> cateloglist = catelogService.list();
		int catelog_total = cateloglist.size();
		mv.addObject("list", cateloglist);
		mv.addObject("catelog_total", catelog_total);
	    mv.setViewName("admin/catelog_index");		
	    return mv;  
	}
	
	@RequestMapping("/catelog_add")
	public ModelAndView  catelog_add(Model model,HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Catelog>  Cateloglist = catelogService.selectCatelog();
		model.addAttribute("Cateloglist", Cateloglist);
		mv.setViewName("admin/catelog_add");		
	    return mv; 
	}
	
	@RequestMapping("/catelog_submit")
    public String  catelog_submit(Catelog catelog,Model model,HttpServletRequest request) throws Exception{
		List<Catelog> type_list = catelogService.querytype(catelog.getType());
		if(type_list.size()==0) {
			int n = catelogService.addcatelog(catelog);
			request.setAttribute("msg", "添加成功！");
			return "admin/catelog_add";
		}else {
			request.setAttribute("msg", "分类标识必须唯一，请重试！");
			return "admin/catelog_add";
		}
	}
	
	
	@RequestMapping("/catelog_edit/{gid}")
	public ModelAndView  catelog_edit(@PathVariable("gid") Integer gid,Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		Catelog catelog = catelogService.queryByid(gid);
		List<Catelog>  Cateloglist = catelogService.selectCatelog();
		model.addAttribute("Cateloglist", Cateloglist);
		model.addAttribute("catelog", catelog);
	    mv.setViewName("admin/catelog_edit");		
	    return mv;  
	}
	
	@RequestMapping("/catelog_del/{gid}")
	public ModelAndView article_del(@PathVariable("gid") Integer gid,HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		int n = catelogService.deletecatelog(gid);	
		mv.setViewName("admin/catelog_index");		
		return mv; 
	}
	
	
	@RequestMapping("/catelog_edit_sub")
    public String  catelog_edit_sub(Catelog catelog,Model model,HttpServletRequest request) throws Exception{
		int n = catelogService.editCatelog(catelog);
		request.setAttribute("msg", "修改成功！");
		return "admin/catelog_edit";
	}
	
	@RequestMapping("/catelogReset")
	public String catelogReset(HttpServletRequest request) throws Exception{
		//�û��˳�
		HttpSession session   =   request.getSession();  
		session.invalidate();
		return "redirect:/catelog/catelog_add";
	}

	
}
