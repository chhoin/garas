package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ExpenseDao;
import com.smart.garas.dto.ExpenseDto;
import com.smart.garas.service.ExpenseService;

@Service
@Transactional(rollbackFor=Exception.class)
public class ExpenseServiceImpl implements ExpenseService {
	@Autowired
	private ExpenseDao expenseDao;

	@Override
	public Integer save(ExpenseDto expenseDto) {
		return expenseDao.save(expenseDto);
	}

}
