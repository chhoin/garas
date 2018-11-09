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
import com.smart.garas.dto.ReturntoHengpheaDto;
import com.smart.garas.service.ReturntoHengpheaService;

@Controller
public class ReturntoHengpheaController {
	@Autowired
	private ReturntoHengpheaService returntoHengpheaService;
	
	// Show return page
	@RequestMapping("/returntohengphea")
	public String getReturnHengpheaPage(){
		return "returntohengphea";
	}
	
	// generated auto invoice sale 
	@RequestMapping(value="/api/returntohengpheaautonumber", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturntoHengpheaDto> getGenerateAutoInvoiceReturns(){
		return returntoHengpheaService.getGenerateAutoInvoiceReturn();
	}
	
	// Get data combo of invoice
	@RequestMapping(value="/api/returntohengpheacomboinvoice", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturntoHengpheaDto> getComboReturns(){
		return returntoHengpheaService.getComboReturn();
	}
	
	// Get data combo of information by invoice code
	@RequestMapping(value="/api/returntohengpheacomboinfo/{invoiceNo},{cateCode},{prodCode},{unitCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturntoHengpheaDto> getComboInfoByCodes(
			@PathVariable String invoiceNo, 
			@PathVariable String cateCode, 
			@PathVariable String prodCode,
			@PathVariable String unitCode)
	{
		return returntoHengpheaService.getComboInfoByCode(invoiceNo, cateCode, prodCode, unitCode);
	}
	
	// Get data combo of category
	@RequestMapping(value="/api/returntohengpheacombocategory/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturntoHengpheaDto> getComboCategorys(@PathVariable String invoiceNo){
		return returntoHengpheaService.getComboCategory(invoiceNo);
	}
	
	// Get combo of product 
	@RequestMapping(value="/api/returntohengpheacomboproduct/{invoiceNo},{cateCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturntoHengpheaDto> getComboProducts(@PathVariable String invoiceNo, @PathVariable String cateCode){
		return returntoHengpheaService.getComboProduct(invoiceNo,cateCode);
	}
	
	// Get data combo of unit
	@RequestMapping(value="/api/returntohengpheacombounit/{invoiceNo},{cateCode},{prodCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturntoHengpheaDto> getComboUnits(@PathVariable String invoiceNo, @PathVariable String cateCode, @PathVariable String prodCode){
		return returntoHengpheaService.getComboUnit(invoiceNo,cateCode,prodCode);
	}
	
	// Get data combo of currency
	//List<CurrencyDto> getComboCurrency();
	@RequestMapping(value="/api/returntohengpheacombocurrency", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getComboCurrencys(){
		return returntoHengpheaService.getComboCurrency();
	}
	
	// save data into data base
	@RequestMapping(value="/api/returntohengpheasave", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody ReturntoHengpheaDto returntoHengpheaDto){
		return returntoHengpheaService.save(returntoHengpheaDto);
	}
	
}
