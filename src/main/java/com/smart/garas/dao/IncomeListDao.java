package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.IncomeDto;
import com.smart.garas.dto.IncomeListDto;

@Repository
public interface IncomeListDao {
	// get combo of income type
	List<IncomeDto> getComboIncomeType();
	
	// Search data of income 
	List<IncomeListDto> getSearchIncome(
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate,
			@Param("incomeCode") String incomeCode,
			@Param("currentPage") int currentPage,
			@Param("numPerPage") int numPerPage
	);

}
