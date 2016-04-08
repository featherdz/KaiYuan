package org.java.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.java.pojo.Tests;
import org.java.service.TestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestsController {
	@Autowired
	private TestsService testsservice;
	/**
	 * 查询所有用户
	 * @return
	 */
	@RequestMapping("/select")
	public ModelAndView select(HttpSession session){
		List<Tests> ts=(List<Tests>) testsservice.selects();
		ModelAndView mv=new ModelAndView();
		mv.addObject("ts", ts);
		mv.setViewName("index.jsp");
		return mv;
	}
	/**
	 * 根据id查询用户
	 */
	@RequestMapping("/selectid")
	public String selectid(Integer id,Model model){
		Tests testid= testsservice.selectid(id);
		model.addAttribute("testid", testid);
		return "updates.jsp";
		
	}
	/**
	 * 新增用户
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Tests tests){
		testsservice.insert(tests);
		return "select.action";
	}
	/**
	 * 根据id删除用户
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(Integer id){
		testsservice.delete(id);
		return "select.action";
		
	}
	/**
	 * 修改用户
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Tests tests){
		testsservice.update(tests);
		return "select.action";
		
	}
}
