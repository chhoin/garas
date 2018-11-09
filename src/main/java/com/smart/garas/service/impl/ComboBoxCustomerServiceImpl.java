package com.smart.garas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smart.garas.dao.ComboBoxCustomDao;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.CustomFieldDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.service.ComboBoxCustomService;

/**
 * 
 * @author tha.bunsath
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ComboBoxCustomerServiceImpl implements ComboBoxCustomService {
	@Autowired
	private ComboBoxCustomDao comboBoxCustomDao;
	@Override
	public List<CategoryDto> getDataToCombo() {
		return comboBoxCustomDao.getDataToCombo();
	}
	
	@Override
	public List<CurrencyDto> getDataCurrencyBox() {
		// TODO Auto-generated method stub
		return comboBoxCustomDao.getDataCurrencyBox();
	}
	@Override
	public List<ItemDto> getComboboxItems() {
		return comboBoxCustomDao.getComboboxItems();
	}
	@Override
	public List<CustomFieldDto> getComboBoxNumInputProduct() {
		// TODO Auto-generated method stub
		return comboBoxCustomDao.getComboBoxNumInputProduct();
	}
	@Override
	public List<CustomFieldDto> findProductNameByProductType(String categories_CODE) {
		// TODO Auto-generated method stub
		return comboBoxCustomDao.findProductNameByProductType(categories_CODE);
	}
	@Override
	public List<CustomFieldDto> findimport_number(String categories_CODE, String cat_ITEM_CODE) {
		// TODO Auto-generated method stub
		return comboBoxCustomDao.findimport_number(categories_CODE, cat_ITEM_CODE);
	}
	@Override
	public CustomFieldDto findProduceByImportNumber(String categories_CODE, String cat_ITEM_CODE, String import_NUM) {
		// TODO Auto-generated method stub
		return comboBoxCustomDao.findProduceByImportNumber(categories_CODE, cat_ITEM_CODE, import_NUM);
	}
	@Override
	public CustomerDto findCustomerPhoneNumber(String cus_ID) {
		// TODO Auto-generated method stub
		return comboBoxCustomDao.findCustomerPhoneNumber(cus_ID);
	}
	@Override
	public List<CustomFieldDto> getComboBoxStockCurrent() {
		// TODO Auto-generated method stub
		return comboBoxCustomDao.getComboBoxStockCurrent();
	}
	
}
