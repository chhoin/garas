package com.smart.garas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PageableDto;

@Repository
public interface CurrencyDao {
	Integer save(CurrencyDto currency);
	List<CurrencyDto> getAll();
	int countById(@Param("cur_NAME") String name);
	
	int editById(CurrencyDto currency);
	int deleteById(@Param("code") String id);
	
	List<CurrencyDto> getPageable(PageableDto pageable);
	int getRecords();
	
	List<CurrencyDto> getListByCode(@Param("code") String id);
	CurrencyDto getCurrencyByID(@Param("cur_ID") String cur_ID);
	
}
