package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.dto.SupplierInvoiceListDto;
import com.smart.garas.dto.SupplierPayableDto;

public interface SupplierPayableListService {
	// save data into database 
	Integer save(SupplierPayableDto supplierInvoice);
	
	// get data list from database
	List<SupplierPayableDto> getAll();
	
	// get combo of invoice (invoice_NO)
	List<SupplierInvoiceDto> getComboSupplierInvoice();
	
	// Search
	List<SupplierPayableDto> getSearchSupPayList(Date fDate, Date tDate, String numInvoice, String nameSupp);
	
	// get combo of invoice number
	List<SupplierInvoiceListDto> getComboInvSupPayList();
		
	// get combo of supplier name
	List<SupplierDto> getComboNameSupPayList();
	
}
