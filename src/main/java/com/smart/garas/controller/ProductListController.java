package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ProductDto;
import com.smart.garas.service.ProductListService;

@Controller
public class ProductListController {
	@Autowired
	private ProductListService productListService;
	
	/*show product page */
	@RequestMapping("/productlist")
	public String getProductListPage(){
		return "productlist";
	}
	
	/*get data all from data base */
	@RequestMapping(value="/api/productlists", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductDto> getData(){
		return productListService.getAll();
	}
	
	// search by name
	@RequestMapping(value="/api/productlistsbycode/{st_NAME}", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductDto> getSearchListByCode(@PathVariable String st_NAME){
		return productListService.getListByCode(st_NAME);
	}
	
	/*get data to combo box*/
	@RequestMapping(value="/api/productlistscombos", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getDataToCombo(){
		return productListService.getComboProducts();
	}
	
	/*delete data by code*/
	@RequestMapping(value="/api/productlistsdelete/{st_ID}", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteProductList(@PathVariable String st_ID){
		return productListService.deleteById(st_ID);
	}
	
}
