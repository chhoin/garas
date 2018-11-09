package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ExpenseListDao;
import com.smart.garas.dto.ExpenseDto;
import com.smart.garas.dto.ExpenseListDto;
import com.smart.garas.service.ExpenseListService;

@Service
@Transactional(rollbackFor=Exception.class)
public class ExpenseListServiceImpl implements ExpenseListService {
	@Autowired
	private ExpenseListDao expenseListDao;

	@Override
	public List<ExpenseDto> getComboExpenseType() {
		return expenseListDao.getComboExpenseType();
	}

	@Override
	public List<ExpenseListDto> getSearchExpense(Date fromDate, Date toDate, String expCode, int currentPage,
			int numPerPage) {
		return expenseListDao.getSearchExpense(fromDate, toDate, expCode, currentPage, numPerPage);
	}

}