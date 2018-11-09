package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CarDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.UnitDto;

public interface CaptureService {
	
	// Get combo of car number
	List<CarDto> getCarNum();
	
	// Get driver name by car number
	List<CarDto> getDriverName(String carCode);
	
	// save Import Products
	Integer save(CaptureDto capture);
	
	// save Import Payment
	Integer saveImportPayment(PaymentDto paymentDto);
	
	// get combo ឈ្មោះក្រុមហ៊ុន 
	List<SupplierDto> getComboSuppCompany();
	
	// get combo info ឈ្មោះអ្នកផ្គត់ផ្គង់  by ឈ្មោះក្រុមហ៊ុន
	List<SupplierDto> getComboSuppName(String suppCode);
	
	// got combo ឈ្មោះមុខទំនិញ 
	List<CategoryDto> getComboCategory();
	
	// get combo Info ប្រភេទមុខទំនិញ by ឈ្មោះមុខទំនិញ
	List<ProductInfoDto> getComboCategoryInfo(String cateCode);
	
	// get combo ឯកតា
	List<UnitDto> getComboUnit(String unitType);
	
	// get combo រូបិយប័ណ្ណ 
	List<CurrencyDto> getComboCcy();
	
	// Search data Import Product Print
	List<CaptureListDto> getSearchCapturePrint(
			String invoiceNo,
			String curCode
	);
}
