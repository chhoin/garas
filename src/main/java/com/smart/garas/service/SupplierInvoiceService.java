package com.smart.garas.service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.SupplierInvoiceDto;

public interface SupplierInvoiceService {
	
	// save data into database
	Integer save(SupplierInvoiceDto supplierInvoice);
	
	// get data list 
	List<SupplierInvoiceDto> getAll();
	
	// get combo of invoice number
	List<CaptureDto> getComboInvoiceNo();
	
	// get combo of item name, phone and ccy
	List<CaptureDto> getComboName(String name);
		
	// other for backup
	int countById(String id);
	int editById(SupplierInvoiceDto supplierInvoice);
	int deleteById(String id);
	List<SupplierInvoiceDto> getPageable(PageableDto pageable);
	int getRecords();
	List<SupplierInvoiceDto> getListByCode(@Param("code") String scode);

}
