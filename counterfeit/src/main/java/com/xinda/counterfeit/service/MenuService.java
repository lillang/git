package com.xinda.counterfeit.service;

import java.util.List;

import com.xinda.counterfeit.pojo.TbMenu;


public interface MenuService {

	List<TbMenu> selectByRole(Integer userRoleid, Long parentId);

}
