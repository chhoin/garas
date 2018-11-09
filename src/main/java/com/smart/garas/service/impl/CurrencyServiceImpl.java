package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CurrencyDao;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.service.CurrencyService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CurrencyServiceImpl implements CurrencyService {
	
	@Autowired
	private CurrencyDao currencyDao;

	@Override
	public Integer save(CurrencyDto currency) {
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
	public int deleteById(String id) {
		return currencyDao.deleteById(id);
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
	public CurrencyDto getCurrencyByID(String cur_ID) {
		// TODO Auto-generated method stub
		return currencyDao.getCurrencyByID(cur_ID);
	}
	
}
