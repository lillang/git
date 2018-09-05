package com.xinda.counterfeit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinda.counterfeit.mapper.TbPermissionMapper;
import com.xinda.counterfeit.pojo.TbRole;
import com.xinda.counterfeit.service.PermissionService;
import com.xinda.counterfeit.service.RoleService;
import com.xinda.counterfeit.utils.BaseResult;
import com.xinda.counterfeit.utils.JsonUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
@RequestMapping("/role")
@Controller
public class RoleController {
	@Autowired
	private RoleService roleService;
	@Autowired
	private PermissionService permissionService;
	@RequestMapping(value="/list",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String findList(){
 		List<Map<String, Object>> list=roleService.selectAll();
		JSONArray result=JSONArray.fromObject(list);
		String r=result.toString();
		return result.toString();
	}
	@RequestMapping("/getRole")
	@ResponseBody
	public BaseResult getRole(Map<String, Object> param){
		List<Map<String, Object>> list=roleService.selectByParam(param);
		if(list!=null){
			
			return BaseResult.build(200, "",list);
		}
		return null;
	}
	@RequestMapping("/addRole")
	@ResponseBody
	public BaseResult addRole(TbRole role,String type,String roleid){
		if(type!=null&type.equals("modifyRole")){
			//修改
			role.setRoleId(Long.valueOf(roleid));
			int result=roleService.updateByPrimaryKeySelective(role);
			if(result>0){
				return BaseResult.build(200, "修改成功！");
			}
			return BaseResult.build(201, "操作失败！");
		}
		int result=roleService.insert(role);
		if(result>0){
			return BaseResult.build(200, "新增成功！");
		}
		return BaseResult.build(201, "操作失败！");
	}
	//删除角色
	@RequestMapping("/delRole")
	@ResponseBody
	public BaseResult delRole(Integer roleid){
		return roleService.deleteByPrimaryKey(roleid);
		
	}
	//判断是否存在角色
	@RequestMapping("/selectRole")
	@ResponseBody
	public BaseResult selectRole(String name){
		int result=roleService.selectByName(name);
		if(result>0){
			return BaseResult.build(201, "该角色已存在，请重新输入！");
		}
		return BaseResult.build(200, "");
	}
}
