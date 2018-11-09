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
import com.smart.garas.dto.CustomerCaptureListDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.service.CustomerCaptureListService;

@Controller
public class CustomerCaptureListController {
	@Autowired
	private CustomerCaptureListService customerCaptureListService;
	
	// Show customer ccapture list page
	@RequestMapping("/customercapturelist")
	public String getCustomerCaptureListPage(){
		return "customercapturelist";
	}
	
	// get combo លេខវិក័យបត្រ
	@RequestMapping(value="/api/customercapturelistinvoiceexp", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerCaptureListDto> getComboInvoiceExps(){
		return customerCaptureListService.getComboInvoiceExp();
	}
	
	// get combo ឈ្មោះអតិថិជន
	@RequestMapping(value="/api/customercapturelistcustomername", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerDto> getComboCustomerNames(){
		return customerCaptureListService.getComboCustomerName();
	}
	
	// get combo លេខទូរស័ព្ទ
	@RequestMapping(value="/api/customercapturelistcustomerphone", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerDto> getComboCustomerPhones(){
		return customerCaptureListService.getComboCustomerPhone();
	}
	
	// Search sale producct detail
	@RequestMapping(value="/api/customercapturelistsearch/{fromDate},{toDate},{exptCode},{custCode},{phone},{cateCode},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerCaptureListDto> getSearchSaleProducts(
			@PathVariable("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable String exptCode,
			@PathVariable String custCode,
			@PathVariable String phone,
			@PathVariable String cateCode,
			@PathVariable int currentPage,
			@PathVariable int numPerPage)
	{
		return customerCaptureListService.getSearchSaleProduct(fromDate, toDate, exptCode, custCode, phone, cateCode, currentPage, numPerPage);
	}
	
	// Print invoice
	/*@RequestMapping(value="/api/customerstockcapturelistinvoice/{slptCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerStockCaptureListDto> getPrintInvoices(@PathVariable String slptCode)
	{
		return customerStockCaptureListService.getPrintInvoice(slptCode);
	}*/

}
