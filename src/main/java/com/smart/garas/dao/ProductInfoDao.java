package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.UnitDto;

@Repository
public interface ProductInfoDao {
	// get data combo of category
	List<CategoryDto> getComCategoryCode(); 
	
	// get data combo of unit
	List<UnitDto> getUnitCode(); 
	
	// Save data into database
	Integer save(ProductInfoDto productInfoDto);
	
	// check duplicated data
	Integer countById(@Param("prodName") String prodName);

}
