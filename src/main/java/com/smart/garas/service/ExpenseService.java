package com.smart.garas.service;

import com.smart.garas.dto.ExpenseDto;

public interface ExpenseService {
	// Save data to database
	Integer save(ExpenseDto expenseDto);
}
