package com.smart.garas.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.SettingConfigueDto;

@Repository
public interface SettingConfigueDao {
	int save(SettingConfigueDto settingConfigueDto);
	int update(SettingConfigueDto settingConfigueDto);
	SettingConfigueDto getSettingCofigueByCode(@Param("stcg_code") String stcg_code);

}
