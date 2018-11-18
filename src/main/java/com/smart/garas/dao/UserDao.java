package com.smart.garas.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.smart.garas.dto.UserDto;

@Repository
public interface UserDao {
	// Save data into database 
	Integer save(UserDto userDto);
	
	// Check duplicated data
	Integer countById(@Param("userName") String userName);
	
	public UserDto login(@Param("userName") String userName);

}
