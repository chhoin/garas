package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.CustomerCaptureListDto;
import com.smart.garas.dto.CustomerDto;

public interface CustomerCaptureListService {
	// Get combo by invoice number 
		List<CustomerCaptureListDto> getComboInvoiceExp();
		
		// Get combo customer code
		List<CustomerDto> getComboCustomerName();
		
		// Get combo phone number
		List<CustomerDto> getComboCustomerPhone();
		
		// Search sale producct detail
		List<CustomerCaptureListDto> getSearchSaleProduct(
				Date fromDate,
				Date toDate,
				String exptCode,
				String custCode,
				String phone,
				String cateCode,
				int currentPage,
				int numPerPage
			);
		
		// Print invoice by invoice number
		List<CustomerCaptureListDto> getPrintInvoice(String exptCode);
}
