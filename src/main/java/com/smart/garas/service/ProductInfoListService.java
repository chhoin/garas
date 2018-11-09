package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.ProductInfoListDto;

public interface ProductInfoListService {
	// Search data
	List<ProductInfoListDto> getSearchProductInfoList(String prodCode, int currentPage, int numPerPage);
	
	// Delete data
	Integer deleteById(String prodCode);
	
	// Get data combo box name
	List<ProductInfoListDto> getComboProductInfoName();

}
