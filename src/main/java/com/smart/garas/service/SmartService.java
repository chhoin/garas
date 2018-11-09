package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.SmartDto;

public interface SmartService {
	Integer save(SmartDto smart);
	List<SmartDto> getAll();
	Integer countById(String id);
	Integer editById(SmartDto smart);
	Integer deleteById(String id);
	
	List<SmartDto> getPageable(PageableDto pageable);
	int getRecords();
	
	// Search 
	List<SmartDto> getListByCode(Date fromDate, Date toDate, String code);
}
