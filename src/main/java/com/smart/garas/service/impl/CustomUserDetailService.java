package com.smart.garas.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.smart.garas.dto.UserDto;
import com.smart.garas.service.UserService;


@Service("CustomUserDetailService")
public class CustomUserDetailService implements UserDetailsService{
	
	private static Logger logger = Logger.getLogger( CustomUserDetailService.class );

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDto user = userService.login(username);
		if(user == null){
			System.out.println(username+ " fail =======>not found");
			logger.error(username+ " fail =======>not found");
			throw new UsernameNotFoundException("User not found");
		}
		System.out.println("login =====>" +user.getUsername());
		logger.debug("login =====>" +user.getUsername());
		
		return user;
	}

}
