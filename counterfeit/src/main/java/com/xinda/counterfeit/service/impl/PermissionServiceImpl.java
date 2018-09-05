package com.xinda.counterfeit.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinda.counterfeit.mapper.TbPermissionMapper;
import com.xinda.counterfeit.pojo.TbPermission;
import com.xinda.counterfeit.service.PermissionService;

/**
 * 
 * @ClassName PermissionServiceImpl
 * @Description TODO(权限信息处理service)
 * @author Qin
 * @Date 2018-7-31上午10:50:43
 */
@Service
public class PermissionServiceImpl implements PermissionService{
	private static Logger log=Logger.getLogger(PermissionServiceImpl.class);
	@Autowired
	private TbPermissionMapper tbPermissionMapper;

	public TbPermission checkPermission(Integer userRoleid,
			String permissionCode) {
		TbPermission permission = this.tbPermissionMapper.selectByRoleidAndCode(Integer.valueOf(userRoleid), permissionCode);
		return permission;
	}

	public List<Map<String, Object>> selectByParam(Map<String, Object> param) {
		try {
			List<Map<String, Object>> list=this.tbPermissionMapper.selectByParam(param);
			 Map<String, Map<String, Object>> permissionMap = new HashMap<String, Map<String, Object>>();
	            List<Map<String, Object>> hierarchy = new ArrayList<Map<String, Object>>();
	            for (Map<String, Object> permission : list) { 
	                String parentid = permission.get("right_parentid").toString();
	                if (permissionMap.containsKey(parentid)) {
	                    List<Map<String, Object>> children = ((List<Map<String, Object>>)permissionMap.get(parentid).get("children"));
	                    if (children == null) {
	                        children = new ArrayList<Map<String, Object>>();
	                        permissionMap.get(parentid).put("children", children);
	                    }
	                    children.add(permission);
	                } else {
	                    hierarchy.add(permission);
	                }
	                permissionMap.put(permission.get("right_id").toString(), permission);
	            }
	            return hierarchy;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public int updPermission(Map<String, Object> param) {
		try {
            if (param == null || param.get("rights") == null) {
                return 0;
            }
            deleteByPrimaryKey(Integer.parseInt(param.get("roleid").toString()));
            for (Map<String, Object> item : (List<Map<String, Object>>)param.get("rights")) {
                this.tbPermissionMapper.insertParam(item);
            }
            if(((List<Map<String, Object>>)param.get("rights")).size()!=0){
            	log.info("修改成功！");
            }
			
            return 1;
        } catch (Exception e) {
        	log.error("Permission modifying with exception : ", e);
        }
		return 0;
	}

	public int deleteByPrimaryKey(Integer roleid) {
		return this.tbPermissionMapper.deleteByPrimaryKey(roleid);
	}

	public int selectByRolesId(Integer roleid) {
		return tbPermissionMapper.selectByRolesId(roleid);
	}


	
}
