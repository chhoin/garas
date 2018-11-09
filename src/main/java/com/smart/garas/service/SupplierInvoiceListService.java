package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceListDto;

public interface SupplierInvoiceListService {
	// get combo of លេខវិក័យបត្រ
	List<CaptureDto> getComboInvoiceNo();
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	List<SupplierDto> getComboSupplierCode();
	
	// get combo of លេខទូរស័ព្ទ
	List<SupplierDto> getComboSupplierPhone();
	
	// Search data from database
	List<SupplierInvoiceListDto> getSearchCapList(
			Date fromDate,
			Date toDate,
			String statusAmt,
			String invoiceNo,
			String suppCode,
			String phone,
			int currentPage,
			int numPerPage
	);
	
	// Search Products List
	List<SupplierInvoiceListDto> getSearchSupplierProductList(String invoiceNo);
	
	// Search history payments
	List<PaymentListDto> getSearchHisPayment(String invoiceNo);
	
	// Save payment
	Integer save(PaymentDto PaymentDto);

}
