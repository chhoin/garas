package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockAlertController {
	@RequestMapping("/stockalert")
	public String getPageStockAlert(){
		return "stockalert";
	}

}
