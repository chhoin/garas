package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChangepwdController {
	@RequestMapping("/changepwd")
	public String getPageChangepwd(){
		return "changepwd";
	}

}
