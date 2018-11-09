package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.service.CustomerInvoiceService;

@Controller
public class CustomerInvoiceController {
	@Autowired CustomerInvoiceService customerInvoiceService;
	
	@RequestMapping("/customerinvoice")
	public String getCustomerInvocePage(){
		return "customerinvoice";
	}
	
	// save data into database
	@RequestMapping(value="/api/customerinvoices", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody CustomerInvoiceDto customerInvoiceDto){
		return customerInvoiceService.save(customerInvoiceDto);
	}
	
	// get data all
	@RequestMapping(value="/api/customerinvoices", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerInvoiceDto> getData(){
		return customerInvoiceService.getAll();
	}
	
	// get data to combo box of Customer Invoice
	@RequestMapping(value="/api/combocusinvoice", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerCaptureDto> getDataCombox(){
		return customerInvoiceService.getComboCusInvoice();
	}
	
	// get combo of name and phone
	@RequestMapping(value="/api/combocusname/{invoice_NUM}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerCaptureDto> getDataToComboCusName(@PathVariable String invoice_NUM){
		return customerInvoiceService.getComboCusName(invoice_NUM);
	}
}
