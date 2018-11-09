package com.smart.garas.service;

import java.util.List;

import com.smart.garas.dto.SecUserDto;

public interface SecUserService {
	  void insertStudent(SecUserDto secUserDto);
	  boolean getStudentByLogin(String userName, String password);
	  boolean getStudentByUserName(String userName);
	  List<SecUserDto> getAll();
}
