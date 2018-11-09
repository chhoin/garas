package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.ProductDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product")
	public String getProductPage(){
		return "product";
	}
	
	@RequestMapping(value="/api/products", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody ProductDto product){
		return productService.save(product);
	}
	
	@RequestMapping(value="/api/products", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductDto> getData(){
		return productService.getAll();
	}
	
	/*get data combo box of categories */
	@RequestMapping(value="/api/procombocategorys", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getDataToCombo(){
		return productService.getComboCategories();
	}
	
	/*get data combo box of item */
	@RequestMapping(value="/api/procomboitems/{categories_NAME}", method = RequestMethod.GET)
	@ResponseBody
	public List<ItemDto> getDataToComboItem(@PathVariable String categories_NAME){
		return productService.getComboItem(categories_NAME);
	}
	
	/*get data combo box of unit */
	@RequestMapping(value="/api/procombounits", method = RequestMethod.GET)
	@ResponseBody
	public List<UnitDto> getDataToComboUnit(){
		return productService.getComboUnit();
	}
	
	/*get data combo box of currency */
	@RequestMapping(value="/api/procombocurrencys", method = RequestMethod.GET)
	@ResponseBody
	public List<UnitDto> getDataToComboCurrency(){
		return productService.getComboCurrency();
	}
	
	@RequestMapping(value="/api/products/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkCurrency(@RequestParam String st_NAME){
		return productService.countById(st_NAME) !=0;
	}

}
