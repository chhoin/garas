package com.smart.garas.service;

import java.util.List;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;

public interface ItemListService {
	int save(ItemDto item);
	List<ItemDto> getAll();
	int countById(String name);
	int editById(ItemDto item);
	int deleteById(String id);
	
	List<ItemDto> getPageable(PageableDto pageable);
	int getRecords();
	
	List<ItemDto> getListByCode(String code);
	
	// get data to combo box
	List<ItemDto> getComboItem();

}
