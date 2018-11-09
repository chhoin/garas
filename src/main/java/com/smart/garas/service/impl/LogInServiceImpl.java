package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.smart.garas.dao.LogInDao;
import com.smart.garas.dto.LogInDto;
import com.smart.garas.service.LogInService;
import com.smart.garas.spring.UserContext;

@Service("loginService")
public class LogInServiceImpl implements LogInService {
	@Autowired
	private LogInDao logInDao;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LogInDto loginDto = logInDao.getByUsername(username);
		
		if (loginDto == null) {
            throw new UsernameNotFoundException("The user " + username + "] can not be found.");
        }
		return new UserContext(loginDto);
	}

	public String passwordEncoder(String rawPassword) {
		return passwordEncoder.encode(rawPassword);
	}

}
