package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerStockCaptureController {
	
	// show page 
	@RequestMapping("/customerstockcapture")
	public String getCustomerStockCapturePage(){
		return "customerstockcapture";
	}

}
