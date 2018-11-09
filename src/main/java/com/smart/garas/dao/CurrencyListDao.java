package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PageableDto;

@Repository
public interface CurrencyListDao {
	int save(CurrencyDto currency);
	List<CurrencyDto> getAll();
	int countById(@Param("cur_NAME") String name);
	
	int editById(CurrencyDto currency);
	int deleteById(@Param("cur_NAME") String name);
	
	List<CurrencyDto> getPageable(PageableDto pageable);
	int getRecords();
	
	/*get data by name*/
	List<CurrencyDto> getListByCode(@Param("cur_NAME") String name);
	
	
	/*get data to combo box*/
	List<CurrencyDto> getDataToCombo();
	
}
