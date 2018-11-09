package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.IncomeDao;
import com.smart.garas.dto.IncomeDto;
import com.smart.garas.service.IncomeService;

@Service
@Transactional(rollbackFor = Exception.class)
public class IncomeServiceImpl implements IncomeService {
	@Autowired
	private IncomeDao incomeDao;

	@Override
	public Integer save(IncomeDto income) {
		return incomeDao.save(income);
	}

}
