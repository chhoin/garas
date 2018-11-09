package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CarDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.UnitDto;

@Repository
public interface CaptureDao {
	// save Import Products
	Integer save(CaptureDto capture);
	
	// save Import Payment 
	Integer saveImportPayment(PaymentDto paymentDto);
	
	// get combo ឈ្មោះក្រុមហ៊ុន 
	List<SupplierDto> getComboSuppCompany();
	
	// get combo info ឈ្មោះអ្នកផ្គត់ផ្គង់  by ឈ្មោះក្រុមហ៊ុន
	List<SupplierDto> getComboSuppName(@Param("suppCode") String suppCode);
	
	// Get combo of car number
	List<CarDto> getCarNum();
	
	// Get driver name by car number
	List<CarDto> getDriverName(@Param("carCode") String carCode);
	
	// got combo ឈ្មោះមុខទំនិញ 
	List<CategoryDto> getComboCategory();
	
	// get combo Info ប្រភេទមុខទំនិញ by ឈ្មោះមុខទំនិញ
	List<ProductInfoDto> getComboCategoryInfo(@Param("cateCode") String cateCode);
	
	// get combo ឯកតា
	List<UnitDto> getComboUnit(@Param("unitType") String unitType);
	
	// get combo រូបិយប័ណ្ណ 
	List<CurrencyDto> getComboCcy();
	
	// Search data Import Product Print
	List<CaptureListDto> getSearchCapturePrint(
			@Param("invoiceNo") String invoiceNo,
			@Param("curCode") String curCode
	);
	
	// int editById(CaptureDto capture);
	// int deleteById(@Param("entries_NUM") String name);
	// List<CaptureDto> getPageable(PageableDto pageable);
	// int getRecords();
}
