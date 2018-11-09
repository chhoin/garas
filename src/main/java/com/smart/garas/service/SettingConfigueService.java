package com.smart.garas.service;

import com.smart.garas.dto.SettingConfigueDto;

public interface SettingConfigueService {
	int save(SettingConfigueDto settingConfigueDto);
	int update(SettingConfigueDto settingConfigueDto);
	SettingConfigueDto getSettingCofigueByCode(String stcg_code);
}
