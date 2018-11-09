package com.smart.garas.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface LogInService extends UserDetailsService {
	
	String passwordEncoder(String rawPassword);
}
