package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.UserListDto;

public interface UserListService {
	// Get data combo of userName
	List<UserListDto> getComboUserName();
	
	// Search data by userCode
	List<UserListDto> getSearchUserByName(String userCode);

	// Delete data by  userName
	Integer deleteById(String userCode);
	
	// Update data by userCode
	Integer editById(UserListDto userListDto);
}
