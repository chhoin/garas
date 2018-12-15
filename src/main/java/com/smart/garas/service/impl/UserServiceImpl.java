package com.smart.garas.service.impl;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smart.garas.dao.UserDao;
import com.smart.garas.dto.Pagination;
import com.smart.garas.dto.SubMenuDto;
import com.smart.garas.dto.UserDataDto;
import com.smart.garas.dto.UserDto;
import com.smart.garas.service.UserService;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public Integer save(UserDto userDto) {
		return userDao.save(userDto);
	}

	@Override
	public Integer countById(String userName) {
		return userDao.countById(userName);
	}

	@Override
	public UserDto login(String userName) {
		return userDao.login(userName);
	}

	@Override
	public Long countSearch(String keyword) {
		return userDao.countSearch(keyword);
	}

	@Override
	public ArrayList<UserDto> list(Pagination page) {
		return userDao.list(page);
	}

	@Override
	public boolean store(UserDataDto user) {
		return userDao.store(user);
	}

	@Override
	public boolean delete(String id) {
		return userDao.delete(id);
	}

	@Override
	public boolean update(UserDto user) {
		return userDao.update(user);
	}

	@Override
	public UserDto detail(String id) {
		return userDao.detail(id);
	}

	@Override
	public ArrayList<SubMenuDto> listSubMenu() {
		return userDao.listSubMenu();
	}

	@Override
	public Integer lastUserCode() {
		return userDao.lastUserCode();
	}

	@Override
	public boolean storeUserRole(String userCode) {
		return userDao.storeUserRole(userCode);
	}

	@Override
	public boolean storeUserAssMenu(String menuId, String userCode) {
		return userDao.storeUserAssMenu(menuId, userCode);
	}

	@Override
	public boolean updateUserAssMenu(String[] id,String userCode) {
		return userDao.updateUserAssMenu(id, userCode);
	}
}
