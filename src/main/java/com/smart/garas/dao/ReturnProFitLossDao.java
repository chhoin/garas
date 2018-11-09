package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.ReturnProFitLossDto;

@Repository
public interface ReturnProFitLossDao {
	// get list data from database  
	List<ReturnProFitLossDto> getAll();
	
	// get combo of invoice supplier stock caputre
	List<ReturnProFitLossDto> getComBoReturnProFitLoss();
	
	// Search
	List<ReturnProFitLossDto> getSearchReturnProFitLoss(
			@Param("p_DATE_FROM") Date fDate,
			@Param("p_DATE_TO") Date tDate,
			@Param("p_INVOICE_NO") String numInvoice
	);
	
	/*
	 * p_DATE_FROM
	   p_DATE_TO
	   p_INVOICE_NO
	 */

}
