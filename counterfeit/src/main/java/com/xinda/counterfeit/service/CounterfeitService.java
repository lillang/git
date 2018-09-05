package com.xinda.counterfeit.service;

import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;
import com.xinda.counterfeit.pojo.TbCounterfeit;
import com.xinda.counterfeit.utils.EUDataGridResult;



public interface CounterfeitService {

	EUDataGridResult getCounterfeitList(Integer page, Integer rows, TbCounterfeit counterfeit, String counterfeitCreateBegindate, String counterfeitCreateEnddate);
	
	EUDataGridResult getCounterfeitListByArea(Integer page, Integer rows, TbCounterfeit counterfeit, String counterfeitCreateBegindate, String counterfeitCreateEnddate,String areaName);
	
	void updateCounterfeit(TbCounterfeit counterfeit);

	void delCounterfeit(TbCounterfeit counterfeit);
	
	List<TbCounterfeit> getList(Map<String, Object> map);
	//假币分析
    List<TbCounterfeit> selectCountfeitAnalyze(java.util.Map<String, Object> map);
    
    int insert(TbCounterfeit counterfeit);
}
