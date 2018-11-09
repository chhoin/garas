package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.ProductDto;
import com.smart.garas.dto.UnitDto;

@Repository
public interface ProductDao {
	Integer save(ProductDto product);
	List<ProductDto> getAll();
	Integer countById(@Param("st_NAME") String name);
	
	int editById(ProductDto product);
	int deleteById(@Param("st_ID") String id);
	
	List<ProductDto> getPageable(PageableDto pageable);
	int getRecords();
	
	List<ProductDto> getListByCode(@Param("st_ID") String id);
	
	// get combo of categories
	List<CategoryDto> getComboCategories();
	
	// get combo of item
	List<ItemDto> getComboItem(@Param("categories_NAME") String name);
	
	// get combo of unit
	List<UnitDto> getComboUnit();
	
	// get combo of currency
	List<UnitDto> getComboCurrency();
}
