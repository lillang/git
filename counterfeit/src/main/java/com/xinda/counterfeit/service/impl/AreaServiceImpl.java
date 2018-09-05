package com.xinda.counterfeit.service.impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinda.counterfeit.mapper.AreaMapper;
import com.xinda.counterfeit.pojo.Area;
import com.xinda.counterfeit.service.AreaService;

@Service
/**
 * 
 * @title: AreaServiceImpl
 * @Description: 地区接口实现类
 * @author: lilanglang
 * @date:   2018年8月29日
 */
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	private AreaMapper tareaMapper;
	

	//获得地区列表
	public List<Map<String, Object>> retrieveArea(Map<String, Object> param)
			 {
		// 省市地区 
			List<Map<String, Object>> branchList = tareaMapper.selectByParam(param) ;           //alternateGradeMapper.selectByParam(param);
			Map<String, Map<String, Object>> branchMap = new HashMap<String, Map<String, Object>>();
			List<Map<String, Object>> hierarchy = new ArrayList<Map<String, Object>>();
			if(param.get("type")==null){
				for (Map<String, Object> branch : branchList) {	
					String  parentid = branch.get("parentid").toString();
					if (branchMap.containsKey(parentid)) {
						List<Map<String, Object>> children = ((List<Map<String, Object>>)branchMap.get(parentid).get("children"));
						if (children == null) {
							children = new ArrayList<Map<String, Object>>();
							branchMap.get(parentid).put("children", children);
						}
						children.add(branch);
					} else {
						hierarchy.add(branch);
					}
					branchMap.put(branch.get("codeid").toString(), branch);
					
				}
			}else{
				for (Map<String, Object> branch : branchList) {	
					if(branch.get("codeid").toString().length()!=6){
						String  parentid = branch.get("parentid").toString();
						if (branchMap.containsKey(parentid)) {
							List<Map<String, Object>> children = ((List<Map<String, Object>>)branchMap.get(parentid).get("children"));
							if (children == null) {
								children = new ArrayList<Map<String, Object>>();
								branchMap.get(parentid).put("children", children);
							}
							children.add(branch);
						} else {
							hierarchy.add(branch);
						}
						branchMap.put(branch.get("codeid").toString(), branch);
					}
				}
			}
			return hierarchy;
		}


	public Area selectName(Map<String, Object> map) {
		return tareaMapper.selectName(map);
	}
	
}
