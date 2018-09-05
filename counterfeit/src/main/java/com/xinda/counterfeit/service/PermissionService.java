package com.xinda.counterfeit.service;

import java.util.List;
import java.util.Map;

import com.xinda.counterfeit.pojo.TbPermission;


public interface PermissionService {

	TbPermission checkPermission(Integer userRoleid, String permissionCode);
	List<Map<String, Object>> selectByParam(Map<String, Object> param);
	int updPermission(Map<String, Object> param);
	int deleteByPrimaryKey(Integer roleid);
	int selectByRolesId(Integer roleid);
}
