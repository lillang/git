package com.xinda.counterfeit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinda.counterfeit.pojo.TbDevice;
import com.xinda.counterfeit.service.DeviceService;
import com.xinda.counterfeit.utils.BaseResult;
import com.xinda.counterfeit.utils.EUDataGridResult;

import net.sf.json.JSONArray;
/**
 * 
 * @title: DeviceController
 * @Description:设备信息控制类
 * @author: lilanglang
 * @date:   2018年8月31日
 */
@Controller
@RequestMapping("/device")
public class DeviceController {
	@Autowired
	private DeviceService deviceService;

	@RequestMapping(value = "/getDeviceList")
	@ResponseBody
	public EUDataGridResult getDeviceList(Integer page, Integer rows, TbDevice device) { 
		return deviceService.getDeviceList(page,rows,device);
	}
	@RequestMapping("/getDevice")
	@ResponseBody
	public String getDevice(){
		List<Map<String, Object>> list=deviceService.selectAll();
		JSONArray result=JSONArray.fromObject(list);
		String r=result.toString();
		return result.toString();
	}
}
