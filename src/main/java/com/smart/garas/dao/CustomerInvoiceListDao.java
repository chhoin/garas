package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceListDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;

@Repository
public interface CustomerInvoiceListDao {
	// get combo លេខវិក័យបត្រ
	List<CustomerCaptureDto> getComboInvoiceExp();
	
	// get combo ឈ្មោះអតិថិជន
	List<CustomerDto> getComboCustomerName();
	
	// get combo លេខទូរស័ព្ទ
	List<CustomerDto> getComboCustomerPhone();
	
	// Search Export data
	List<CustomerInvoiceListDto> getSearchCustomerInvoiceList(
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate,
			@Param("statusAmt") String statusAmt,
			@Param("exptCode") String exptCode,
			@Param("custCode") String custCode,
			@Param("phone") String phone,
			@Param("currentPage") int currentPage,
			@Param("numPerPage") int numPerPage
	);
	
	// Search customer pay
	List<PaymentListDto> getSearchCustomerPayment(@Param("invoiceNo") String invoiceNo);
	
	// List of product detail by customer buy
	List<CustomerInvoiceListDto> getListOfCustomerBuyProduct(@Param("exptCode") String exptCode);
	
	// Save data to tblPayment
	Integer save(PaymentDto paymentDto);
	
}
