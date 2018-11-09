package com.smart.garas.service;

import java.util.Date;
import java.util.List;
import com.smart.garas.dto.GainLossDto;

public interface GainLossService {
	// Search
	List<GainLossDto> getSearchGainLoss(Date fDate, Date tDate);
}