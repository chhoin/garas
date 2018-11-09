package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.SupplierDto;

@Repository
public interface CaptureListDao {
	//List<CaptureListDto> getAll();
	//List<CaptureListDto> getPageable(PageableDto pageable);
	//int getRecords();
	
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
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate,
			@Param("invoiceNo") String invoiceNo,
			@Param("suppCode") String suppCode,
			@Param("phone") String phone,
			@Param("cateCode") String cateCode,
			@Param("status") String status,
			@Param("currentPage") int currentPage,
			@Param("numPerPage") int numPerPage
	);
	
	// Print invoice
	List<CaptureListDto> getPrintInvoiceImport(@Param("invoiceNo") String invoiceNo);
	
	// Export to excel
	List<CaptureListDto> getExportExcel(@Param("invoiceNo") String invoiceNo);
	
	// Export to excel
	List<CaptureListDto> getPrintNow(@Param("invoiceNo") String invoiceNo);
	
}
