package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smart.garas.dao.SettingConfigueDao;
import com.smart.garas.dto.SettingConfigueDto;
import com.smart.garas.service.SettingConfigueService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SettingConfigueServiceImpl implements SettingConfigueService {
	
	@Autowired
	private SettingConfigueDao settingConfigueDao;
	
	@Override
	public int save(SettingConfigueDto settingConfigueDto) {
		// TODO Auto-generated method stub
		return settingConfigueDao.save(settingConfigueDto);
	}

	@Override
	public int update(SettingConfigueDto settingConfigueDto) {
		return settingConfigueDao.update(settingConfigueDto);
	}
	@Override
	public SettingConfigueDto getSettingCofigueByCode(String stcg_code) {
		// TODO Auto-generated method stub
		return settingConfigueDao.getSettingCofigueByCode(stcg_code);
	}
	
	
}
