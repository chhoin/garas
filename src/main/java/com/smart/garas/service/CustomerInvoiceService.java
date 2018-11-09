package com.smart.garas.service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerInvoiceDto;

public interface CustomerInvoiceService {
	
	// save data into database
	Integer save(CustomerInvoiceDto customerInvoiceDto);
	
	// get data all from database
	List<CustomerInvoiceDto> getAll();
	
	// get data to combo box of Customer Invoice
	List<CustomerCaptureDto> getComboCusInvoice();
	
	// get combo of name and phone
	List<CustomerCaptureDto> getComboCusName(@Param("invoice_NUM") String name);

}
