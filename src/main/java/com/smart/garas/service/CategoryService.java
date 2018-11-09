package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.PageableDto;

public interface CategoryService {
	Integer save(CategoryDto category);
	List<CategoryDto> getAll();
	int countById(String name);
	int editById(CategoryDto category);
	int deleteById(String name);
	
	List<CategoryDto> getPageable(PageableDto pageable);
	int getRecords();
	CategoryDto getCategoryByCode(String categories_CODE);
}
