package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableListDto;

public interface CustomerPayableListService {
	// get list data from database 
	List<CustomerPayableListDto> getAll();
	
	// get combo of invoice customer_invoice
	List<CustomerInvoiceDto> getComboCustomerInvoice();
	
	// get combo customer name and phone number
	List<CustomerDto> getCustomerNamePhone();
	
	// Search
	List<CustomerPayableListDto> getSearchCusPayList(Date fDate, Date tDate, String numInvoice, String cusname,	String cusphone);

}