package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.SmartDao;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.SmartDto;
import com.smart.garas.service.SmartService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SmartServiceImpl implements SmartService {
	
	@Autowired
	private SmartDao smartDao;

	@Override
	public Integer save(SmartDto smart) {
		return smartDao.save(smart);
	}

	@Override
	public List<SmartDto> getAll() {
		return smartDao.getAll();
	}

	@Override
	public Integer countById(String id) {
		return smartDao.countById(id);
	}

	@Override
	public Integer editById(SmartDto smart) {
		return smartDao.editById(smart);
	}

	@Override
	public Integer deleteById(String id) {
		return smartDao.deleteById(id);
	}

	@Override
	public List<SmartDto> getPageable(PageableDto pageable) {
		return smartDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return smartDao.getRecords();
	}

	// Search
	@Override
	public List<SmartDto> getListByCode(Date fromDate, Date toDate, String code) {
		return smartDao.getListByCode(fromDate, toDate, code);
	}
	
}
