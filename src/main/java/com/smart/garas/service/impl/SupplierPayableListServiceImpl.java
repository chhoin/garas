package com.smart.garas.service.impl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.SupplierPayableListDao;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceDto;
import com.smart.garas.dto.SupplierInvoiceListDto;
import com.smart.garas.dto.SupplierPayableDto;
import com.smart.garas.service.SupplierPayableListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SupplierPayableListServiceImpl implements SupplierPayableListService{
	@Autowired
	private SupplierPayableListDao supplierPayableListDao;

	@Override
	public Integer save(SupplierPayableDto supplierInvoice) {
		return supplierPayableListDao.save(supplierInvoice);
	}

	@Override
	public List<SupplierPayableDto> getAll() {
		return supplierPayableListDao.getAll();
	}

	@Override
	public List<SupplierInvoiceDto> getComboSupplierInvoice() {
		return supplierPayableListDao.getComboSupplierInvoice();
	}

	// Search
	@Override
	public List<SupplierPayableDto> getSearchSupPayList(Date fDate, Date tDate, String numInvoice, String nameSupp) {
		return supplierPayableListDao.getSearchSupPayList(fDate, tDate, numInvoice, nameSupp);
	}

	@Override
	public List<SupplierInvoiceListDto> getComboInvSupPayList() {
		return supplierPayableListDao.getComboInvSupPayList();
	}

	@Override
	public List<SupplierDto> getComboNameSupPayList() {
		return supplierPayableListDao.getComboNameSupPayList();
	}
	
}
