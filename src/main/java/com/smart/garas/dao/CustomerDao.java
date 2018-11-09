package com.smart.garas.dao;

import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CustomerDto;

@Repository
public interface CustomerDao {
	// Save data into database
	Integer save(CustomerDto CustomerDto);
	
}
