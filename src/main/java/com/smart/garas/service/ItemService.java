package com.smart.garas.service;

import java.util.List;

import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;

public interface ItemService {
	int save(ItemDto item);
	List<ItemDto> getAll();
	int countById(String name);
	int editById(ItemDto item);
	int deleteById(String id);
	
	List<ItemDto> getPageable(PageableDto pageable);
	int getRecords();
	
	List<ItemDto> getListByCode(String id);
	
	// get combo of categories
	List<CategoryDto> getComboCategories();
	ItemDto getItemByItemCode(String cat_ITEM_CODE);

}
