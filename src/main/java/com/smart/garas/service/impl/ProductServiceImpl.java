package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ProductDao;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.ProductDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.ProductService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public Integer save(ProductDto product) {
		return productDao.save(product);
	}

	@Override
	public List<ProductDto> getAll() {
		return productDao.getAll();
	}

	@Override
	public Integer countById(String name) {
		return productDao.countById(name);
	}

	@Override
	public int editById(ProductDto product) {
		return productDao.editById(product);
	}

	@Override
	public int deleteById(String id) {
		return productDao.deleteById(id);
	}

	@Override
	public List<ProductDto> getPageable(PageableDto pageable) {
		return productDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return productDao.getRecords();
	}

	@Override
	public List<ProductDto> getListByCode(String id) {
		return productDao.getListByCode(id);
	}

	@Override
	public List<CategoryDto> getComboCategories() {
		return productDao.getComboCategories();
	}

	@Override
	public List<ItemDto> getComboItem(String name) {
		return productDao.getComboItem(name);
	}

	@Override
	public List<UnitDto> getComboUnit() {
		return productDao.getComboUnit();
	}

	@Override
	public List<UnitDto> getComboCurrency() {
		return productDao.getComboCurrency();
	}
}
