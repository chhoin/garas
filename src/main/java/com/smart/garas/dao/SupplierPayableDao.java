package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.dto.SupplierPayableDto;

@Repository
public interface SupplierPayableDao {
	
	// save data into database
	Integer save(SupplierPayableDto supplierInvoice);
	
	// get list data from database 
	List<SupplierPayableDto> getAll();
	
	// get combo of invoice (invoice_NO)
	List<SupplierInvoiceDto> getComboSupplierInvoice();
	
	// get combo of total balance amount
	List<SupplierInvoiceDto> getComboTotalBalance(@Param("invoice_NO") String name);
	
	// get combo of currency
	List<CurrencyDto> getComboCurrency();
	
	
	
}
