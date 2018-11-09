package com.smart.garas.service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.smart.garas.dto.SupplierListDto;

public interface SupplierListService {
	// Search data
	List<SupplierListDto> getSearchSupplier(String suppCode, String phone, int currentPage, int numPerPage);
	
	// Delete data
	Integer deleteById(@Param("suppCode") String suppCode);
	
	// Get data combo box name
	List<SupplierListDto> getSupplierComboName();
	
	// Get data combo box phone
	List<SupplierListDto> getSupplierComboPhone();

}
