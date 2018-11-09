package com.smart.garas.dao;

import org.springframework.stereotype.Repository;
import com.smart.garas.dto.SupplierDto;

@Repository
public interface SupplierDao {
	// Save data into database
	Integer save(SupplierDto supplierDto);
}
