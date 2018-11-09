package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.ProductInfoListDto;

@Repository
public interface ProductInfoListDao {
	// Search data
	List<ProductInfoListDto> getSearchProductInfoList(
		@Param("prodCode") String prodCode,
		@Param("currentPage") int currentPage,
		@Param("numPerPage") int numPerPage
	);
	
	// Delete data
	Integer deleteById(@Param("prodCode") String prodCode);
	
	// Get data combo box name
	List<ProductInfoListDto> getComboProductInfoName();

}
