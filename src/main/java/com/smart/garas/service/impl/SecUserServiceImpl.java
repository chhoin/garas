package com.smart.garas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.garas.dao.SecUserDao;
import com.smart.garas.dto.SecUserDto;
import com.smart.garas.service.SecUserService;

@Service("studentService")
public class SecUserServiceImpl implements SecUserService {
	  @Autowired
	  private SecUserDao studentMapper;
	  

	  
	  
	@Override
	public void insertStudent(SecUserDto secUserDto) {
		studentMapper.insertStudent(secUserDto);
		
	}

	@Override
	public boolean getStudentByLogin(String userName, String password) {
		SecUserDto student = studentMapper.getStudentByUserName(userName);
	      if(student != null && student.getSec_usr_password().equals(password)) {
	          return true;
	      }
	      return false;
	}

	@Override
	public boolean getStudentByUserName(String userName) {
		SecUserDto student = studentMapper.getStudentByUserName(userName);
	            if(student != null) {
	                return true;
	            }
	            return false;

	}

	@Override
	public List<SecUserDto> getAll() {
		return studentMapper.getAll();
	}


}
