package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DistributeListController {
	
	@RequestMapping("/distributelist")
	public String getDistributeListPage(){
		return "distributelist";
	}

}
