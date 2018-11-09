package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerInvoiceDto;

@Repository
public interface CustomerInvoiceDao {
	
	// save data into database
	Integer save(CustomerInvoiceDto customerInvoiceDto);
	
	// get data all
	List<CustomerInvoiceDto> getAll();
	
	// get data to combo box of Customer Invoice
	List<CustomerCaptureDto> getComboCusInvoice();
	
	// get combo of name and phone
	List<CustomerCaptureDto> getComboCusName(@Param("invoice_NUM") String name);

}
