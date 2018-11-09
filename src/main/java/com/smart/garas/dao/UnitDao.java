package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.UnitDto;

@Repository
public interface UnitDao {
	Integer save(UnitDto unit);
	List<UnitDto> getAll();
	Integer countById(@Param("unit_NAME") String name);
	
	int editById(UnitDto unit);
	int deleteById(@Param("unit_CODE") String name);
	
	List<UnitDto> getPageable(PageableDto pageable);
	int getRecords();

}
