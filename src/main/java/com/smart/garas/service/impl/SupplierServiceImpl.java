package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.SupplierDao;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.service.SupplierService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao supplierDao;

	@Override
	public Integer save(SupplierDto supplier) {
		return supplierDao.save(supplier);
	}
}
