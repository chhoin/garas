package com.smart.garas.service;

import com.smart.garas.dto.SupplierDto;

public interface SupplierService {
	// Save data into database
	Integer save(SupplierDto supplierDto);
	
	/*int countById(String id);
	int editById(SupplierDto supplier);
	int deleteById(String id);
	
	List<SupplierDto> getPageale(PageableDto pageable);
	int getRecords();
	
	List<SupplierDto> getListByCode(String id);*/
 
}
