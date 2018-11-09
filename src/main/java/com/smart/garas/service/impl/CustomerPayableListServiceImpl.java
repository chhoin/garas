package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CustomerPayableListDao;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceDto;
import com.smart.garas.dto.CustomerPayableListDto;
import com.smart.garas.service.CustomerPayableListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerPayableListServiceImpl implements CustomerPayableListService {
	@Autowired
	private CustomerPayableListDao customerPayableListDao;

	@Override
	public List<CustomerPayableListDto> getAll() {
		return customerPayableListDao.getAll();
	}

	@Override
	public List<CustomerInvoiceDto> getComboCustomerInvoice() {
		return customerPayableListDao.getComboCustomerInvoice();
	}

	@Override
	public List<CustomerDto> getCustomerNamePhone() {
		return customerPayableListDao.getCustomerNamePhone();
	}

	@Override
	public List<CustomerPayableListDto> getSearchCusPayList(Date fDate, Date tDate, String numInvoice, String cusname,
			String cusphone) {
		return customerPayableListDao.getSearchCusPayList(fDate, tDate, numInvoice, cusname, cusphone);
	}

}
