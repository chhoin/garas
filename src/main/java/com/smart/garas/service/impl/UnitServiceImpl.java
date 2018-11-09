package com.smart.garas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smart.garas.dao.UnitDao;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.UnitService;

@Service
@Transactional(rollbackFor = Exception.class)
public class UnitServiceImpl implements UnitService {
	@Autowired
	private UnitDao unitDao;

	@Override
	public Integer save(UnitDto unit) {
		return unitDao.save(unit);
	}

	@Override
	public List<UnitDto> getAll() {
		return unitDao.getAll();
	}

	@Override
	public Integer countById(String name) {
		return unitDao.countById(name);
	}

	@Override
	public int editById(UnitDto unit) {
		return unitDao.editById(unit);
	}

	@Override
	public int deleteById(String name) {
		return unitDao.deleteById(name);
	}

	@Override
	public List<UnitDto> getPageable(PageableDto pageable) {
		return unitDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return unitDao.getRecords();
	}

}
