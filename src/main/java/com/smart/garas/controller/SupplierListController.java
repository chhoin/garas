package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.SupplierListDto;
import com.smart.garas.service.SupplierListService;

@Controller
public class SupplierListController {
	@Autowired
	private SupplierListService supplierListService;
	
	// Show supplier list page
	@RequestMapping("supplierlist")
	public String getSupplierListPage(){
		return "supplierlist";
	}
	
	// search data
	@RequestMapping(value="/api/supplierlists/{suppCode},{phone},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierListDto> getSearchSuppliers(
				@PathVariable String suppCode,
				@PathVariable String phone,
				@PathVariable int currentPage,
				@PathVariable int numPerPage
			)
	{
		return supplierListService.getSearchSupplier(suppCode, phone, currentPage, numPerPage);
	}
	
	// delete data
	@RequestMapping(value="/api/supplierlistsdelete/{suppCode}", method = RequestMethod.DELETE)
	@ResponseBody
	public Integer deleteSupplier(@PathVariable String suppCode){
		return supplierListService.deleteById(suppCode);
	}
	
	// get data to combo box
	@RequestMapping(value="/api/supplierlistscomboname", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierListDto> getDataComboNames(){
		return supplierListService.getSupplierComboName();
	}
	
	// get data to combo box
	@RequestMapping(value="/api/supplierlistscombophone", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierListDto> getDataComboPhones(){
		return supplierListService.getSupplierComboPhone();
	}

}
