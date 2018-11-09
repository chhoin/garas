package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.SupplierDto;

public interface CaptureListService {
	// get combo of លេខវិក័យបត្រ
	List<CaptureDto> getComboInvoiceNo();
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	List<SupplierDto> getComboSupplierCode();
	
	// get combo of លេខទូរស័ព្ទ
	List<SupplierDto> getComboSupplierPhone();
	
	// get combo of ឈ្មោះមុខទំនិញ
	List<CategoryDto> getComboCategoryCode();
	
	// Search data from database
	List<CaptureListDto> getSearchCapList(
			Date fromDate,
			Date toDate,
			String invoiceNo,
			String suppCode,
			String phone,
			String cateCode,
			String status,
			int currentPage,
			int numPerPage
	);
	
	// Print invoice
	List<CaptureListDto> getPrintInvoiceImport(String invoiceNo);
	
	// Export to excel
	List<CaptureListDto> getExportExcel(String invoiceNo);
	
	// Export to excel
	List<CaptureListDto> getPrintNow(String invoiceNo);
	
}
