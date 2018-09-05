package com.xinda.counterfeit.service.impl;

import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.javafx.collections.MappingChange.Map;
import com.xinda.counterfeit.mapper.TbCounterfeitMapper;
import com.xinda.counterfeit.pojo.TbCounterfeit;
import com.xinda.counterfeit.pojo.TbCounterfeitExample;
import com.xinda.counterfeit.pojo.TbCounterfeitExample.Criteria;
import com.xinda.counterfeit.service.CounterfeitService;
import com.xinda.counterfeit.utils.EUDataGridResult;

/**
 * 
 * @ClassName CounterfeitServiceImpl
 * @Description TODO(假币信息处理Service)
 * @author Qin
 * @Date 2018-8-1下午2:30:30
 */
@Service
public class CounterfeitServiceImpl implements CounterfeitService {
	@Autowired
	private TbCounterfeitMapper tbCounterfeitMapper;

	public EUDataGridResult getCounterfeitList(Integer page, Integer rows, TbCounterfeit counterfeit, String counterfeitCreateBegindate, String counterfeitCreateEnddate) {
		TbCounterfeitExample example=new TbCounterfeitExample();
		Criteria criteria=example.createCriteria();
		example.setOrderByClause("counterfeit_createdate desc");
		if(counterfeit!=null&&!StringUtils.isEmpty(counterfeit.getCounterfeitSerialnum())){
			criteria.andCounterfeitSerialnumLike("%"+counterfeit.getCounterfeitSerialnum()+"%");
		}
		criteria.andCounterfeitRecycleEqualTo(counterfeit.getCounterfeitRecycle());
		if(counterfeitCreateBegindate!=""&&!StringUtils.isEmpty(counterfeitCreateBegindate)){
			criteria.andCounterfeitCreatedateGreaterThanOrEqualTo(Long.parseLong(counterfeitCreateBegindate)/1000-28800);
		}
		if(counterfeitCreateEnddate!=""&&!StringUtils.isEmpty(counterfeitCreateEnddate)){
			criteria.andCounterfeitCreatedateLessThanOrEqualTo(Long.parseLong(counterfeitCreateEnddate)/1000-28800);
		}
		PageHelper.startPage(page, rows);
		List<TbCounterfeit> list = tbCounterfeitMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<TbCounterfeit> pageInfo = new PageInfo<TbCounterfeit>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	public EUDataGridResult getCounterfeitListByArea(Integer page, Integer rows, TbCounterfeit counterfeit, String counterfeitCreateBegindate, String counterfeitCreateEnddate,String areaName) {
		try {
			/*TbCounterfeitExample example=new TbCounterfeitExample();
			Criteria criteria=example.createCriteria();
			example.setOrderByClause("counterfeit_createdate desc");
			if(!StringUtils.isEmpty(counterfeit.getCounterfeitSerialnum())){
				criteria.andCounterfeitSerialnumLike("%"+counterfeit.getCounterfeitSerialnum()+"%");
			}
			if(!StringUtils.isEmpty(counterfeitCreateBegindate)){
				criteria.andCounterfeitCreatedateGreaterThanOrEqualTo(Long.parseLong(counterfeitCreateBegindate)/1000-28800);
			}
			if(!StringUtils.isEmpty(counterfeitCreateEnddate)){
				criteria.andCounterfeitCreatedateLessThanOrEqualTo(Long.parseLong(counterfeitCreateEnddate)/1000-28800);
			}

			if(!StringUtils.isEmpty(area)){
				criteria.andDeviceAddressLike("%"+area+"%");
			}*/
			PageHelper.startPage(page, rows);
			List<TbCounterfeit> list = tbCounterfeitMapper.selectByArea(areaName,page,rows);
			EUDataGridResult result = new EUDataGridResult();
			result.setRows(list);
			PageInfo<TbCounterfeit> pageInfo = new PageInfo<TbCounterfeit>(list);
			result.setTotal(pageInfo.getTotal());
			return result;
		} catch (Exception e) {
			
		}
		return null;
	}
	public void updateCounterfeit(TbCounterfeit counterfeit) {
		tbCounterfeitMapper.updateByPrimaryKeySelective(counterfeit);
	}

	public void delCounterfeit(TbCounterfeit counterfeit) {
		tbCounterfeitMapper.deleteByPrimaryKey(counterfeit.getCounterfeitId());
	}

	public List<TbCounterfeit> getList(Map<String, Object> map) {
		
		return null;
	}
	public List<TbCounterfeit> selectCountfeitAnalyze(java.util.Map<String, Object> map) {
		return tbCounterfeitMapper.selectCountfeitAnalyze(map);
	}
	//新增
	public int insert(TbCounterfeit counterfeit) {
		return tbCounterfeitMapper.insert(counterfeit);
	}

	

}
