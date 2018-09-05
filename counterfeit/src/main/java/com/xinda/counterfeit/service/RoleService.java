package com.xinda.counterfeit.service;

import java.util.List;
import java.util.Map;

import com.xinda.counterfeit.pojo.TbRole;
import com.xinda.counterfeit.utils.BaseResult;

/**
 * 
 * @title: RoleService
 * @Description: 角色处理类接口
 * @author: lilanglang
 * @date:   2018年8月28日
 */
public interface RoleService {
	 List<Map<String, Object>> selectAll();
	 List<Map<String, Object>> selectByParam(Map<String, Object> param);
	 int insert(TbRole role);
	 BaseResult deleteByPrimaryKey(Integer roleId);
	 int updateByPrimaryKeySelective(TbRole role);
	 int selectByName(String roleName);
}
