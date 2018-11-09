package com.smart.garas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.ExpenseDto;
import com.smart.garas.service.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	private ExpenseService expenseService;
	
	// Shoe expense page
	@RequestMapping("/expense")
	public String getExpensePage(){
		return "expense";
	}
	
	// Save data to database
	@RequestMapping(value="/api/expenses", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody ExpenseDto expenseDto){
		return expenseService.save(expenseDto);
	}

}
