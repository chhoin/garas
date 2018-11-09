package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.ProductDto;
import com.smart.garas.dto.UnitDto;

public interface ProductService {
	Integer save(ProductDto product);
	List<ProductDto> getAll();
	Integer countById(String name);
	int editById(ProductDto product);
	int deleteById(String id);
	
	List<ProductDto> getPageable(PageableDto pageable);
	int getRecords();
	
	List<ProductDto> getListByCode(String id);
	
	// get combo of categories
	List<CategoryDto> getComboCategories();
	
	// get combo of item
	List<ItemDto> getComboItem(String name);
	
	// get combo of unit
	List<UnitDto> getComboUnit();
	
	// get combo of currency
	List<UnitDto> getComboCurrency();

}
