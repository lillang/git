package com.xinda.counterfeit.controller;

import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.jdbc.log.Log;
import com.xinda.counterfeit.pojo.TbPermission;
import com.xinda.counterfeit.pojo.TbUser;
import com.xinda.counterfeit.service.PermissionService;
import com.xinda.counterfeit.service.UserService;
import com.xinda.counterfeit.utils.BaseResult;
import com.xinda.counterfeit.utils.EUDataGridResult;
import com.xinda.counterfeit.utils.MD5Util;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private PermissionService permissionService;
	@RequestMapping(value = "/login")
	@ResponseBody
	public BaseResult userLogin(TbUser user,HttpSession httpSession) { 
		TbUser tbUser=userService.selectUser(user);
		if(tbUser==null){
			return BaseResult.build(201, "用户名或者密码不正确");
		}else if(!checkPermission(tbUser.getUserRoleid(),"系统登录")){
			return BaseResult.build(201, "此角色不允许登录系统");
		}else if (tbUser.getUserStatus()==2) {
			return BaseResult.build(201, "您多次重试登录不成功，账号被锁定，请联系管理员更改密码");
		}else if (!tbUser.getUserPassword().equals(MD5Util.ToMd5(user.getUserPassword()))) {
			tbUser.setUserRetrylogin(tbUser.getUserRetrylogin()+1);
			if (tbUser.getUserRetrylogin() >= 3) {
				tbUser.setUserStatus(2);
			}
			userService.updateByPrimaryKey(tbUser);
			return BaseResult.build(201, "用户名或者密码错误");
		} else {
			tbUser.setUserRetrylogin(0);
			userService.updateByPrimaryKey(tbUser);
			httpSession.setAttribute("UserInfo", tbUser);
			return BaseResult.build(200, "登录成功");
		}
	}

	private boolean checkPermission(Integer userRoleid, String permissionCode) {
		TbPermission permission = this.permissionService.checkPermission(Integer.valueOf(userRoleid), permissionCode);
		if (permission != null) {
			return true;
		} else {
			return false;
		}
	}
	
	@RequestMapping(value = "/getUserList")
	@ResponseBody
	public EUDataGridResult getUserList(Integer page, Integer rows) { 
		return userService.getUserList(page, rows);
	}
	
	@RequestMapping(value="/toAddUser")
	@ResponseBody
	public String toAddUser(){
		String path="management/addUser";
		return path;
				
	}
	@RequestMapping(value="/addUser")
	@ResponseBody
	public BaseResult addUser(TbUser tbUser, Model model){
		if(tbUser!=null){
			tbUser.setUserPassword(MD5Util.ToMd5(tbUser.getUserPassword()));
			int result=userService.insert(tbUser);
			if(result>0){
				return BaseResult.build(200, "操作成功");
			}else{
				return BaseResult.build(201, "操作失败，请检查后再提交！");
			}
		}
		return null;
		
	}
	
	//批量删除
	@RequestMapping("/delUser")
	@ResponseBody
	public BaseResult delUser(int[] deleteobj){
		try {
			if(deleteobj!=null){
				int result=userService.deleteMany(deleteobj);
				if(result>0){
					return BaseResult.build(200, "操作成功");
				}else{
					return BaseResult.build(201, "操作失败，请检查后再提交！");
				}
			}
		} catch (Exception e) {
			
		}
		return null;
	}
	//修改
	@RequestMapping("/updUser")
	@ResponseBody
	public BaseResult updUser(TbUser user){
		if(user!=null){
			int result=userService.updateByPrimaryKey(user);
			if(result>0){
				return BaseResult.build(200, "修改成功");
			}
			return BaseResult.build(201, "操作失败！");
		}
		return null;
	}
	//根据账号查找
	@RequestMapping("/getByAccount")
	@ResponseBody
	public BaseResult getUserByAccount(String account){
		int result=userService.selectByAccount(account);
		if(result>0){
			return BaseResult.build(201, "您输入的账号已存在，请重新输入！");
		}
		return BaseResult.build(200, "");
	}
	@RequestMapping("/findPass")
	@ResponseBody
	public BaseResult findPass(String password,Long id){
		TbUser user=userService.selectByPrimaryKey(id);
		String pass=MD5Util.ToMd5(password);
		if(pass.equals(user.getUserPassword())){
			return BaseResult.build(201,"新密码不能与原密码一致！");
		}
		return BaseResult.build(200,"");
	}
	@RequestMapping("/updPass")
	@ResponseBody
	public BaseResult updPass(Long userId,String newPassword){
		TbUser user=userService.selectByPrimaryKey(userId);
		user.setUserPassword(MD5Util.ToMd5(newPassword));
		int result=userService.updateByPrimaryKey(user);
		if(result>0){
			return BaseResult.build(200,"修改成功！"); 
		}
		return BaseResult.build(201,"操作失败，请检查后再提交！");
	}
	
	
	@RequestMapping("/logout")
	@ResponseBody
	public BaseResult logout(HttpSession session){
		session.invalidate();
		return BaseResult.build(200,"");
		}
	}
