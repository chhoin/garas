package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CustomerDao;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.service.CustomerService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Integer save(CustomerDto CustomerDto) {
		return customerDao.save(CustomerDto);
	}




}
