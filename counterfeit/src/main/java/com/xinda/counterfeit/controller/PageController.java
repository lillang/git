package com.xinda.counterfeit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @ClassName PageController
 * @Description TODO(页面跳转Controller)
 * @author Qin
 * @Date 2018-7-30下午1:54:04
 */
@Controller
public class PageController {

	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	@RequestMapping("/login")
	public String login(){
		return "index";
	}
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("/layout/{page}")
	public String showLayout(@PathVariable String page){
		return "layout/"+page;
	}
	
	@RequestMapping("/managementPage/{page}")
	public String showManagement(@PathVariable String page){
		return "management/"+page;
	}
	
	@RequestMapping("/counterfeitPage/{page}")
	public String showCounterfeit(@PathVariable String page){
		return "counterfeit/"+page;
	}

	@RequestMapping("/devicePage/{page}")
	public String showDevice(@PathVariable String page){
		return "device/"+page;
	}

	@RequestMapping("/analyzePage/{page}")
	public String showAnalyze(@PathVariable String page){
		return "analyze/"+page;
	}
	@RequestMapping("/rolePage/{page}")
	public String showRole(@PathVariable String page){
		return "management/"+page;
	}
	@RequestMapping("/warning/{page}")
	public String showWarning(@PathVariable String page){
		return "warning/"+page;
	}
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		return "management/addUser";
				
	}
	@RequestMapping("/toEdit")
	public String toEditUser(){
		return "management/updUser";
				
	}
	@RequestMapping("/toUpdPass")
	public String toUpdPass(){
		return "management/updPass";
	}
	@RequestMapping("/toEditRole")
	public String toEditRole(){
		return "management/roleEdit";
	}
	@RequestMapping("/toaddCounter")
	public String toAddCounter(){
		return "counterfeit/addCounterfeit";
	}
}
