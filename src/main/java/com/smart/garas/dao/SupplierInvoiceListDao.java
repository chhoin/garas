package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceListDto;

@Repository
public interface SupplierInvoiceListDao {
	// get combo of លេខវិក័យបត្រ
	List<CaptureDto> getComboInvoiceNo();
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	List<SupplierDto> getComboSupplierCode();
	
	// get combo of លេខទូរស័ព្ទ
	List<SupplierDto> getComboSupplierPhone();
	
	// Search data from database
	List<SupplierInvoiceListDto> getSearchCapList(
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate,
			@Param("statusAmt") String statusAmt,
			@Param("invoiceNo") String invoiceNo,
			@Param("suppCode") String suppCode,
			@Param("phone") String phone,
			@Param("currentPage") int currentPage,
			@Param("numPerPage") int numPerPage
	);
	
	// Search Products List
	List<SupplierInvoiceListDto> getSearchSupplierProductList(@Param("invoiceNo") String invoiceNo);
	
	// Search history payments
	List<PaymentListDto> getSearchHisPayment(@Param("invoiceNo") String invoiceNo);
	
	// Save payment
	Integer save(PaymentDto PaymentDto);
	
	//List<SupplierInvoiceListDto> getAll();
	//int editById(SupplierInvoiceListDto supplierInvoiceListDto);
	//int deleteById(@Param("code") String id);
	// List<SupplierInvoiceListDto> getPageable(PageableDto pageable);
	// int getRecords();
	

}
