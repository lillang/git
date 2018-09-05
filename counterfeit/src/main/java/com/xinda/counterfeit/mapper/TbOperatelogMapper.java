package com.xinda.counterfeit.mapper;

import com.xinda.counterfeit.pojo.TbOperatelog;
import com.xinda.counterfeit.pojo.TbOperatelogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOperatelogMapper {
    int countByExample(TbOperatelogExample example);

    int deleteByExample(TbOperatelogExample example);

    int deleteByPrimaryKey(Long operatelogId);

    int insert(TbOperatelog record);

    int insertSelective(TbOperatelog record);

    List<TbOperatelog> selectByExampleWithBLOBs(TbOperatelogExample example);

    List<TbOperatelog> selectByExample(TbOperatelogExample example);

    TbOperatelog selectByPrimaryKey(Long operatelogId);

    int updateByExampleSelective(@Param("record") TbOperatelog record, @Param("example") TbOperatelogExample example);

    int updateByExampleWithBLOBs(@Param("record") TbOperatelog record, @Param("example") TbOperatelogExample example);

    int updateByExample(@Param("record") TbOperatelog record, @Param("example") TbOperatelogExample example);

    int updateByPrimaryKeySelective(TbOperatelog record);

    int updateByPrimaryKeyWithBLOBs(TbOperatelog record);

    int updateByPrimaryKey(TbOperatelog record);
}