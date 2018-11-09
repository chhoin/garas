package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableDto;

@Repository
public interface CustomerPayableDao {
	// save data into database
		Integer save(CustomerPayableDto customerPayableDto);
		
		// get data all
		List<CustomerPayableDto> getAll();
		
		// get data to combo box of Customer Invoice
		List<CustomerInvoiceDto> getComboCPayInvoice();
		
		// get combo of name and phone
		List<CustomerInvoiceDto> getComboCusPayInvoice(@Param("invoice_NUMBER") String name);

}
