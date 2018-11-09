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
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceListDto;
import com.smart.garas.service.SupplierInvoiceListService;

@Controller
public class SupplierInvoiceListController {
	@Autowired
	private SupplierInvoiceListService supplierInvoiceListService;
	
	// show page
	@RequestMapping("/supplierinvoicelist")
	public String getSupplierInvoiceListPage(){
		return "supplierinvoicelist";
	}
	
	// get combo of លេខវិក័យបត្រ
	@RequestMapping(value="/api/supplierinvoicelistinvoiceno", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureDto> getComboInvoiceNos(){
		return supplierInvoiceListService.getComboInvoiceNo();
	}
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	@RequestMapping(value="/api/supplierinvoicelistsuppliercode", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboSupplierCodes(){
		return supplierInvoiceListService.getComboSupplierCode();
	}
	
	// get combo of លេខទូរស័ព្ទ
	@RequestMapping(value="/api/supplierinvoicelistphone", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboSupplierPhones(){
		return supplierInvoiceListService.getComboSupplierPhone();
	}
	
	// Search data from database
	@RequestMapping(value="/api/supplierinvoicelistsearch/{fromDate},{toDate},{statusAmt},{invoiceNo},{suppCode},{phone},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierInvoiceListDto> getSearchCapLists(
			@PathVariable("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable String statusAmt,
			@PathVariable String invoiceNo,
			@PathVariable String suppCode,
			@PathVariable String phone,
			@PathVariable int currentPage,
			@PathVariable int numPerPage
	)
	{
		return supplierInvoiceListService.getSearchCapList(fromDate, toDate, statusAmt, invoiceNo, suppCode, phone, currentPage, numPerPage);
	}
	
	// Search Products List
	@RequestMapping(value="/api/supplierinvoicelistproductlist/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierInvoiceListDto> getSearchSupplierProductLists(@PathVariable String invoiceNo)
	{
		return supplierInvoiceListService.getSearchSupplierProductList(invoiceNo);
	}
	
	// Search history payments
	@RequestMapping(value="/api/supplierinvoicelisthistorypay/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<PaymentListDto> getSearchHisPayments(@PathVariable String invoiceNo)
	{
		return supplierInvoiceListService.getSearchHisPayment(invoiceNo);
	}
	
	// Save Payment
	@RequestMapping(value="/api/supplierinvoicelists", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody PaymentDto paymentDto){
		return supplierInvoiceListService.save(paymentDto);
	}

}
