package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ReturnProFitLossDao;
import com.smart.garas.dto.ReturnProFitLossDto;
import com.smart.garas.service.ReturnProFitLossService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ReturnProFitLossServiceImpl implements ReturnProFitLossService {
	@Autowired
	private ReturnProFitLossDao returnProFitLossDao;

	@Override
	public List<ReturnProFitLossDto> getAll() {
		return returnProFitLossDao.getAll();
	}

	@Override
	public List<ReturnProFitLossDto> getComBoReturnProFitLoss() {
		return returnProFitLossDao.getComBoReturnProFitLoss();
	}

	@Override
	public List<ReturnProFitLossDto> getSearchReturnProFitLoss(Date fDate, Date tDate, String numInvoice) {
		return returnProFitLossDao.getSearchReturnProFitLoss(fDate, tDate, numInvoice);
	}

}
