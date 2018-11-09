package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ReturntoHengpheaDao;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.ReturntoHengpheaDto;
import com.smart.garas.service.ReturntoHengpheaService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ReturntoHengpheaServiceImpl implements ReturntoHengpheaService{
	@Autowired
	private ReturntoHengpheaDao returntoHengpheaDao;

	@Override
	public List<ReturntoHengpheaDto> getGenerateAutoInvoiceReturn() {
		return returntoHengpheaDao.getGenerateAutoInvoiceReturn();
	}

	@Override
	public List<ReturntoHengpheaDto> getComboReturn() {
		return returntoHengpheaDao.getComboReturn();
	}

	@Override
	public List<ReturntoHengpheaDto> getComboCategory(String invoiceNo) {
		return returntoHengpheaDao.getComboCategory(invoiceNo);
	}

	@Override
	public List<ReturntoHengpheaDto> getComboProduct(String invoiceNo, String cateCode) {
		return returntoHengpheaDao.getComboProduct(invoiceNo, cateCode);
	}

	@Override
	public List<ReturntoHengpheaDto> getComboUnit(String invoiceNo, String cateCode, String prodCode) {
		return returntoHengpheaDao.getComboUnit(invoiceNo, cateCode, prodCode);
	}

	@Override
	public List<CurrencyDto> getComboCurrency() {
		return returntoHengpheaDao.getComboCurrency();
	}

	@Override
	public Integer save(ReturntoHengpheaDto returntoHengpheaDto) {
		return returntoHengpheaDao.save(returntoHengpheaDto);
	}

	@Override
	public List<ReturntoHengpheaDto> getComboInfoByCode(String invoiceNo, String cateCode, String prodCode, String unitCode) {
		return returntoHengpheaDao.getComboInfoByCode(invoiceNo, cateCode, prodCode, unitCode);
	}

}
