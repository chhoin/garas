package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.IncomeListDao;
import com.smart.garas.dto.IncomeDto;
import com.smart.garas.dto.IncomeListDto;
import com.smart.garas.service.IncomeListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class IncomeListServiceImpl implements IncomeListService {
	@Autowired
	private IncomeListDao incomeListDao;

	@Override
	public List<IncomeDto> getComboIncomeType() {
		return incomeListDao.getComboIncomeType();
	}

	@Override
	public List<IncomeListDto> getSearchIncome(Date fromDate, Date toDate, String incomeCode, int currentPage, int numPerPage) {
		return incomeListDao.getSearchIncome(fromDate, toDate, incomeCode, currentPage, numPerPage);
	}

}
