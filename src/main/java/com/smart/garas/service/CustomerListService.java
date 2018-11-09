package com.smart.garas.service;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.smart.garas.dto.CustomerListDto;

public interface CustomerListService {
	
	// Search data
	List<CustomerListDto> getSearchCustomer(String custCode, String phone, String address, int currentPage, int numPerPage);
	
	// Delete data
	Integer deleteById(@Param("custCode") String custCode);
	
	// Get data combo box name
	List<CustomerListDto> getCustomerComboName();
	
	// Get data combo box phone
	List<CustomerListDto> getCustomerComboPhone();
	
	// Get data combo box village
	List<CustomerListDto> getCustomerComboVillage();
	
	// Get count total page
	List<CustomerListDto> getCountTotalPage(String custCode, String phone, String address);
}
