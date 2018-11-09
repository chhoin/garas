package com.smart.garas.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.LogInDto;

@Repository
public interface LogInDao {
	LogInDto getByUsername(@Param("username") String username);
}
