package com.xinda.counterfeit.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinda.counterfeit.mapper.TbPermissionMapper;
import com.xinda.counterfeit.mapper.TbRoleMapper;
import com.xinda.counterfeit.pojo.TbRole;
import com.xinda.counterfeit.service.RoleService;
import com.xinda.counterfeit.utils.BaseResult;
/**
 * 
 * @title: RoleServiceImpl
 * @Description: <p/>
 * @author: lilanglang
 * @date:   2018年8月28日
 */
@Service
public class RoleServiceImpl implements RoleService {
	private static Logger log=Logger.getLogger(RoleServiceImpl.class);
	@Autowired
	private TbRoleMapper tbRoleMapper;
	@Autowired
	private TbPermissionMapper tbPermissionMapper;
	public List<Map<String, Object>> selectAll() {
		return tbRoleMapper.selectAll();
	}
	public List<Map<String, Object>> selectByParam(Map<String, Object> param) {
		return tbRoleMapper.selectByParam(param);
	}
	public int insert(TbRole role) {
		return tbRoleMapper.insert(role);
	}
	public BaseResult deleteByPrimaryKey(Integer roleId) {
		try {
			//查找是否正在使用
			int result=tbPermissionMapper.selectByRolesId(roleId);
			if(result>0){
				return BaseResult.build(201, "该角色正在使用，不能删除！");
			}
			//删除操作
			int results=tbRoleMapper.deleteByPrimaryKey(Long.valueOf(roleId.toString()));
			if(results>0){
				return BaseResult.build(200, "删除成功！");
			}
			return BaseResult.build(201, "操作失败！");
		} catch (Exception e) {
			log.error("失败原因"+e);
		}
		return null;
	}
	public int updateByPrimaryKeySelective(TbRole role) {
		return tbRoleMapper.updateByPrimaryKeySelective(role);
	}
	public int selectByName(String roleName) {
		return tbRoleMapper.selectByName(roleName);
	}
	
}
