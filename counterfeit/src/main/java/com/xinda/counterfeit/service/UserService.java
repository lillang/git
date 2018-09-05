package com.xinda.counterfeit.service;

import org.apache.ibatis.annotations.Param;

import com.xinda.counterfeit.pojo.TbUser;
import com.xinda.counterfeit.utils.EUDataGridResult;

public interface UserService {

	TbUser selectUser(TbUser user);

	int updateByPrimaryKey(TbUser tbUser);

	EUDataGridResult getUserList(Integer page, Integer rows);
	
	int insert(TbUser record);
	int deleteMany(int[] array);
	int selectByAccount(String account);
	TbUser selectByPrimaryKey(Long id);
}
