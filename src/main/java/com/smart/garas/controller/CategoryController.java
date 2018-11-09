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
import com.smart.garas.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/category")
	public String getCagegoryPage(){
		return "category";
	}
	
	// save data
	@RequestMapping(value="/api/categorys", method = RequestMethod.POST)
	@ResponseBody
	public int save(@RequestBody CategoryDto category){
		return categoryService.save(category);
	}
	
	// get data all from database
	@RequestMapping(value="/api/categorys", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getData(){
		return categoryService.getAll();
	}
	
	// check duplicate data
	@RequestMapping(value="/api/categorys/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkCategory(@RequestParam String name){
		return categoryService.countById(name) !=0;
	}
	
	/*delete data by code*/
	@RequestMapping(value="/api/categorysdelete/{categories_CODE}", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteCategorys(@PathVariable String categories_CODE){
		return categoryService.deleteById(categories_CODE);
	}
	
}
