package com.smart.garas.service;

import java.util.List;

import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.ProductDto;

public interface ProductListService {
	int save(ProductDto product);
	List<ProductDto> getAll();
	int countById(String id);
	int editById(ProductDto product);
	int deleteById(String id);
	
	List<ProductDto> getPageable(PageableDto pageable);
	int getRecords();
	
	// search by product name
	List<ProductDto> getListByCode(String name);
	
	// get data to combo box
	List<CategoryDto> getComboProducts();

}
