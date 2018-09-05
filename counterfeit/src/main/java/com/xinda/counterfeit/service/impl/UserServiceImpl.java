package com.xinda.counterfeit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinda.counterfeit.mapper.TbUserMapper;
import com.xinda.counterfeit.pojo.TbUser;
import com.xinda.counterfeit.pojo.TbUserExample;
import com.xinda.counterfeit.pojo.TbUserExample.Criteria;
import com.xinda.counterfeit.service.UserService;
import com.xinda.counterfeit.utils.EUDataGridResult;

/**
 * 
 * @ClassName UserServiceImpl
 * @Description TODO(用户信息处理service)
 * @author Qin
 * @Date 2018-7-31上午10:50:24
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private TbUserMapper tbUserMapper;

	public TbUser selectUser(TbUser user) {
		TbUserExample example=new TbUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserAccountEqualTo(user.getUserAccount());
		List<TbUser> list = tbUserMapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}
		return list.get(0);
	}

	public int updateByPrimaryKey(TbUser tbUser) {
		return tbUserMapper.updateByPrimaryKeySelective(tbUser);
	}

	public EUDataGridResult getUserList(Integer page, Integer rows) {
		TbUserExample example=new TbUserExample();
		PageHelper.startPage(page, rows);
		List<TbUser> list = tbUserMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<TbUser> pageInfo = new PageInfo<TbUser>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public int insert(TbUser record) {
		try {
			return tbUserMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
		
	}
	
	public int selectByAccount(String userAccount) {
		
		return tbUserMapper.selectByAccount(userAccount);
	}

	public int deleteMany(int[] array) {
		return tbUserMapper.deleteMany(array);
	}

	public TbUser selectByPrimaryKey(Long id) {
		
		return tbUserMapper.selectByPrimaryKey(id);
	}


}
