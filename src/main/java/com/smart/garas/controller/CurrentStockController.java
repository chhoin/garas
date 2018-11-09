package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CurrentStockController {
	@RequestMapping("currentstock")
	public String getCurrentStockPage(){
		return "currentstock";
	}

}
