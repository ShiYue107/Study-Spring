package com.admin.controller;

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
import com.admin.pojo.Comment;
import com.admin.pojo.Zan;
import com.admin.service.ArticleService;
import com.admin.service.CommentService;
import com.admin.vo.QueryVo;

@Controller
@RequestMapping("/comment")
public class commentController {
	@Autowired(required=false)
	private CommentService commentService;
	@Autowired(required=false)
	private ArticleService articleService;
	
	@RequestMapping("/comment_index")
	public ModelAndView  comment_index(Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<QueryVo> queryVo=new ArrayList<QueryVo>(); 
		List<Comment> Commentlist = commentService.queryAll();
		List<Article> list = articleService.articlelist();
		for(int i=0;i<Commentlist.size();i++) {
			QueryVo element = new QueryVo();
			queryVo.add(i, element);
			queryVo.get(i).setAid(Commentlist.get(i).getAid());
			queryVo.get(i).setUid(Commentlist.get(i).getUid());
			queryVo.get(i).setCid(Commentlist.get(i).getCid());
			queryVo.get(i).setContent(Commentlist.get(i).getContent());
			queryVo.get(i).setTime(Commentlist.get(i).getTime());
			int Commentlist_aid = Commentlist.get(i).getAid();
			for(int n=0;n<list.size();n++) {
				int list_aid=list.get(n).getAid();
				if(list_aid == Commentlist_aid) {
					queryVo.get(i).setAname(list.get(n).getTitle());
				}
			}
		}
		int comment_total = queryVo.size();
		mv.addObject("comment_total", comment_total);
		mv.addObject("queryVo", queryVo);
	    mv.setViewName("admin/comment_index");		
	    return mv;  
	}
	@RequestMapping("/deleteByCid/{cid}")
	public ModelAndView article_del(@PathVariable("cid") Integer cid,HttpServletRequest reuqest, 
			 Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		int n = commentService.deleteByCid(cid);
		mv.setViewName("admin/articlemana");		
		return mv; 
	}
}
