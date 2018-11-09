package com.smart.garas.dto;
/**
 * 
 * @author tha.bunsath
 *
 */

public class CustomFieldDto {

	private String import_NUM;
	private int qty; 
	private double unit_PRICE;
	private String categories_CODE;         
	private String cat_ITEM_CODE;
	private String cat_ITEM_NAME;
	private String impt_TYPE;
	private int stock_REMAN;
	private String st_ID;
	private String import_TYPE;

	public String getImport_NUM() {
		return import_NUM;
	}

	public void setImport_NUM(String import_NUM) {
		this.import_NUM = import_NUM;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnit_PRICE() {
		return unit_PRICE;
	}

	public void setUnit_PRICE(double unit_PRICE) {
		this.unit_PRICE = unit_PRICE;
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

	public String getCAT_ITEM_NAME() {
		return cat_ITEM_NAME;
	}

	public void setCAT_ITEM_NAME(String acat_ITEM_NAME) {
		cat_ITEM_NAME = acat_ITEM_NAME;
	}

	public String getImpt_TYPE() {
		return impt_TYPE;
	}

	public void setImpt_TYPE(String impt_TYPE) {
		this.impt_TYPE = impt_TYPE;
	}

	public int getStock_REMAN() {
		return stock_REMAN;
	}

	public void setStock_REMAN(int stock_REMAN) {
		this.stock_REMAN = stock_REMAN;
	}

	public String getSt_ID() {
		return st_ID;
	}

	public void setSt_ID(String st_ID) {
		this.st_ID = st_ID;
	}

	public String getImport_TYPE() {
		return import_TYPE;
	}

	public void setImport_TYPE(String import_TYPE) {
		this.import_TYPE = import_TYPE;
	}

	

}
