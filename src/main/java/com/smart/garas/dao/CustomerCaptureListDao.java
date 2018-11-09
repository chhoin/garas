package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CustomerCaptureListDto;
import com.smart.garas.dto.CustomerDto;

@Repository
public interface CustomerCaptureListDao {
	
	// Get combo by invoice number 
	List<CustomerCaptureListDto> getComboInvoiceExp();
	
	// Get combo customer code
	List<CustomerDto> getComboCustomerName();
	
	// Get combo phone number
	List<CustomerDto> getComboCustomerPhone();
	
	// Search sale producct detail
	List<CustomerCaptureListDto> getSearchSaleProduct(
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate,
			@Param("exptCode") String exptCode,
			@Param("custCode") String custCode,
			@Param("phone") String phone,
			@Param("cateCode") String cateCode,
			@Param("currentPage") int currentPage,
			@Param("numPerPage") int numPerPage
		);
	
	// Print invoice by invoice number
	List<CustomerCaptureListDto> getPrintInvoice(
			@Param("exptCode") String exptCode
		);

}
