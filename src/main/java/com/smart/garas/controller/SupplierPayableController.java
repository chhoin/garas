package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.dto.SupplierPayableDto;
import com.smart.garas.service.SupplierPayableService;

@Controller
public class SupplierPayableController {
	// initialize values to Controller
	@Autowired
	private SupplierPayableService supplierPayableService;
	
	// get Supplier Payable Page
	@RequestMapping("/supplierpayable")
	public String getSupplierPayablePage(){
		return "supplierpayable";
	}
	
	// save data into database
	@RequestMapping(value="/api/supplierpayables", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody SupplierPayableDto supplierPayableDto){
		return supplierPayableService.save(supplierPayableDto);
	}
	
	// get data from database
	@RequestMapping(value="/api/supplierpayables", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierPayableDto> getListAll(){
		return supplierPayableService.getAll();
	}
	
	// get combo of invoice (SUPPLIER_INVOICE)
	@RequestMapping(value="/api/comboinvoice", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierInvoiceDto> getComboSupplierInvoice(){
		return supplierPayableService.getComboSupplierInvoice();
	}
	
	// get combo of total balance amount
	@RequestMapping(value="/api/comboamount/{invoice_NO}", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierInvoiceDto> getComboTotalAmount(@PathVariable String invoice_NO){
		return supplierPayableService.getComboTotalBalance(invoice_NO);
	}
	
	// get combo box of currency
	@RequestMapping(value="/api/combocurrency", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getComboCurrencyList(){
		return supplierPayableService.getComboCurrency();
	}

}
