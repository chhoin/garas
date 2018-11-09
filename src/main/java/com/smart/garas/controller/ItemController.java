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
import com.smart.garas.dto.ItemDto;
import com.smart.garas.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	// get item page 
	@RequestMapping("/item")
	public String getItemPage(){
		return "item";
	}
	
	// get data all
	@RequestMapping(value="/api/items", method = RequestMethod.GET)
	@ResponseBody
	public List<ItemDto> getData(){
		return itemService.getAll();
	}
	
	// get data to combo box
	@RequestMapping(value="/api/itemcombos", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getDataCombo(){
		return itemService.getComboCategories();
	}
	
	// check duplicate data
	@RequestMapping(value="/api/items/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkItem(@RequestParam String name){
		return itemService.countById(name) !=0;
	}
	
	// save data
	@RequestMapping(value="/api/items", method = RequestMethod.POST)
	@ResponseBody
	public int save(@RequestBody ItemDto item){
		return itemService.save(item);
	}
	

}
