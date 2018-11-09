package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CustomerCaptureDao;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CarDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.CustomerCaptureService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerCaptureServiceImpl implements CustomerCaptureService {
	@Autowired
	private CustomerCaptureDao customerCaptureDao;

	@Override
	public List<CustomerCaptureDto> getCusCapInvoiceNoCode() {
		return customerCaptureDao.getCusCapInvoiceNoCode();
	}

	@Override
	public List<CustomerDto> getComboCustomerCode() {
		return customerCaptureDao.getComboCustomerCode();
	}

	@Override
	public List<CustomerDto> getComboCustomerInfo(String custCode) {
		return customerCaptureDao.getComboCustomerInfo(custCode);
	}

	@Override
	public List<CaptureDto> getComboInvoiceCode() {
		return customerCaptureDao.getComboInvoiceCode();
	}

	@Override
	public List<CaptureListDto> getComboInvoiceInfo(String invoiceNo) {
		return customerCaptureDao.getComboInvoiceInfo(invoiceNo);
	}

	@Override
	public List<CaptureListDto> getComboCategoryByInvoiceImp(String invoiceNo) {
		return customerCaptureDao.getComboCategoryByInvoiceImp(invoiceNo);
	}

	@Override
	public List<CaptureListDto> getComboProdTypeByInvoiceImp(String invoiceNo, String cateCode) {
		return customerCaptureDao.getComboProdTypeByInvoiceImp(invoiceNo, cateCode);
	}

	@Override
	public List<UnitDto> getComboUnit() {
		return customerCaptureDao.getComboUnit();
	}

	@Override
	public List<CarDto> getCar() {
		return customerCaptureDao.getCar();
	}

	@Override
	public List<CarDto> getCarInfo(String carCode) {
		return customerCaptureDao.getCarInfo(carCode);
	}

	@Override
	public List<CurrencyDto> getComboCcy() {
		return customerCaptureDao.getComboCcy();
	}

	@Override
	public Integer save(CustomerCaptureDto customerCaptureDto) {
		return customerCaptureDao.save(customerCaptureDto);
	}
	
}

