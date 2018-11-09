package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ProductListDao;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.ProductDto;
import com.smart.garas.service.ProductListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ProductListServiceImpl implements ProductListService {
	@Autowired
	private ProductListDao productListDao;

	@Override
	public int save(ProductDto product) {
		return productListDao.save(product);
	}

	@Override
	public List<ProductDto> getAll() {
		return productListDao.getAll();
	}

	@Override
	public int countById(String id) {
		return productListDao.countById(id);
	}

	@Override
	public int editById(ProductDto product) {
		return productListDao.editById(product);
	}

	@Override
	public int deleteById(String id) {
		return productListDao.deleteById(id);
	}

	@Override
	public List<ProductDto> getPageable(PageableDto pageable) {
		return productListDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return productListDao.getRecords();
	}

	@Override
	public List<ProductDto> getListByCode(String name) {
		return productListDao.getListByCode(name);
	}

	// get data to combo box
	@Override
	public List<CategoryDto> getComboProducts() {
		return productListDao.getComboProducts();
	}
	
}
