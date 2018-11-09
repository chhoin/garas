package com.smart.garas.dao;

import org.springframework.stereotype.Repository;
import com.smart.garas.dto.ExpenseDto;

@Repository
public interface ExpenseDao {
	// Save data to database
	Integer save(ExpenseDto expenseDto);
}
