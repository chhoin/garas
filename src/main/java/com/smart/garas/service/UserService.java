package com.smart.garas.service;

import com.smart.garas.dto.UserDto;

public interface UserService {
	// Save data into database 
	Integer save(UserDto userDto);
	
	// Check duplicated data
	Integer countById(String userName);
}
