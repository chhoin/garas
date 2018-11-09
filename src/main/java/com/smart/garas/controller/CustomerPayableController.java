package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableDto;
import com.smart.garas.service.CustomerPayableService;

@Controller
public class CustomerPayableController {
	
	@Autowired
	private CustomerPayableService customerPayableService;
	
	// get page Customer Payable Page
	@RequestMapping("/customerpayable")
	public String getCustomerPayablePage(){
		return "customerpayable";
	}
	
	// save data into database
	@RequestMapping(value="/api/customerpayables", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody CustomerPayableDto customerPayableDto){
		return customerPayableService.save(customerPayableDto);
	}
	
	// get data all
	@RequestMapping(value="/api/customerpayables", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerPayableDto> getData(){
		return customerPayableService.getAll();
	}
	
	// get data to combo box of Customer Invoice
	@RequestMapping(value="/api/combocustomerinvoicepay", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerInvoiceDto> getDataCombox(){
		return customerPayableService.getComboCPayInvoice();
	}
	
	// get combo of name and phone
	@RequestMapping(value="/api/combocuspayname/{invoice_NUMBER}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerInvoiceDto> getComboCusPayName(@PathVariable String invoice_NUMBER){
		return customerPayableService.getComboCusPayInvoice(invoice_NUMBER);
	}
	
}
