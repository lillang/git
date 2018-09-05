package com.xinda.counterfeit.mapper;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.xinda.counterfeit.pojo.TbCounterfeit;
import com.xinda.counterfeit.pojo.TbCounterfeitExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbCounterfeitMapper {
    int countByExample(TbCounterfeitExample example);

    int deleteByExample(TbCounterfeitExample example);

    int deleteByPrimaryKey(Long counterfeitId);

    int insert(TbCounterfeit record);

    int insertSelective(TbCounterfeit record);

    List<TbCounterfeit> selectByExample(TbCounterfeitExample example);
    
    List<TbCounterfeit> selectByArea(@Param("areaName")String areaName,@Param("page")Integer page,@Param("rows")Integer rows);
    
    TbCounterfeit selectByPrimaryKey(Long counterfeitId);

    int updateByExampleSelective(@Param("record") TbCounterfeit record, @Param("example") TbCounterfeitExample example);

    int updateByExample(@Param("record") TbCounterfeit record, @Param("example") TbCounterfeitExample example);

    int updateByPrimaryKeySelective(TbCounterfeit record);

    int updateByPrimaryKey(TbCounterfeit record);
    //假币分析
    List<TbCounterfeit> selectCountfeitAnalyze(Map<String, Object> map);
//	List<TbCounterfeit> selectByCondition(Map<Object, Object> param);

//	Integer selectByConditionCount(Map<Object, Object> param);
}