package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ProductInfoDao;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.ProductInfoService;

@Service
@Transactional (rollbackFor = Exception.class)
public class ProductInfoServiceImpl implements ProductInfoService {
	@Autowired
	private ProductInfoDao productInfoDao;

	@Override
	public List<CategoryDto> getComCategoryCode() {
		return productInfoDao.getComCategoryCode();
	}

	@Override
	public List<UnitDto> getUnitCode() {
		return productInfoDao.getUnitCode();
	}

	@Override
	public Integer save(ProductInfoDto productInfoDto) {
		return productInfoDao.save(productInfoDto);
	}

	@Override
	public Integer countById(String prodName) {
		return productInfoDao.countById(prodName);
	}

}
