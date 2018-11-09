package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.GainLossDao;
import com.smart.garas.dto.GainLossDto;
import com.smart.garas.service.GainLossService;

@Service
@Transactional(rollbackFor = Exception.class)
public class GainLossServiceImpl implements GainLossService {
	@Autowired
	private GainLossDao gainLossDao;

	@Override
	public List<GainLossDto> getSearchGainLoss(Date fDate, Date tDate) {
		return gainLossDao.getSearchGainLoss(fDate, tDate);
	}

}
