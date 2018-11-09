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
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceListDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;
import com.smart.garas.service.CustomerInvoiceListService;

@Controller
public class CustomerInvoiceListController {
	@Autowired
	private CustomerInvoiceListService customerInvoiceListService;
	
	// Show customer invoice list
	@RequestMapping("/customerinvoicelist")
	public String getCustomerInvoiceListPage(){
		return "customerinvoicelist";
	}
	
	// get combo លេខវិក័យបត្រ
	@RequestMapping(value="/api/customerinvoicelistinvoiceexp", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerCaptureDto> getComboInvoiceExps(){
		return customerInvoiceListService.getComboInvoiceExp();
	}
	
	// get combo ឈ្មោះអតិថិជន
	@RequestMapping(value="/api/customerinvoicelistcustomername", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerDto> getComboCustomerNames(){
		return customerInvoiceListService.getComboCustomerName();
	}
	
	// get combo លេខទូរស័ព្ទ
	@RequestMapping(value="/api/customerinvoicelistcustomerphone", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerDto> getComboCustomerPhones(){
		return customerInvoiceListService.getComboCustomerPhone();
	}
	
	// Search Export data
	@RequestMapping(value="/api/customerinvoicelistsearch/{fromDate},{toDate},{statusAmt},{exptCode},{custCode},{phone},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerInvoiceListDto> getSearchCustomerInvoiceLists(
			@PathVariable("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable String statusAmt,
			@PathVariable String exptCode,
			@PathVariable String custCode,
			@PathVariable String phone,
			@PathVariable int currentPage,
			@PathVariable int numPerPage)
	{
		return customerInvoiceListService.getSearchCustomerInvoiceList(fromDate, toDate, statusAmt, exptCode, custCode, phone, currentPage, numPerPage);
	}
	
	// Search customer pay
	@RequestMapping(value="/api/customerinvoicelistsearchpayment/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<PaymentListDto> getSearchCustomerPayments(@PathVariable String invoiceNo)
	{
		return customerInvoiceListService.getSearchCustomerPayment(invoiceNo);
	}
	
	// List of customer buy products
	@RequestMapping(value="/api/customerinvoicelistbuyproducts/{exptCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerInvoiceListDto> getListOfCustomerBuyProducts(@PathVariable String exptCode)
	{
		return customerInvoiceListService.getListOfCustomerBuyProduct(exptCode);
	}
	
	// Save data to tblPayment
	@RequestMapping(value="/api/customerinvoicelistsavepayment", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody PaymentDto paymentDto){
		return customerInvoiceListService.save(paymentDto);
	}
	
}

