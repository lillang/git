package com.xinda.counterfeit.mapper;

import com.xinda.counterfeit.pojo.TbMenu;
import com.xinda.counterfeit.pojo.TbMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMenuMapper {
    int countByExample(TbMenuExample example);

    int deleteByExample(TbMenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(TbMenu record);

    int insertSelective(TbMenu record);

    List<TbMenu> selectByExample(TbMenuExample example);

    TbMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByExample(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByPrimaryKeySelective(TbMenu record);

    int updateByPrimaryKey(TbMenu record);

	List<TbMenu> selectByRole(@Param("roleid")Integer userRoleid, @Param("parentId")Long parentId);
}