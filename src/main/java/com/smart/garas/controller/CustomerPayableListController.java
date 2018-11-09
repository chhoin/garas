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
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableListDto;
import com.smart.garas.service.CustomerPayableListService;

@Controller
public class CustomerPayableListController {
	@Autowired
	private CustomerPayableListService customerPayableListService;

	// get Customer Payable List Page View
	@RequestMapping("/customerpayablelist")
	public String getCustomerPayablePage(){
		return "customerpayablelist";
	}
	
	// get data all from database
	@RequestMapping(value="/api/customerpayablelists", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerPayableListDto> getAlls(){
		return customerPayableListService.getAll();
	}
	
	
	// get combo box customer_invoice invoice number
	@RequestMapping(value="/api/getcombocustomerinvoices", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerInvoiceDto> getComboCustomerInvoices(){
		return customerPayableListService.getComboCustomerInvoice();
	}
	
	// get combo box customer name and phone 
	@RequestMapping(value="/api/getcustomernamephone", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerDto> getCustomerNamePhones(){
		return customerPayableListService.getCustomerNamePhone();
	}
	
	// Search
	@RequestMapping(value="/api/getsearchcuspaylists/{p_F_DATE},{p_T_DATE},{p_INVOICE_NO},{p_CUS_NAME},{p_CUS_PHONE}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerPayableListDto> getSearchCusPayLists(
			@PathVariable("p_F_DATE") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_F_DATE,
			@PathVariable("p_T_DATE") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_T_DATE,
			@PathVariable String p_INVOICE_NO,
			@PathVariable String p_CUS_NAME,
			@PathVariable String p_CUS_PHONE)
	{
		return customerPayableListService.getSearchCusPayList(p_F_DATE, p_T_DATE, p_INVOICE_NO, p_CUS_NAME, p_CUS_PHONE);
	}

}
