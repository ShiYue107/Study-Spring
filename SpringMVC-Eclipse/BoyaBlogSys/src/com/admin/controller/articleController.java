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

import com.admin.pojo.Article;
import com.admin.pojo.Catelog;
import com.admin.service.ArticleService;
import com.admin.service.CatelogService;
import com.admin.service.CommentService;

@Controller
@RequestMapping("/article")
public class articleController {
	@Autowired(required=false)
	private ArticleService articleService;
	@Autowired(required=false)
	private CommentService commentService;
	@Autowired(required=false)
	private CatelogService catelogService;
    
    @RequestMapping("/articlemana")
	public ModelAndView  articlemana(Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Article> list = articleService.articlelist();
		int article_total = list.size();
		model.addAttribute("article_total", article_total);
		model.addAttribute("list", list);
		List<Catelog>  Cateloglist = catelogService.selectCatelog();
		model.addAttribute("Cateloglist", Cateloglist);
	    mv.setViewName("admin/articlemana");		
	    return mv;  
	}
    @RequestMapping("/edit/{id}")
	public ModelAndView  edit(@PathVariable("id") Integer aid,Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Catelog>  Cateloglist = catelogService.selectCatelog();
		Article article = articleService.findItemsById(aid);
		model.addAttribute("article", article);
		model.addAttribute("Cateloglist", Cateloglist);
	    mv.setViewName("admin/article_edit");		
	    return mv;  
	}
    @RequestMapping("/edit_submit")
	public String  edit_submit(Article article,Model model,HttpServletRequest request) throws Exception{
		int n = articleService.updateArticle(article);
		request.setAttribute("msg", "修改成功！");
	    return "admin/article_edit";  
	}
	@RequestMapping("/article_del/{aid}")
	public ModelAndView article_del(@PathVariable("aid") Integer aid,HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		int n = articleService.delete(aid);
		commentService.deleteByAid(aid);
		mv.setViewName("admin/articlemana");		
		return mv; 
	}
	@RequestMapping("/article_add")
	public ModelAndView  article_add(Model model,HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Catelog>  Cateloglist = catelogService.selectCatelog();
		model.addAttribute("Cateloglist", Cateloglist);
		mv.setViewName("admin/article_add");		
	    return mv; 
	}
	@RequestMapping("/add_submit")
    public String  add_submit(Article article,Model model,HttpServletRequest request) throws Exception{
		Calendar calendar = Calendar.getInstance();
		Date time = calendar.getTime();
		article.setTime(time);
		int n = articleService.addarticle(article);
		request.setAttribute("msg", "添加成功");
		return "admin/article_add";
	}
}
