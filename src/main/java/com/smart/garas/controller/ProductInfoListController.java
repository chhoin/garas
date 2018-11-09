package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.ProductInfoListDto;
import com.smart.garas.service.ProductInfoListService;

@Controller
public class ProductInfoListController {
	@Autowired
	private ProductInfoListService productInfoListService;
	
	// Show Product InfoList Page
	@RequestMapping("/productinfolist")
	public String getProductInfoListPage(){
		return "productinfolist";
	}
	
	// Search data Product Info
	@RequestMapping(value="/api/productinfolists/{prodCode},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductInfoListDto> getSearchProductInfoLists(
				@PathVariable String prodCode,
				@PathVariable int currentPage,
				@PathVariable int numPerPage
			)
	{
		return productInfoListService.getSearchProductInfoList(prodCode, currentPage, numPerPage);
	}
	
	// delete data
	@RequestMapping(value="/api/productinfodelete/{prodCode}", method = RequestMethod.DELETE)
	@ResponseBody
	public Integer deleteByIds(@PathVariable String prodCode){
		return productInfoListService.deleteById(prodCode);
	}
	
	// get data to combo box
	@RequestMapping(value="/api/productinfocomboname", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductInfoListDto> getComboProductInfoNames(){
		return productInfoListService.getComboProductInfoName();
	}

}
