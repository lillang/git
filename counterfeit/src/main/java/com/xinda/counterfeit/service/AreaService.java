package com.xinda.counterfeit.service;

import java.util.List;
import java.util.Map;

import com.xinda.counterfeit.pojo.Area;




/**
 * 
 * @title: AreaService
 * @Description: 地区接口
 * @author: lilanglang
 * @date:   2018年8月29日
 */
public interface AreaService{
	// 省市地区  
	//  查询
	List<Map<String, Object>> retrieveArea(Map<String, Object> param);
	Area selectName(Map<String, Object> map);

}
