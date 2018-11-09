package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.SupplierListDto;

@Repository
public interface SupplierListDao {
	// Search data
	List<SupplierListDto> getSearchSupplier(
		@Param("suppCode") String suppCode,
		@Param("phone") String phone,
		@Param("currentPage") int currentPage,
		@Param("numPerPage") int numPerPage
	);
	
	// Delete data
	Integer deleteById(@Param("suppCode") String suppCode);
	
	// Get data combo box name
	List<SupplierListDto> getSupplierComboName();
	
	// Get data combo box phone
	List<SupplierListDto> getSupplierComboPhone();

}
