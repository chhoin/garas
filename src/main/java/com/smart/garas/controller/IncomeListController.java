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
import com.smart.garas.dto.IncomeDto;
import com.smart.garas.dto.IncomeListDto;
import com.smart.garas.service.IncomeListService;

@Controller
public class IncomeListController {
	@Autowired
	private IncomeListService incomeListService;
	
	// Show income list page
	@RequestMapping("/incomelist")
	public String getIncomeListPage(){
		return "incomelist";
	}
	
	// get combo of income type
	@RequestMapping(value="/api/incomelistcomboincometype", method = RequestMethod.GET)
	@ResponseBody
	public List<IncomeDto> getComboIncomeTypes(){
		return incomeListService.getComboIncomeType();
	}
	
	// Search data of Income
	@RequestMapping(value="/api/incomelistsearch/{fromDate},{toDate},{incomeCode},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<IncomeListDto> getSearchIncomes(
			@PathVariable("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable String incomeCode,
			@PathVariable int currentPage,
			@PathVariable int numPerPage)
	{
		return incomeListService.getSearchIncome(fromDate, toDate, incomeCode, currentPage, numPerPage);
	}
	
}
