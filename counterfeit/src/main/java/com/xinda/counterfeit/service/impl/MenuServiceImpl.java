package com.xinda.counterfeit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinda.counterfeit.mapper.TbMenuMapper;
import com.xinda.counterfeit.pojo.TbMenu;
import com.xinda.counterfeit.service.MenuService;

/**
 * 
 * @ClassName MenuServiceImpl
 * @Description TODO(菜单信息处理Service)
 * @author Qin
 * @Date 2018-7-31下午2:48:03
 */
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private TbMenuMapper tbMenuMapper;

	public List<TbMenu> selectByRole(Integer userRoleid, Long parentId) {
		return this.tbMenuMapper.selectByRole(userRoleid, parentId);
	}

}
