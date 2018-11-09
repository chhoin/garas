package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ItemDao;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.service.ItemService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;

	@Override
	public int save(ItemDto item) {
		return itemDao.save(item);
	}

	@Override
	public List<ItemDto> getAll() {
		return itemDao.getAll();
	}

	@Override
	public int countById(String name) {
		return itemDao.countById(name);
	}

	@Override
	public int editById(ItemDto item) {
		return itemDao.editById(item);
	}

	@Override
	public int deleteById(String id) {
		return itemDao.deleteById(id);
	}

	@Override
	public List<ItemDto> getPageable(PageableDto pageable) {
		return itemDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return itemDao.getRecords();
	}

	@Override
	public List<ItemDto> getListByCode(String id) {
		return itemDao.getListByCode(id);
	}

	@Override
	public List<CategoryDto> getComboCategories() {
		return itemDao.getComboCategories();
	}

	@Override
	public ItemDto getItemByItemCode(String cat_ITEM_CODE) {
	
		return itemDao.getItemByItemCode(cat_ITEM_CODE);
	}



	

}
