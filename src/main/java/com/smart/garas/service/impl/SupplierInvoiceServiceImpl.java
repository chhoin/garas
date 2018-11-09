package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.SupplierInvoiceDao;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.service.SupplierInvoiceService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SupplierInvoiceServiceImpl implements SupplierInvoiceService {
	@Autowired
	private SupplierInvoiceDao supplierInvoiceDao;

	@Override
	public Integer save(SupplierInvoiceDto supplierInvoice) {
		return supplierInvoiceDao.save(supplierInvoice);
	}

	@Override
	public List<SupplierInvoiceDto> getAll() {
		return supplierInvoiceDao.getAll();
	}

	@Override
	public int countById(String id) {
		return supplierInvoiceDao.countById(id);
	}

	@Override
	public int editById(SupplierInvoiceDto supplierInvoice) {
		return supplierInvoiceDao.editById(supplierInvoice);
	}

	@Override
	public int deleteById(String id) {
		return supplierInvoiceDao.deleteById(id);
	}

	@Override
	public List<SupplierInvoiceDto> getPageable(PageableDto pageable) {
		return supplierInvoiceDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return supplierInvoiceDao.getRecords();
	}

	@Override
	public List<SupplierInvoiceDto> getListByCode(String scode) {
		return supplierInvoiceDao.getListByCode(scode);
	}

	@Override
	public List<CaptureDto> getComboInvoiceNo() {
		return supplierInvoiceDao.getComboInvoiceNo();
	}

	@Override
	public List<CaptureDto> getComboName(String name) {
		return supplierInvoiceDao.getComboName(name);
	}

}
