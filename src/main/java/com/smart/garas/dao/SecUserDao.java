package com.smart.garas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.smart.garas.dto.SecUserDto;

@Repository
public interface SecUserDao {
	
	  public void insertStudent(SecUserDto student);
	  public SecUserDto getStudentByUserName(@Param("sec_usr_login") String userName);
	  public List<SecUserDto> getAll();
}
