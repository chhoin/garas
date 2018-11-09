package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableListDto;

@Repository
public interface CustomerPayableListDao {
	
	// get list data from database 
	List<CustomerPayableListDto> getAll();
	
	// get combo of invoice customer_invoice 
	List<CustomerInvoiceDto> getComboCustomerInvoice();
	
	// get combo customer name and phone number
	List<CustomerDto> getCustomerNamePhone();
	
	// Search
	List<CustomerPayableListDto> getSearchCusPayList(
			@Param("p_F_DATE") Date fDate,
			@Param("p_T_DATE") Date tDate,
			@Param("p_INVOICE_NO") String numInvoice,
			@Param("p_CUS_NAME") String cusname,
			@Param("p_CUS_PHONE") String cusphone
	);

}
