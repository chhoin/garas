package com.smart.garas.dao;

import org.springframework.stereotype.Repository;
import com.smart.garas.dto.IncomeDto;

@Repository
public interface IncomeDao {
	// Save data to database 
	Integer save(IncomeDto incomeDto);
	
}
