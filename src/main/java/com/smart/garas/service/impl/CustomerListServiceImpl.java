package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smart.garas.dao.CustomerListDao;
import com.smart.garas.dto.CustomerListDto;
import com.smart.garas.service.CustomerListService;

@Service
public class CustomerListServiceImpl implements CustomerListService {
	@Autowired
	private CustomerListDao customerListDao;

	@Override
	public List<CustomerListDto> getSearchCustomer(String custCode, String phone, String address, int currentPage, int numPerPage) {
		return customerListDao.getSearchCustomer(custCode, phone, address, currentPage, numPerPage);
	}

	@Override
	public Integer deleteById(String custCode) {
		return customerListDao.deleteById(custCode);
	}

	@Override
	public List<CustomerListDto> getCustomerComboName() {
		return customerListDao.getCustomerComboName();
	}

	@Override
	public List<CustomerListDto> getCustomerComboPhone() {
		return customerListDao.getCustomerComboPhone();
	}

	@Override
	public List<CustomerListDto> getCustomerComboVillage() {
		return customerListDao.getCustomerComboVillage();
	}

	@Override
	public List<CustomerListDto> getCountTotalPage(String custCode, String phone, String address) {
		return customerListDao.getCountTotalPage(custCode, phone, address);
	}

}
