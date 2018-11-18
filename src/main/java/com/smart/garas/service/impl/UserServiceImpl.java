package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.UserDao;
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
}
