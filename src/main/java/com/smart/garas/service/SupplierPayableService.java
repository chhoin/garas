package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.dto.SupplierPayableDto;

public interface SupplierPayableService {
	
	// save data into database 
	Integer save(SupplierPayableDto supplierInvoice);
	
	// get data list from database
	List<SupplierPayableDto> getAll();
	
	// get combo of invoice (invoice_NO)
	List<SupplierInvoiceDto> getComboSupplierInvoice();
	
	// get combo of total balance amount
	List<SupplierInvoiceDto> getComboTotalBalance(String name);
	
	// get combo of currency
	List<CurrencyDto> getComboCurrency();
	
}
