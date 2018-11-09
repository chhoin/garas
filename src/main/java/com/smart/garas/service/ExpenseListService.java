package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.ExpenseDto;
import com.smart.garas.dto.ExpenseListDto;

public interface ExpenseListService {
	// get combo of expense type
	List<ExpenseDto> getComboExpenseType();
	
	// Search data of income 
	List<ExpenseListDto> getSearchExpense(
			Date fromDate,
			Date toDate,
			String expCode,
			int currentPage,
			int numPerPage
	);

}
