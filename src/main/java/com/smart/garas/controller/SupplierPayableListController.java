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
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceListDto;
import com.smart.garas.dto.SupplierPayableDto;
import com.smart.garas.service.SupplierPayableListService;

@Controller
public class SupplierPayableListController {
	@Autowired
	private SupplierPayableListService supplierPayableListService;
	
	@RequestMapping("/supplierpayablelist")
	public String getSupplierPayableListPage(){
		return "supplierpayablelist";
	}
	
	// save data into database
	@RequestMapping(value="/api/supplierpayablelists", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody SupplierPayableDto supplierPayableDto){
		return supplierPayableListService.save(supplierPayableDto);
	}
	
	// get data from database
	@RequestMapping(value="/api/supplierpayablelists", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierPayableDto> getListAll(){
		return supplierPayableListService.getAll();
	}
	
	// Search
	@RequestMapping(value="/api/searchsuppaylists/{p_From_Date},{p_Date_To},{p_invoice_NO},{p_Sup_Name}", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierPayableDto> getSearchSupPayLists(
			@PathVariable("p_From_Date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_From_Date,
			@PathVariable("p_Date_To") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_Date_To,
			@PathVariable String p_invoice_NO,
			@PathVariable String p_Sup_Name)
	{
		return supplierPayableListService.getSearchSupPayList(p_From_Date, p_Date_To, p_invoice_NO, p_Sup_Name);
	}
	
	// get combo box of invoice number
	@RequestMapping(value="/api/getcomboinvsuppaylists", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierInvoiceListDto> getComboInvSupPayLists(){
		return supplierPayableListService.getComboInvSupPayList();
	}
	
	// get combo box of supplier name
	@RequestMapping(value="/api/getcombonamesuppaylists", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboNameSupPayLists(){
		return supplierPayableListService.getComboNameSupPayList();
	}
	
}
