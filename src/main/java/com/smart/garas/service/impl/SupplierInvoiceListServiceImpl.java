package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.SupplierInvoiceListDao;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.SupplierInvoiceListDto;
import com.smart.garas.service.SupplierInvoiceListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SupplierInvoiceListServiceImpl implements SupplierInvoiceListService {
	@Autowired
	private SupplierInvoiceListDao supplierInvoiceListDao;

	@Override
	public List<CaptureDto> getComboInvoiceNo() {
		return supplierInvoiceListDao.getComboInvoiceNo();
	}

	@Override
	public List<SupplierDto> getComboSupplierCode() {
		return supplierInvoiceListDao.getComboSupplierCode();
	}

	@Override
	public List<SupplierDto> getComboSupplierPhone() {
		return supplierInvoiceListDao.getComboSupplierPhone();
	}

	@Override
	public List<SupplierInvoiceListDto> getSearchSupplierProductList(String invoiceNo) {
		return supplierInvoiceListDao.getSearchSupplierProductList(invoiceNo);
	}

	@Override
	public List<PaymentListDto> getSearchHisPayment(String invoiceNo) {
		return supplierInvoiceListDao.getSearchHisPayment(invoiceNo);
	}

	@Override
	public Integer save(PaymentDto PaymentDto) {
		return supplierInvoiceListDao.save(PaymentDto);
	}

	@Override
	public List<SupplierInvoiceListDto> getSearchCapList(Date fromDate, Date toDate, String statusAmt, String invoiceNo,
			String suppCode, String phone, int currentPage, int numPerPage) {
		return supplierInvoiceListDao.getSearchCapList(fromDate, toDate, statusAmt, invoiceNo, suppCode, phone, currentPage, numPerPage);
	}

}
