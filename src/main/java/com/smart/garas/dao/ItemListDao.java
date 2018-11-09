package com.smart.garas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;

@Repository
public interface ItemListDao {
	int save(ItemDto item);
	List<ItemDto> getAll();
	int countById(@Param("cur_NAME") String name);
	
	int editById(ItemDto item);
	int deleteById(@Param("cat_ITEM_CODE") String id);
	
	List<ItemDto> getPageable(PageableDto pageable);
	int getRecords();
	
	List<ItemDto> getListByCode(@Param("cat_ITEM_NAME") String code);
	
	// get data to combo box
	List<ItemDto> getComboItem();

}
