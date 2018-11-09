package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.ItemListDao;
import com.smart.garas.dto.ItemDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.service.ItemListService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ItemListServiceImpl implements ItemListService {
	@Autowired
	private ItemListDao itemListDao;

	@Override
	public int save(ItemDto item) {
		return itemListDao.save(item);
	}

	@Override
	public List<ItemDto> getAll() {
		return itemListDao.getAll();
	}

	@Override
	public int countById(String name) {
		return itemListDao.countById(name);
	}

	@Override
	public int editById(ItemDto item) {
		return itemListDao.editById(item);
	}

	@Override
	public int deleteById(String id) {
		return itemListDao.deleteById(id);
	}

	@Override
	public List<ItemDto> getPageable(PageableDto pageable) {
		return itemListDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return itemListDao.getRecords();
	}

	@Override
	public List<ItemDto> getListByCode(String code) {
		return itemListDao.getListByCode(code);
	}

	@Override
	public List<ItemDto> getComboItem() {
		return itemListDao.getComboItem();
	}

}
