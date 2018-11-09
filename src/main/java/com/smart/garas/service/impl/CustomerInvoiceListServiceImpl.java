package com.smart.garas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CustomerInvoiceListDao;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CustomerInvoiceListDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.PaymentListDto;
import com.smart.garas.service.CustomerInvoiceListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerInvoiceListServiceImpl implements CustomerInvoiceListService {
	@Autowired
	private CustomerInvoiceListDao customerInvoiceListDao;

	@Override
	public List<CustomerCaptureDto> getComboInvoiceExp() {
		return customerInvoiceListDao.getComboInvoiceExp();
	}

	@Override
	public List<CustomerDto> getComboCustomerName() {
		return customerInvoiceListDao.getComboCustomerName();
	}

	@Override
	public List<CustomerDto> getComboCustomerPhone() {
		return customerInvoiceListDao.getComboCustomerPhone();
	}

	@Override
	public List<CustomerInvoiceListDto> getSearchCustomerInvoiceList(Date fromDate, Date toDate, String statusAmt,
			String exptCode, String custCode, String phone, int currentPage, int numPerPage) {
		return customerInvoiceListDao.getSearchCustomerInvoiceList(fromDate, toDate, statusAmt, exptCode, custCode, phone, currentPage, numPerPage);
	}

	@Override
	public List<PaymentListDto> getSearchCustomerPayment(String invoiceNo) {
		return customerInvoiceListDao.getSearchCustomerPayment(invoiceNo);
	}

	@Override
	public List<CustomerInvoiceListDto> getListOfCustomerBuyProduct(String exptCode) {
		return customerInvoiceListDao.getListOfCustomerBuyProduct(exptCode);
	}

	@Override
	public Integer save(PaymentDto paymentDto) {
		return customerInvoiceListDao.save(paymentDto);
	}

}
