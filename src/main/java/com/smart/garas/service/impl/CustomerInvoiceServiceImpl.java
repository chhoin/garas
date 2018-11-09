package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CustomerInvoiceDao;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.service.CustomerInvoiceService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerInvoiceServiceImpl implements CustomerInvoiceService {
	@Autowired
	private CustomerInvoiceDao customerInvoiceDao;

	@Override
	public Integer save(CustomerInvoiceDto customerInvoiceDto) {
		return customerInvoiceDao.save(customerInvoiceDto);
	}

	@Override
	public List<CustomerInvoiceDto> getAll() {
		return customerInvoiceDao.getAll();
	}

	// get data to combo box of Customer Invoice
	@Override
	public List<CustomerCaptureDto> getComboCusInvoice() {
		return customerInvoiceDao.getComboCusInvoice();
	}

	// get combo of name and phone
	@Override
	public List<CustomerCaptureDto> getComboCusName(String name) {
		return customerInvoiceDao.getComboCusName(name);
	}

}
