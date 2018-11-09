package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.UserListDto;

@Repository
public interface UserListDao {
	// Get data combo of userName
	List<UserListDto> getComboUserName();
	
	// Search data by userCode
	List<UserListDto> getSearchUserByName(@Param("userCode") String userCode);

	// Delete data by  userName
	Integer deleteById(@Param("userCode") String userCode);
	
	// Update data by userCode
	Integer editById(UserListDto userListDto);
}
