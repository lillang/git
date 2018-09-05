package com.xinda.counterfeit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xinda.counterfeit.service.PermissionService;
import com.xinda.counterfeit.utils.BaseResult;

@Controller
@RequestMapping("/per")
public class PermissionController {
@Autowired
private PermissionService permissionService;
protected Gson gson = new GsonBuilder().setDateFormat("yyyyMMddHHmmss").create();
	@RequestMapping("/getPer")
	@ResponseBody
	public BaseResult getPer(Map<String, Object> param,String roleid){
		if(roleid!=null){
			param=new HashMap<String, Object>();
			param.put("roleid", Integer.parseInt(roleid));
		}
		List<Map<String, Object>> list=permissionService.selectByParam(param);
		if(list!=null){
			
			return BaseResult.build(200, "",list);
		}
		return null;
	}
	@RequestMapping("/updPer")
	@ResponseBody
	public BaseResult updPer(Map<String, Object> param,String roleid,String rights){
		@SuppressWarnings("unchecked")
		Map<String, Object> a = gson.fromJson(rights, Map.class);
		param.remove("rights");
		param.putAll(a);
		param.put("roleid",roleid);
		int result=permissionService.updPermission(param);
		if(result>0){
			return BaseResult.build(200, "修改成功！");
		}
		return BaseResult.build(201, "");
	}
}
