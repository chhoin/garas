package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.UserListDao;
import com.smart.garas.dto.UserListDto;
import com.smart.garas.service.UserListService;

@Service
@Transactional(rollbackFor=Exception.class)
public class UserListServiceImpl implements UserListService {
	@Autowired
	private UserListDao userListDao;

	@Override
	public List<UserListDto> getComboUserName() {
		return userListDao.getComboUserName();
	}

	@Override
	public List<UserListDto> getSearchUserByName(String userCode) {
		return userListDao.getSearchUserByName(userCode);
	}

	@Override
	public Integer deleteById(String userCode) {
		return userListDao.deleteById(userCode);
	}

	@Override
	public Integer editById(UserListDto userListDto) {
		return userListDao.editById(userListDto);
	}
	
}
