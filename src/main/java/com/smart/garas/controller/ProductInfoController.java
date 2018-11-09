package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.ProductInfoService;

@Controller
public class ProductInfoController {
	@Autowired
	private ProductInfoService productInfoService;
	
	// show page product
	@RequestMapping("/productinfo")
	public String getProductPage(){
		return "productinfo";
	}
	
	// get data combo of category code
	@RequestMapping(value="/api/productinfocombocategory", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getComCategoryCodes(){
		return productInfoService.getComCategoryCode();
	}
	
	// get data combo of unit code 
	@RequestMapping(value="/api/productinfocombounit", method = RequestMethod.GET)
	@ResponseBody
	public List<UnitDto> getUnitCodes(){
		return productInfoService.getUnitCode();
	}
	
	// check duplicate data
	@RequestMapping(value="/api/productinfosave/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkDuplicatData(@RequestParam String prodName){
		return productInfoService.countById(prodName) != 0;
	}
	
	// save data into database
	@RequestMapping(value="/api/productinfosave", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody ProductInfoDto productInfoDto){
		return productInfoService.save(productInfoDto);
	}

}
