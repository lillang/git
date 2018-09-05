package com.xinda.counterfeit.mapper;

import com.xinda.counterfeit.pojo.TbDevice;
import com.xinda.counterfeit.pojo.TbDeviceExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbDeviceMapper {
    int countByExample(TbDeviceExample example);

    int deleteByExample(TbDeviceExample example);

    int deleteByPrimaryKey(Long deviceId);

    int insert(TbDevice record);

    int insertSelective(TbDevice record);

    List<TbDevice> selectByExample(TbDeviceExample example);

    TbDevice selectByPrimaryKey(Long deviceId);

    int updateByExampleSelective(@Param("record") TbDevice record, @Param("example") TbDeviceExample example);

    int updateByExample(@Param("record") TbDevice record, @Param("example") TbDeviceExample example);

    int updateByPrimaryKeySelective(TbDevice record);

    int updateByPrimaryKey(TbDevice record);

	List<Map<String, Object>> selectAll();
}