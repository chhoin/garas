package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.UnitDto;

public interface ProductInfoService {
	// get data combo of category
	List<CategoryDto> getComCategoryCode(); 
	
	// get data combo of unit
	List<UnitDto> getUnitCode(); 
	
	// Save data into database
	Integer save(ProductInfoDto productInfoDto);
	
	// check duplicated data
	Integer countById(String prodName);

}
