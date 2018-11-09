package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.IncomeDto;
import com.smart.garas.dto.IncomeListDto;

public interface IncomeListService {
	// get combo of income type
	List<IncomeDto> getComboIncomeType();
	
	// Search data of income 
	List<IncomeListDto> getSearchIncome(
			Date fromDate,
			Date toDate,
			String incomeCode,
			int currentPage,
			int numPerPage
	);

}
