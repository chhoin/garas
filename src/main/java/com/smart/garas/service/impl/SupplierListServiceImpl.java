package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smart.garas.dao.SupplierListDao;
import com.smart.garas.dto.SupplierListDto;
import com.smart.garas.service.SupplierListService;

@Service
public class SupplierListServiceImpl implements SupplierListService {
	@Autowired
	private SupplierListDao supplierListDao;

	@Override
	public List<SupplierListDto> getSearchSupplier(String suppCode, String phone, int currentPage, int numPerPage) {
		return supplierListDao.getSearchSupplier(suppCode, phone, currentPage, numPerPage);
	}

	@Override
	public Integer deleteById(String suppCode) {
		return supplierListDao.deleteById(suppCode);
	}

	@Override
	public List<SupplierListDto> getSupplierComboName() {
		return supplierListDao.getSupplierComboName();
	}

	@Override
	public List<SupplierListDto> getSupplierComboPhone() {
		return supplierListDao.getSupplierComboPhone();
	}

}
