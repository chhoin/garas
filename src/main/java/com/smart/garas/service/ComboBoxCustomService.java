package com.smart.garas.service;

import java.util.List;

import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.CustomFieldDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.ItemDto;

/**
 * 
 * @author tha.bunsath
 *
 */
public interface ComboBoxCustomService {
	List<CategoryDto> getDataToCombo();
	public List<CurrencyDto> getDataCurrencyBox();
	public List<ItemDto> getComboboxItems();
	List<CustomFieldDto> getComboBoxNumInputProduct();
	List<CustomFieldDto> findProductNameByProductType(String categories_CODE);
	List<CustomFieldDto> findimport_number(String categories_CODE, String cat_ITEM_CODE);
    CustomFieldDto findProduceByImportNumber(String categories_CODE, String cat_ITEM_CODE, String import_NUM);
    CustomerDto findCustomerPhoneNumber(String cus_ID);
    List <CustomFieldDto> getComboBoxStockCurrent();
    

}
