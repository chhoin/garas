package com.smart.garas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.CustomFieldDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.ItemDto;

/**
 * 
 * @author tha.bunsath
 *
 */
@Repository
public interface ComboBoxCustomDao {	
	/*get data to combo box*/
	List<CategoryDto> getDataToCombo();
	List<CurrencyDto> getDataCurrencyBox();
	List<ItemDto> getComboboxItems();
	List<CustomFieldDto> getComboBoxNumInputProduct();
	List<CustomFieldDto> findProductNameByProductType(@Param("categories_CODE") String categories_CODE);
	List<CustomFieldDto> findimport_number(@Param("categories_CODE")String categories_CODE, @Param("cat_ITEM_CODE") String cat_ITEM_CODE);
	CustomFieldDto findProduceByImportNumber(@Param("categories_CODE")String categories_CODE, @Param("cat_ITEM_CODE")String cat_ITEM_CODE, @Param("import_NUM")String import_NUM);
	CustomerDto findCustomerPhoneNumber(@Param("cus_ID") String cus_ID);
	List<CustomFieldDto> getComboBoxStockCurrent();

}
