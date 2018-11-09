package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.service.SupplierInvoiceService;

@Controller
public class SupplierInvoiceController {
	@Autowired
	private SupplierInvoiceService supplierInvoiceService;
	
	// get Supplier Invoice Page
	@RequestMapping("/supplierinvoice")
	public String getPageSupplierInvoce(){
		return "supplierinvoice";
	}
	
	// save data into database
	@RequestMapping(value="/api/supplierinvoices", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody SupplierInvoiceDto supplierInvoice){
		return supplierInvoiceService.save(supplierInvoice);
	}
	
	// get data list from database 
	@RequestMapping(value="/api/supplierinvoices", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierInvoiceDto> getListAll(){
		return supplierInvoiceService.getAll();
	}
	
	// get combo of invoice number
	@RequestMapping(value="/api/comboinvoiceno", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureDto> getComboInvoiceNo(){
		return supplierInvoiceService.getComboInvoiceNo();
	}
	
	// get combo of item name, phone and ccy
	@RequestMapping(value="/api/combosupname/{invoice_NO}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureDto> getDataToComboItem(@PathVariable String invoice_NO){
		return supplierInvoiceService.getComboName(invoice_NO);
	}

}
