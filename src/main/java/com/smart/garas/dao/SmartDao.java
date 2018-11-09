package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.SmartDto;

@Repository
public interface SmartDao {
	Integer save(SmartDto smart);
	List<SmartDto> getAll();
	Integer countById(@Param("code") String id);
	Integer editById(SmartDto smart);
	Integer deleteById(@Param("code") String id);
	
	List<SmartDto> getPageable(PageableDto pageable);
	int getRecords();
	
	// Search
	List<SmartDto> getListByCode(
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate,
			@Param("code") String code
	);
	
}
