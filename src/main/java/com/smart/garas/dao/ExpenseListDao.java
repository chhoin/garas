package com.smart.garas.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.smart.garas.dto.ExpenseDto;
import com.smart.garas.dto.ExpenseListDto;

@Repository
public interface ExpenseListDao {
	// get combo of expense type
	List<ExpenseDto> getComboExpenseType();
	
	// Search data of income 
	List<ExpenseListDto> getSearchExpense(
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate,
			@Param("expCode") String expCode,
			@Param("currentPage") int currentPage,
			@Param("numPerPage") int numPerPage
	);

}
