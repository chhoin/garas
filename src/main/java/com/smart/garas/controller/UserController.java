package com.smart.garas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.UserDto;
import com.smart.garas.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	// Show user page
	@RequestMapping("/user")
	public String getUserPage(){
		return "user";
	}
	
	// Check duplicate data
	@RequestMapping(value="/api/users/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkDuplicatData(@RequestParam String userName){
		return userService.countById(userName) != 0;
	}
	
	// Save data into database
	@RequestMapping(value="/api/users", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody UserDto userDto){
		return userService.save(userDto);
	}

}
