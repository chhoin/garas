package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CustomerCaptureListDao;
import com.smart.garas.dto.CustomerCaptureListDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.service.CustomerCaptureListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerCaptureListServiceImpl implements CustomerCaptureListService {
	@Autowired
	private CustomerCaptureListDao customerCaptureListDao;

	@Override
	public List<CustomerCaptureListDto> getComboInvoiceExp() {
		return customerCaptureListDao.getComboInvoiceExp();
	}

	@Override
	public List<CustomerDto> getComboCustomerName() {
		return customerCaptureListDao.getComboCustomerName();
	}

	@Override
	public List<CustomerDto> getComboCustomerPhone() {
		return customerCaptureListDao.getComboCustomerPhone();
	}

	@Override
	public List<CustomerCaptureListDto> getSearchSaleProduct(Date fromDate, Date toDate, String exptCode,
			String custCode, String phone, String cateCode, int currentPage, int numPerPage) {
		return customerCaptureListDao.getSearchSaleProduct(fromDate, toDate, exptCode, custCode, phone, cateCode, currentPage, numPerPage);
	}

	@Override
	public List<CustomerCaptureListDto> getPrintInvoice(String exptCode) {
		return customerCaptureListDao.getPrintInvoice(exptCode);
	}
	
}
