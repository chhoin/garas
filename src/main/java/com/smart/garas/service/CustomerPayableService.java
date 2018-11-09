package com.smart.garas.service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableDto;

public interface CustomerPayableService {
	// save data into database
		Integer save(CustomerPayableDto customerPayableDto);
		
	// get data all from database
	List<CustomerPayableDto> getAll();
	
	// get data to combo box of Customer Invoice
	List<CustomerInvoiceDto> getComboCPayInvoice();
	
	// get combo of name and phone
	List<CustomerInvoiceDto> getComboCusPayInvoice(@Param("invoice_NUMBER") String name);

}
