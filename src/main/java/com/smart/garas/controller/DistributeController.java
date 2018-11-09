package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DistributeController {
	@RequestMapping("/distribute")
	public String getDistributePage(){
		return "distribute";
	}

}
