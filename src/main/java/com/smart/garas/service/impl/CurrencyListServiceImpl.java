package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CurrencyListDao;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.service.CurrencyListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CurrencyListServiceImpl implements CurrencyListService {
	
	@Autowired
	private CurrencyListDao currencyDao;

	@Override
	public int save(CurrencyDto currency) {
		return currencyDao.save(currency);
	}

	@Override
	public List<CurrencyDto> getAll() {
		return currencyDao.getAll();
	}

	@Override
	public int countById(String name) {
		return currencyDao.countById(name);
	}

	@Override
	public int editById(CurrencyDto currency) {
		return currencyDao.editById(currency);
	}

	@Override
	public int deleteById(String name) {
		return currencyDao.deleteById(name);
	}

	@Override
	public List<CurrencyDto> getPageable(PageableDto pageable) {
		return currencyDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return currencyDao.getRecords();
	}

	@Override
	public List<CurrencyDto> getListByCode(String id) {
		return currencyDao.getListByCode(id);
	}

	@Override
	public List<CurrencyDto> getDataToCombo() {
		return currencyDao.getDataToCombo();
	}
	
}
