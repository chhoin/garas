package com.smart.garas.dao;

import org.springframework.stereotype.Repository;

import com.smart.garas.dto.PaymentInvoiceDto;

@Repository
public interface PaymentInvoiceDao {
	int savePaymentInvoice(PaymentInvoiceDto paymentInvoiceDto);

}
