package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceListDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;

public interface CustomerInvoiceListService {
	
	// get combo លេខវិក័យបត្រ
	List<CustomerCaptureDto> getComboInvoiceExp();
	
	// get combo ឈ្មោះអតិថិជន
	List<CustomerDto> getComboCustomerName();
	
	// get combo លេខទូរស័ព្ទ
	List<CustomerDto> getComboCustomerPhone();
	
	// Search Export data
	List<CustomerInvoiceListDto> getSearchCustomerInvoiceList(
			Date fromDate,
			Date toDate,
			String statusAmt,
			String exptCode,
			String custCode,
			String phone,
			int currentPage,
			int numPerPage
	);
	
	// Search customer pay
	List<PaymentListDto> getSearchCustomerPayment(String invoiceNo);
	
	// List of product detail by customer buy
	List<CustomerInvoiceListDto> getListOfCustomerBuyProduct(String exptCode);
	
	// Save data to tblPayment
	Integer save(PaymentDto paymentDto);

}

