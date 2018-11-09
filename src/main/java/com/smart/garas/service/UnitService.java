package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.UnitDto;

public interface UnitService {
	Integer save(UnitDto unit);
	List<UnitDto> getAll();
	Integer countById(String name);
	int editById(UnitDto unit);
	int deleteById(String name);
	
	List<UnitDto> getPageable(PageableDto pageable);
	int getRecords();

}
