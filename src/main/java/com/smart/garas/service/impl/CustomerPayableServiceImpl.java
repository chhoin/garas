package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CustomerPayableDao;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableDto;
import com.smart.garas.service.CustomerPayableService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerPayableServiceImpl implements CustomerPayableService {
	@Autowired
	private CustomerPayableDao customerPayableDao;

	@Override
	public Integer save(CustomerPayableDto customerPayableDto) {
		return customerPayableDao.save(customerPayableDto);
	}

	@Override
	public List<CustomerPayableDto> getAll() {
		return customerPayableDao.getAll();
	}

	@Override
	public List<CustomerInvoiceDto> getComboCusPayInvoice(String name) {
		return customerPayableDao.getComboCusPayInvoice(name);
	}

	@Override
	public List<CustomerInvoiceDto> getComboCPayInvoice() {
		return customerPayableDao.getComboCPayInvoice();
	}

	
}
