package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CarDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.UnitDto;

public interface CustomerCaptureService {
	// Get cuscapInvoiceNo
	List<CustomerCaptureDto> getCusCapInvoiceNoCode();
	
	// get combo ឈ្មោះអតិថិជន​ *** 
	List<CustomerDto> getComboCustomerCode();
		
	// get combo info ឈ្មោះអតិថិជន​ ***  
	List<CustomerDto> getComboCustomerInfo(String custCode);
		
	// get combo លេខវិក័យបត្រ ​ ***
	List<CaptureDto> getComboInvoiceCode();
	
	// get combo info លេខវិក័យបត្រ ​ ***
	List<CaptureListDto> getComboInvoiceInfo(String invoiceNo);
	
	// get combo category code ***
	List<CaptureListDto> getComboCategoryByInvoiceImp(String invoiceNo);
	
	// get combo product code ***
	List<CaptureListDto> getComboProdTypeByInvoiceImp(String invoiceNo, String cateCode);
	
	// get combo ឯកតា ​ ***
	List<UnitDto> getComboUnit();
	
	// get combo ផ្លាកលេខឡាន ​ ***
	List<CarDto> getCar();
	
	// get combo info ផ្លាកលេខឡាន ​ ***
	List<CarDto> getCarInfo(String carCode);
	
	// get combo រូបិយប័ណ្ណ 
	List<CurrencyDto> getComboCcy();
	
	//Save data into database
	Integer save(CustomerCaptureDto customerCaptureDto);
}
