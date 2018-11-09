package com.smart.garas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.IncomeDto;
import com.smart.garas.service.IncomeService;

@Controller
public class IncomeController {
	@Autowired
	private IncomeService incomeService;
	
	// Show Income Page
	@RequestMapping("/income")
	public String getInComePage(){
		return "income";
	}
	
	//  Save data to database
	@RequestMapping(value="/api/incomes", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody IncomeDto incomeDto){
		return incomeService.save(incomeDto);
	}
	
}
