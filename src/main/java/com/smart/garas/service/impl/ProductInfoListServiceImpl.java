package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ProductInfoListDao;
import com.smart.garas.dto.ProductInfoListDto;
import com.smart.garas.service.ProductInfoListService;

@Service
@Transactional (rollbackFor = Exception.class)
public class ProductInfoListServiceImpl implements ProductInfoListService {
	@Autowired
	private ProductInfoListDao productInfoListDao;

	@Override
	public List<ProductInfoListDto> getSearchProductInfoList(String prodCode, int currentPage, int numPerPage) {
		return productInfoListDao.getSearchProductInfoList(prodCode, currentPage, numPerPage);
	}

	@Override
	public Integer deleteById(String prodCode) {
		return productInfoListDao.deleteById(prodCode);
	}

	@Override
	public List<ProductInfoListDto> getComboProductInfoName() {
		return productInfoListDao.getComboProductInfoName();
	}

}
