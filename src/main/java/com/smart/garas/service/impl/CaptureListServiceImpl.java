package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CaptureListDao;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.service.CaptureListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CaptureListServiceImpl implements CaptureListService {
	@Autowired
	private CaptureListDao captureListDao;

	@Override
	public List<CaptureDto> getComboInvoiceNo() {
		return captureListDao.getComboInvoiceNo();
	}

	@Override
	public List<SupplierDto> getComboSupplierCode() {
		return captureListDao.getComboSupplierCode();
	}

	@Override
	public List<SupplierDto> getComboSupplierPhone() {
		return captureListDao.getComboSupplierPhone();
	}

	@Override
	public List<CategoryDto> getComboCategoryCode() {
		return captureListDao.getComboCategoryCode();
	}

	@Override
	public List<CaptureListDto> getSearchCapList(Date fromDate, Date toDate, String invoiceNo, String suppCode,
			String phone, String cateCode, String status, int currentPage, int numPerPage) {
		return captureListDao.getSearchCapList(fromDate, toDate, invoiceNo, suppCode, phone, cateCode, status, currentPage, numPerPage);
	}

	@Override
	public List<CaptureListDto> getPrintInvoiceImport(String invoiceNo) {
		return captureListDao.getPrintInvoiceImport(invoiceNo);
	}

	@Override
	public List<CaptureListDto> getExportExcel(String invoiceNo) {
		return captureListDao.getExportExcel(invoiceNo);
	}

	@Override
	public List<CaptureListDto> getPrintNow(String invoiceNo) {
		return captureListDao.getPrintNow(invoiceNo);
	}

}
