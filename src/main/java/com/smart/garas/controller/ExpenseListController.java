package com.smart.garas.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.ExpenseDto;
import com.smart.garas.dto.ExpenseListDto;
import com.smart.garas.service.ExpenseListService;

@Controller
public class ExpenseListController {
	@Autowired
	private ExpenseListService expenseListService;
	
	// Show expense list page
	@RequestMapping("/expenselist")
	public String getExpenseListPage(){
		return "expenselist";
	}
	
	// get combo of expense type
	@RequestMapping(value="/api/expenselistcomboexpensetype", method = RequestMethod.GET)
	@ResponseBody
	public List<ExpenseDto> getComboExpenseTypes(){
		return expenseListService.getComboExpenseType();
	}
	
	// Search data of expense
	@RequestMapping(value="/api/expenselistsearch/{fromDate},{toDate},{expCode},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<ExpenseListDto> getSearchExpenses(
			@PathVariable("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable String expCode,
			@PathVariable int currentPage,
			@PathVariable int numPerPage)
	{
		return expenseListService.getSearchExpense(fromDate, toDate, expCode, currentPage, numPerPage);
	}

}
