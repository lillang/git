package com.xinda.counterfeit.mapper;

import com.xinda.counterfeit.pojo.TbRole;
import com.xinda.counterfeit.pojo.TbRoleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbRoleMapper {
    int countByExample(TbRoleExample example);

    int deleteByExample(TbRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    List<TbRole> selectByExample(TbRoleExample example);
    	
    List<Map<String, Object>> selectByParam(Map<String, Object> param);
    
    TbRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByExample(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByPrimaryKeySelective(TbRole record);
    int selectByName(String roleName);
    int updateByPrimaryKey(TbRole record);
    int deleteByRoleId(Integer roleid);
    List<Map<String, Object>> selectAll();
}