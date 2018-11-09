package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.ReturntoHengpheaDto;

public interface ReturntoHengpheaService {
	
	// generated auto invoice sale 
	List<ReturntoHengpheaDto> getGenerateAutoInvoiceReturn();
	
	// Get data combo of invoice
	List<ReturntoHengpheaDto> getComboReturn();
	
	// Get data combo of information by invoice code  
	List<ReturntoHengpheaDto> getComboInfoByCode(
			String invoiceNo,
			String cateCode,
			String prodCode,
			String unitCode
	);
	
	// Get data combo of category 
	List<ReturntoHengpheaDto> getComboCategory(String invoiceNo);
	
	// Get combo of product 
	List<ReturntoHengpheaDto> getComboProduct(String invoiceNo, String cateCode);
	
	// Get data combo of unit
	List<ReturntoHengpheaDto> getComboUnit(String invoiceNo, String cateCode, String prodCode);
	
	// Get data combo of currency
	List<CurrencyDto> getComboCurrency();
	
	// save data into data base
	Integer save(ReturntoHengpheaDto returntoHengpheaDto);

}
