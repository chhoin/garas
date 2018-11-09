package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PageableDto;

public interface CurrencyService {
	Integer save(CurrencyDto currency);
	List<CurrencyDto> getAll();
	int countById(String name);
	int editById(CurrencyDto currency);
	int deleteById(String id);
	List<CurrencyDto> getPageable(PageableDto pageable);
	int getRecords();
	List<CurrencyDto> getListByCode(String id);
	/**
	 * @author tha.bunsath
	 */
	CurrencyDto getCurrencyByID(String cur_ID);
	
}
