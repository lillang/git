package com.xinda.counterfeit.service;

import java.util.List;
import java.util.Map;

import com.xinda.counterfeit.pojo.TbDevice;
import com.xinda.counterfeit.utils.EUDataGridResult;

/**
 * 
 * @title: DeviceService
 * @Description: 鉴定设备接口
 * @author: lilanglang
 * @date:   2018年8月31日
 */
public interface DeviceService {

	EUDataGridResult getDeviceList(Integer page, Integer rows, TbDevice device);
	TbDevice selectByPrimaryKey(Long device);
	List<Map<String, Object>> selectAll();
}
