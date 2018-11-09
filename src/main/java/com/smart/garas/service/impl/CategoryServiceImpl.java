package com.smart.garas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.garas.dao.CategoryDao;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.PageableDto;
import com.smart.garas.service.CategoryService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public Integer save(CategoryDto category) {
		return categoryDao.save(category);
	}

	@Override
	public List<CategoryDto> getAll() {
		return categoryDao.getAll();
	}

	@Override
	public int countById(String name) {
		return categoryDao.countById(name);
	}

	@Override
	public int editById(CategoryDto category) {
		return categoryDao.editById(category);
	}

	@Override
	public int deleteById(String name) {
		return categoryDao.deleteById(name);
	}

	@Override
	public List<CategoryDto> getPageable(PageableDto pageable) {
		return categoryDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return categoryDao.getRecords();
	}

	@Override
	public CategoryDto getCategoryByCode(String categories_CODE) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryByCode(categories_CODE);
	}

}
