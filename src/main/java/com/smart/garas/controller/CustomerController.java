package com.smart.garas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	// Show customer page
	@RequestMapping("/customer")
	public String getCustomerPage(){
		return "customer";
	}
	
	// Save data into database
	@RequestMapping(value="/api/customers", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody CustomerDto customerDto){
		return customerService.save(customerDto);
	}

}