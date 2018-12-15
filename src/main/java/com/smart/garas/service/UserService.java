package com.smart.garas.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.smart.garas.dto.Pagination;
import com.smart.garas.dto.SubMenuDto;
import com.smart.garas.dto.UserDataDto;
import com.smart.garas.dto.UserDto;


public interface UserService {
	// Save data into database 
	Integer save(UserDto userDto);
	
	// Check duplicated data
	Integer countById(String userName);
	
	public UserDto login(String userName);
	
	public Long countSearch(String keyword);
	
	public ArrayList<UserDto> list(Pagination page);
	
	public Integer lastUserCode();
	
	public boolean store(UserDataDto user);
	
	public boolean storeUserRole(@Param("userCode") String userCode);
	
	public boolean storeUserAssMenu( @Param("menuId") String menuId, @Param("userCode") String userCode);
	
	public boolean updateUserAssMenu(@Param("id") String[] id, @Param("userCode") String userCode);
	
	public boolean update(UserDto user);
	
	public boolean delete(@Param("id") String id);
	
	public UserDto detail(@Param("id") String id);
	
	public ArrayList<SubMenuDto> listSubMenu();
}
