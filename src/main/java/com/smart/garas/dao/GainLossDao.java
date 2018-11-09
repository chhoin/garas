package com.smart.garas.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.GainLossDto;

@Repository
public interface GainLossDao {
	
	// Search
	List<GainLossDto> getSearchGainLoss(
			@Param("p_DATE_FROM") Date fDate,
			@Param("p_DATE_TO") Date tDate
	);

}