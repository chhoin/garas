package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PageableDto;

public interface CurrencyListService {
	int save(CurrencyDto currency);
	List<CurrencyDto> getAll();
	int countById(String name);
	int editById(CurrencyDto currency);
	int deleteById(String name);
	
	List<CurrencyDto> getPageable(PageableDto pageable);
	int getRecords();
	
	/*get data by name*/
	List<CurrencyDto> getListByCode(String name);
	
	/*get data to combo box*/
	List<CurrencyDto> getDataToCombo();
}
