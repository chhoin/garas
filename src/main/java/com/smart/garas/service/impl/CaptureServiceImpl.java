package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CaptureDao;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CarDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.CaptureService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CaptureServiceImpl implements CaptureService {
	@Autowired
	private CaptureDao captureDao;

	@Override
	public Integer save(CaptureDto capture) {
		return captureDao.save(capture);
	}

	@Override
	public List<SupplierDto> getComboSuppCompany() {
		return captureDao.getComboSuppCompany();
	}

	@Override
	public List<SupplierDto> getComboSuppName(String suppCode) {
		return captureDao.getComboSuppName(suppCode);
	}

	@Override
	public List<CategoryDto> getComboCategory() {
		return captureDao.getComboCategory();
	}

	@Override
	public List<ProductInfoDto> getComboCategoryInfo(String cateCode) {
		return captureDao.getComboCategoryInfo(cateCode);
	}

	@Override
	public List<CurrencyDto> getComboCcy() {
		return captureDao.getComboCcy();
	}

	@Override
	public List<UnitDto> getComboUnit(String unitType) {
		return captureDao.getComboUnit(unitType);
	}

	@Override
	public Integer saveImportPayment(PaymentDto paymentDto) {
		return captureDao.saveImportPayment(paymentDto);
	}

	@Override
	public List<CaptureListDto> getSearchCapturePrint(String invoiceNo, String curCode) {
		return captureDao.getSearchCapturePrint(invoiceNo, curCode);
	}

	@Override
	public List<CarDto> getCarNum() {
		return captureDao.getCarNum();
	}

	@Override
	public List<CarDto> getDriverName(String carCode) {
		return captureDao.getDriverName(carCode);
	}

}
