package com.smart.garas.service;

import com.smart.garas.dto.CustomerDto;

public interface CustomerService {
	
	// Save data into database
	Integer save(CustomerDto CustomerDto);
	
}
