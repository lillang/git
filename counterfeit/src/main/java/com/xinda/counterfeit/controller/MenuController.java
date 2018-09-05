package com.xinda.counterfeit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinda.counterfeit.pojo.TbMenu;
import com.xinda.counterfeit.pojo.TbUser;
import com.xinda.counterfeit.service.MenuService;
import com.xinda.counterfeit.utils.TreeModel;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuService menuService;

	@RequestMapping(value = "/getMenu")
	@ResponseBody
	public List<TreeModel> getMenu(HttpSession httpSession) {
		if(httpSession.getAttribute("UserInfo")==null){
			return null;
		}
		Integer userRoleid = ((TbUser)httpSession.getAttribute("UserInfo")).getUserRoleid();
		return getTreeList(null,userRoleid);
	}

	private List<TreeModel> getTreeList(TreeModel tree, Integer userRoleid) {
		List<TreeModel> treelist = new ArrayList<TreeModel>();
		Long parentId = null;
		if(tree != null){
			parentId = tree.getId();
		}
		List<TbMenu> list = this.menuService.selectByRole(userRoleid,parentId);
		for(TbMenu m : list){
			  TreeModel model = new TreeModel();
			  model.setText(m.getMenuText());
			  model.setId(m.getMenuId());
			  model.setParenId(m.getMenuParentid());
			  Map<String,String> attrebutes = new HashMap<String,String>();
			  attrebutes.put("url", m.getMenuUrl());
			  attrebutes.put("iconCls", m.getMenuIconcls());
			  model.setAttributes(attrebutes);
			  model.setIconCls(m.getMenuIconcls());
			  model.setChildren(getTreeList(model,userRoleid));
			  treelist.add(model);
		}
		return treelist;
	}

}