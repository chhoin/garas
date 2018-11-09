package com.smart.garas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.service.SupplierService;

@Controller
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	// Show supplier page
	@RequestMapping("/supplier")
	public String getSupplierPage(){
		return "supplier";
	}
	
	// Save data to database 
	@RequestMapping(value="/api/suppliers", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody SupplierDto supplierDto){
		return supplierService.save(supplierDto);
	}
}
