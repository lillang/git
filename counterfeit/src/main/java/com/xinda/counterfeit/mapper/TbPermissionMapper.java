package com.xinda.counterfeit.mapper;

import com.xinda.counterfeit.pojo.TbPermission;
import com.xinda.counterfeit.pojo.TbPermissionExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbPermissionMapper {
    int countByExample(TbPermissionExample example);

    int deleteByExample(Long roleid);

    int deleteByPrimaryKey(Integer permissionId);

    int insert(TbPermission record);
    int insertParam(Map<String, Object> param);

	int insertSelective(TbPermission record);
    int selectByRolesId(Integer roleid);
    List<TbPermission> selectByExample(TbPermissionExample example);
    List<Map<String, Object>> selectByParam(Map<String, Object> param);
    TbPermission selectByPrimaryKey(Long permissionId);

    int updateByExampleSelective(@Param("record") TbPermission record, @Param("example") TbPermissionExample example);

    int updateByExample(@Param("record") TbPermission record, @Param("example") TbPermissionExample example);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);
    
    int deleteByRoleId(Integer roleid);
	TbPermission selectByRoleidAndCode(@Param("userRoleid")Integer userRoleid, @Param("permissionCode")String permissionCode);
}