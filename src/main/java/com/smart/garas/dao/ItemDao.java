package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;

@Repository
public interface ItemDao {
	int save(ItemDto item);
	List<ItemDto> getAll();
	int countById(@Param("cat_ITEM_NAME") String name);
	
	int editById(ItemDto item);
	int deleteById(@Param("code") String id);
	
	List<ItemDto> getPageable(PageableDto pageable);
	int getRecords();
	
	// get data to combo box
	List<ItemDto> getListByCode(@Param("code") String id);
	
	// get combo box of categories
	List<CategoryDto> getComboCategories();
    ItemDto getItemByItemCode(@Param("cat_ITEM_CODE") String cat_ITEM_CODE);
}
