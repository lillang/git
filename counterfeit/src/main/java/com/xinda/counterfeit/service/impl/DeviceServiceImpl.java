package com.xinda.counterfeit.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinda.counterfeit.mapper.TbDeviceMapper;
import com.xinda.counterfeit.pojo.TbDevice;
import com.xinda.counterfeit.pojo.TbDeviceExample;
import com.xinda.counterfeit.pojo.TbDeviceExample.Criteria;
import com.xinda.counterfeit.service.DeviceService;
import com.xinda.counterfeit.utils.EUDataGridResult;

/**
 * 
 * @ClassName DeviceServiceImpl
 * @Description TODO(设备信息处理Service)
 * @author Qin
 * @Date 2018-8-3上午9:37:00
 */
@Service
public class DeviceServiceImpl implements DeviceService{
	@Autowired
	private TbDeviceMapper tbDeviceMapper;

	public EUDataGridResult getDeviceList(Integer page, Integer rows,
			TbDevice device) {
		TbDeviceExample example=new TbDeviceExample();
		Criteria criteria=example.createCriteria();
		example.setOrderByClause("device_address asc");
		if(!StringUtils.isEmpty(device.getDeviceAccount())){
			criteria.andDeviceAccountLike("%"+device.getDeviceAccount()+"%");
		}
		if(!StringUtils.isEmpty(device.getDeviceBank())){
			criteria.andDeviceBankLike("%"+device.getDeviceBank()+"%");
		}
		if(!StringUtils.isEmpty(device.getDeviceDetailed())){
			criteria.andDeviceDetailedLike("%"+device.getDeviceDetailed()+"%");
		}
		PageHelper.startPage(page, rows);
		List<TbDevice> list = tbDeviceMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<TbDevice> pageInfo = new PageInfo<TbDevice>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public TbDevice selectByPrimaryKey(Long device) {
		
		return tbDeviceMapper.selectByPrimaryKey(device);
	}

	public List<Map<String, Object>> selectAll() {
		
		return tbDeviceMapper.selectAll();
	}

}
