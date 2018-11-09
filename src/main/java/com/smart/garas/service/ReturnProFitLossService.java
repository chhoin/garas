package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.ReturnProFitLossDto;

public interface ReturnProFitLossService {
	// get list data from database 
	List<ReturnProFitLossDto> getAll();
	
	// get combo of invoice supplier stock caputre
	List<ReturnProFitLossDto> getComBoReturnProFitLoss();
	
	// Search
	List<ReturnProFitLossDto> getSearchReturnProFitLoss(
			Date fDate,
			Date tDate,
			String numInvoice
	);

}
