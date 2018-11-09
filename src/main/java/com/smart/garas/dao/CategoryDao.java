package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.PageableDto;

@Repository
public interface CategoryDao {
	Integer save(CategoryDto category);
	List<CategoryDto> getAll();
	int countById(@Param("categories_NAME") String name);
	
	int editById(CategoryDto category);
	int deleteById(@Param("categories_CODE") String name);
	
	List<CategoryDto> getPageable(PageableDto pageable);
	int getRecords();
	CategoryDto getCategoryByCode(@Param("categories_CODE") String categories_CODE);
	
}
