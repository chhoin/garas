package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.SupplierPayableDao;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.dto.SupplierPayableDto;
import com.smart.garas.service.SupplierPayableService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SupplierPayableServiceImpl implements SupplierPayableService {
	@Autowired
	private SupplierPayableDao supplierPayableDao;

	// save data into database 
	@Override
	public Integer save(SupplierPayableDto supplierInvoice) {
		return supplierPayableDao.save(supplierInvoice);
	}

	// get data list from database
	@Override
	public List<SupplierPayableDto> getAll() {
		return supplierPayableDao.getAll();
	}

	// get combo of invoice (SUPPLIER_INVOICE)
	@Override
	public List<SupplierInvoiceDto> getComboSupplierInvoice() {
		return supplierPayableDao.getComboSupplierInvoice();
	}

	// get combo of total balance amount
	@Override
	public List<SupplierInvoiceDto> getComboTotalBalance(String name) {
		return supplierPayableDao.getComboTotalBalance(name);
	}

	// get combo of currency
	@Override
	public List<CurrencyDto> getComboCurrency() {
		return supplierPayableDao.getComboCurrency();
	}

}
