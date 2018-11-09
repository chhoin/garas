package com.smart.garas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
 *
 */
@Controller
public class ComboBoxCustomController {
	@Autowired
	private ComboBoxCustomService comboBoxCustomService;
	
	/*get data to combo box*/
	@RequestMapping(value="/api/categoryscombos", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getDataToCombo(){
		return comboBoxCustomService.getDataToCombo();
	}
	@RequestMapping(value="/api/customerCaptureCurrency", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getDataCurrencyBox(){
		return comboBoxCustomService.getDataCurrencyBox();
	}

	/**
	 * 
	 * @author tha.bunsath
	 */
	@RequestMapping(value="/api/comboboxItems", method = RequestMethod.GET)
	@ResponseBody
	public List<ItemDto> getComboboxItem(){		
		return comboBoxCustomService.getComboboxItems();
	}
	/**
	 * 
	 * @author tha.bunsath
	 */
	@RequestMapping(value="/api/comboBoxNumInputProducts", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomFieldDto> getComboBoxNumInputProducts(){	
		return comboBoxCustomService.getComboBoxNumInputProduct();
	}
	
	@RequestMapping(value="/api/findProductNameByProductType", method = RequestMethod.POST)
	@ResponseBody
	public List<CustomFieldDto> findProductNameByProductType(@RequestBody CustomFieldDto customer){
		String categories_CODE = customer.getCategories_CODE();
		return comboBoxCustomService.findProductNameByProductType(categories_CODE)	;
		}
	
	@RequestMapping(value="/api/findimport_NUM", method = RequestMethod.POST)
	@ResponseBody
	public List<CustomFieldDto> findimport_number(@RequestBody CustomFieldDto customer){
		String categories_CODE = customer.getCategories_CODE();
		String cat_ITEM_CODE = customer.getCat_ITEM_CODE();
		return comboBoxCustomService.findimport_number(categories_CODE, cat_ITEM_CODE)	;
		}
	
	@RequestMapping(value="/api/findProductNumInput", method = RequestMethod.POST)
	@ResponseBody
	public CustomFieldDto findProduceByImportNumber(@RequestBody CustomFieldDto capture){
		String productType = "";
		String productName = "";
		String import_NUM = "";
		CustomFieldDto customFieldDto = null;
		if(capture != null){
			
			productType = capture.getCategories_CODE();
			productName = capture.getCat_ITEM_CODE();
			import_NUM = capture.getImport_NUM();
			customFieldDto = comboBoxCustomService.findProduceByImportNumber(productType, productName, import_NUM);
		}
		return customFieldDto;
	}
	//
	@RequestMapping(value="/api/findCustomerPhoneNumber", method = RequestMethod.POST)
	@ResponseBody
	public CustomerDto findCustomerPhoneNumber(@RequestBody CustomerDto customerDto){
		
		if(customerDto != null){
			String cus_ID = customerDto.getCustCode();
			customerDto = comboBoxCustomService.findCustomerPhoneNumber(cus_ID);
		}
		return customerDto;
	}
	
	@RequestMapping(value="/api/comboBoxStockCurrent", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomFieldDto> getComboBoxStockCurrent(){	
		return comboBoxCustomService.getComboBoxStockCurrent();
	}
	
}
