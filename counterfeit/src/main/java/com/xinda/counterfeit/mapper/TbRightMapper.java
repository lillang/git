package com.xinda.counterfeit.mapper;

import com.xinda.counterfeit.pojo.TbRight;
import com.xinda.counterfeit.pojo.TbRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRightMapper {
    int countByExample(TbRightExample example);

    int deleteByExample(TbRightExample example);

    int deleteByPrimaryKey(Long rightId);

    int insert(TbRight record);

    int insertSelective(TbRight record);

    List<TbRight> selectByExample(TbRightExample example);

    TbRight selectByPrimaryKey(Long rightId);

    int updateByExampleSelective(@Param("record") TbRight record, @Param("example") TbRightExample example);

    int updateByExample(@Param("record") TbRight record, @Param("example") TbRightExample example);

    int updateByPrimaryKeySelective(TbRight record);

    int updateByPrimaryKey(TbRight record);
}