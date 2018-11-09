package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.ReturntoHengpheaDto;

@Repository
public interface ReturntoHengpheaDao {
	// generated auto invoice sale 
	List<ReturntoHengpheaDto> getGenerateAutoInvoiceReturn();
	
	// Get data combo of invoice
	List<ReturntoHengpheaDto> getComboReturn();
	
	// Get data combo of information by invoice code  
	List<ReturntoHengpheaDto> getComboInfoByCode(
			@Param("invoiceNo") String invoiceNo,
			@Param("cateCode") String cateCode,
			@Param("prodCode") String prodCode,
			@Param("unitCode") String unitCode);
	
	// Get data combo of category 
	List<ReturntoHengpheaDto> getComboCategory(@Param("invoiceNo") String invoiceNo);
	
	// Get combo of product 
	List<ReturntoHengpheaDto> getComboProduct(@Param("invoiceNo") String invoiceNo, @Param("cateCode") String cateCode);
	
	// Get data combo of unit
	List<ReturntoHengpheaDto> getComboUnit(@Param("invoiceNo") String invoiceNo, @Param("cateCode") String cateCode, @Param("prodCode") String prodCode);
	
	// Get data combo of currency
	List<CurrencyDto> getComboCurrency();
	
	// save data into data base
	Integer save(ReturntoHengpheaDto returntoHengpheaDto);
	
}
