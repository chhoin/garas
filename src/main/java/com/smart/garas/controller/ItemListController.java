package com.smart.garas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.service.ItemListService;

@Controller
public class ItemListController {
	@Autowired
	private ItemListService itemListService;
	
	// get Item List page
	@RequestMapping("/itemlist")
	public String getItemListPage(){
		return "itemlist";
	}
	
	// get data all from database
	@RequestMapping(value="/api/itemlists", method = RequestMethod.GET)
	@ResponseBody
	public List<ItemDto> getData(){
		return itemListService.getAll();
	}
	
	// get data to combo box
	@RequestMapping(value="/api/itemlistcombos", method = RequestMethod.GET)
	@ResponseBody
	public List<ItemDto> getDataCombo(){
		return itemListService.getComboItem();
	}
	
	// search by name and code
	@RequestMapping(value="/api/itemlistsbycode/{cat_ITEM_NAME}", method = RequestMethod.GET)
	@ResponseBody
	public List<ItemDto> getSearchListByCode(@PathVariable String cat_ITEM_NAME){
		return itemListService.getListByCode(cat_ITEM_NAME);
	}
	
	/* edit data by code*/
	@RequestMapping(value="/api/itemlists/{cat_ITEM_CODE}", method = RequestMethod.PUT)
	@ResponseBody
	public int editItemList(@RequestBody ItemDto item, @PathVariable String cat_ITEM_CODE){
		item.setCat_ITEM_CODE(cat_ITEM_CODE);
		return itemListService.editById(item);
	}
	
	/*delete data by code*/
	@RequestMapping(value="/api/itemlistsdelete/{cat_ITEM_CODE}", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteItemList(@PathVariable String cat_ITEM_CODE){
		return itemListService.deleteById(cat_ITEM_CODE);
	}
	

}
