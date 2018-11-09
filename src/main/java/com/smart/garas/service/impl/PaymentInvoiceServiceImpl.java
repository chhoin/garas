package com.smart.garas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smart.garas.dao.PaymentInvoiceDao;
import com.smart.garas.dto.PaymentInvoiceDto;
import com.smart.garas.service.PaymentInvoiceService;
@Service
@Transactional(rollbackFor = Exception.class)
public class PaymentInvoiceServiceImpl implements PaymentInvoiceService {
	@Autowired
	PaymentInvoiceDao paymentInvoiceDao;

	@Override
	public int savePaymentInvoice(PaymentInvoiceDto paymentInvoiceDto) {
	
		return paymentInvoiceDao.savePaymentInvoice(paymentInvoiceDto);
	}

}
