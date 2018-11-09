package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.dto.SupplierInvoiceListDto;
import com.smart.garas.dto.SupplierPayableDto;

@Repository
public interface SupplierPayableListDao {
	// save data into database
	Integer save(SupplierPayableDto supplierInvoice);
	
	// get list data from database 
	List<SupplierPayableDto> getAll();
	
	// get combo of invoice (invoice_NO)
	List<SupplierInvoiceDto> getComboSupplierInvoice();
	
	// get combo of total balance amount
	List<SupplierInvoiceDto> getComboTotalBalance(@Param("invoice_NO") String name);
	
	// get combo of invoice number
	List<SupplierInvoiceListDto> getComboInvSupPayList();
	
	// get combo of supplier name
	List<SupplierDto> getComboNameSupPayList();
	
	// Search
	List<SupplierPayableDto> getSearchSupPayList(
			@Param("p_From_Date") Date fDate,
			@Param("p_Date_To") Date tDate,
			@Param("p_invoice_NO") String numInvoice,
			@Param("p_Sup_Name") String nameSupp
	);
}
