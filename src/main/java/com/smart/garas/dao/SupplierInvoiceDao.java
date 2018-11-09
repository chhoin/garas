package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.SupplierInvoiceDto;

@Repository
public interface SupplierInvoiceDao {
	
	// save data into data base
	Integer save(SupplierInvoiceDto supplierInvoice);
	
	// get data list from database
	List<SupplierInvoiceDto> getAll();
	
	// get combo of invoice number
	List<CaptureDto> getComboInvoiceNo();
	
	// get combo of item name, phone and ccy
	List<CaptureDto> getComboName(@Param("invoice_NO") String name);
	
	// other for backup
	int countById(@Param("code") String id);
	int editById(SupplierInvoiceDto supplierInvoice);
	int deleteById(@Param("code") String id);
	List<SupplierInvoiceDto> getPageable(PageableDto pageable);
	int getRecords();
	List<SupplierInvoiceDto> getListByCode(@Param("code") String scode);

}
