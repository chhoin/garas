package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.ProductDto;

@Repository
public interface ProductListDao {
	int save(ProductDto product);
	List<ProductDto> getAll();
	int countById(@Param("st_ID") String id);
	
	int editById(ProductDto product);
	int deleteById(@Param("st_ID") String id);
	
	List<ProductDto> getPageable(PageableDto pageable);
	int getRecords();
	
	// search by product name 
	List<ProductDto> getListByCode(@Param("st_NAME") String name);
	
	
	// get data to combo box
	List<CategoryDto> getComboProducts();

}
