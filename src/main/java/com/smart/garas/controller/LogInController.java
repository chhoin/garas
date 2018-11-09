package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {
	
	// show page
	@RequestMapping("/login")
	public String getLogInPage(){
		return "login";
	}

}
