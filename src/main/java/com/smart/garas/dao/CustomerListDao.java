package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CustomerListDto;

@Repository
public interface CustomerListDao {
	
	// Search data
	List<CustomerListDto> getSearchCustomer(
				@Param("custCode") String custCode,
				@Param("phone") String phone,
				@Param("address") String address,
				@Param("currentPage") int currentPage,
				@Param("numPerPage") int numPerPage
			);
	
	// Delete data
	Integer deleteById(@Param("custCode") String custCode);
	
	// Get data combo box name
	List<CustomerListDto> getCustomerComboName();
	
	// Get data combo box phone
	List<CustomerListDto> getCustomerComboPhone();
	
	// Get data combo box village
	List<CustomerListDto> getCustomerComboVillage();
	
	// Get count total page
	List<CustomerListDto> getCountTotalPage(
				@Param("custCode") String custCode,
				@Param("phone") String phone,
				@Param("address") String address
			);
	
	// Get data combo box district
	//List<DistrictDto> getCustomerComboDistrict();
	
	// Get data combo box province
	//List<ProvinceDto> getCustomerComboProvince();

}
