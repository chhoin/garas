package com.smart.garas.dto;

import java.util.Date;

public class ItemDto {
	 private String auto_NUM;
	 private String categories_CODE;
	 private String categories_NAME;
	 private String cat_ITEM_CODE;
	 private String cat_ITEM_NAME;
	 private String descricption;
	 private String input_NAME;
	 private Date input_DATE;
	 
	public String getCategories_NAME() {
		return categories_NAME;
	}
	public void setCategories_NAME(String categories_NAME) {
		this.categories_NAME = categories_NAME;
	}
	public String getAuto_NUM() {
		return auto_NUM;
	}
	public void setAuto_NUM(String auto_NUM) {
		this.auto_NUM = auto_NUM;
	}
	public String getCategories_CODE() {
		return categories_CODE;
	}
	public void setCategories_CODE(String categories_CODE) {
		this.categories_CODE = categories_CODE;
	}
	public String getCat_ITEM_CODE() {
		return cat_ITEM_CODE;
	}
	public void setCat_ITEM_CODE(String cat_ITEM_CODE) {
		this.cat_ITEM_CODE = cat_ITEM_CODE;
	}
	public String getCat_ITEM_NAME() {
		return cat_ITEM_NAME;
	}
	public void setCat_ITEM_NAME(String cat_ITEM_NAME) {
		this.cat_ITEM_NAME = cat_ITEM_NAME;
	}
	public String getDescricption() {
		return descricption;
	}
	public void setDescricption(String descricption) {
		this.descricption = descricption;
	}
	public String getInput_NAME() {
		return input_NAME;
	}
	public void setInput_NAME(String input_NAME) {
		this.input_NAME = input_NAME;
	}
	public Date getInput_DATE() {
		return input_DATE;
	}
	public void setInput_DATE(Date input_DATE) {
		this.input_DATE = input_DATE;
	}
	
	@Override
	public String toString() {
		return "ItemDto [auto_NUM=" + auto_NUM + ", categories_CODE=" + categories_CODE + ", categories_NAME="
				+ categories_NAME + ", cat_ITEM_CODE=" + cat_ITEM_CODE + ", cat_ITEM_NAME=" + cat_ITEM_NAME
				+ ", descricption=" + descricption + ", input_NAME=" + input_NAME + ", input_DATE=" + input_DATE + "]";
	}
	 
}
