package com.smart.garas.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.SmartDto;
import com.smart.garas.service.SmartService;

@Controller
public class SmartController {
	@Autowired
	private SmartService smartService;
	
	@RequestMapping("/smart")
	public String getSmartPage(){
		return "smart";
	}
	
	// Save data into database
	@RequestMapping(value="/api/smarts", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody SmartDto smart){
		return smartService.save(smart);
	}
	
	// List data from database 
	@RequestMapping(value="/api/smarts", method = RequestMethod.GET)
	@ResponseBody
	public List<SmartDto> getAllData(){
		return smartService.getAll();
	}
	
	// Search 
	@RequestMapping(value="/api/smartlists/{fromDate},{toDate},{code}", method = RequestMethod.GET)
	@ResponseBody
	public List<SmartDto> getListByCode(
			@PathVariable("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable String code)
	{
		return smartService.getListByCode(fromDate, toDate, code);
	}
	
	// Deleted data 
	@RequestMapping(value="/api/smarts/{code}", method = RequestMethod.DELETE)
	@ResponseBody
	public Integer delete(@PathVariable String code){
		return smartService.deleteById(code);
	}
	
	// Check duplicated data 
	@RequestMapping(value="/api/smarts/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkSmart(@RequestParam String id){
		return smartService.countById(id) !=0;
	}
	
	// Edit data from database 
	@RequestMapping(value="/api/smarts/{code}", method = RequestMethod.PUT)
	@ResponseBody
	public Integer editSmart(@RequestBody SmartDto smart, @PathVariable String code){
		smart.setCode(code);
		return smartService.editById(smart);
	}
	
}
