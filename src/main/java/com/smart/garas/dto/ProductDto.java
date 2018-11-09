package com.smart.garas.dto;

import java.util.Date;

public class ProductDto {
	   private String auto_ID;
	   private String st_ID;   
	   private String st_TYPE;         
	   private String st_NAME;         
	   private String st_TYPE_CODE;          
	   private String st_UNIT;          
	   private Double st_UNIT_PRICE;     
	   private String st_TOTAL_BALANCE;         
	   private String currency;         
	   private String wqty;         
	   private String st_INPUTER;          
	   private Date st_DATE;          
	   private Date st_MODIFY_DATE;          
	   private String st_CODE;         
	   private String des;
	   private String import_TYPE;
	   
	   private String categories_NAME;
	   private String cat_ITEM_NAME;
	   private String unit_NAME;
	   
	   
			public String getUnit_NAME() {
				return unit_NAME;
			}
			public void setUnit_NAME(String unit_NAME) {
				this.unit_NAME = unit_NAME;
			}
			public String getCategories_NAME() {
				return categories_NAME;
			}
			public void setCategories_NAME(String categories_NAME) {
				this.categories_NAME = categories_NAME;
			}
			public String getCat_ITEM_NAME() {
				return cat_ITEM_NAME;
			}
			public void setCat_ITEM_NAME(String cat_ITEM_NAME) {
				this.cat_ITEM_NAME = cat_ITEM_NAME;
			}
			public String getImport_TYPE() {
				return import_TYPE;
			}
			public void setImport_TYPE(String import_TYPE) {
				this.import_TYPE = import_TYPE;
			}
			public String getAuto_ID() {
				return auto_ID;
			}
			public void setAuto_ID(String auto_ID) {
				this.auto_ID = auto_ID;
			}
			public String getSt_ID() {
				return st_ID;
			}
			public void setSt_ID(String st_ID) {
				this.st_ID = st_ID;
			}
			public String getSt_TYPE() {
				return st_TYPE;
			}
			public void setSt_TYPE(String st_TYPE) {
				this.st_TYPE = st_TYPE;
			}
			public String getSt_NAME() {
				return st_NAME;
			}
			public void setSt_NAME(String st_NAME) {
				this.st_NAME = st_NAME;
			}
			public String getSt_TYPE_CODE() {
				return st_TYPE_CODE;
			}
			public void setSt_TYPE_CODE(String st_TYPE_CODE) {
				this.st_TYPE_CODE = st_TYPE_CODE;
			}
			public String getSt_UNIT() {
				return st_UNIT;
			}
			public void setSt_UNIT(String st_UNIT) {
				this.st_UNIT = st_UNIT;
			}
			public Double getSt_UNIT_PRICE() {
				return st_UNIT_PRICE;
			}
			public void setSt_UNIT_PRICE(Double st_UNIT_PRICE) {
				this.st_UNIT_PRICE = st_UNIT_PRICE;
			}
			public String getSt_TOTAL_BALANCE() {
				return st_TOTAL_BALANCE;
			}
			public void setSt_TOTAL_BALANCE(String st_TOTAL_BALANCE) {
				this.st_TOTAL_BALANCE = st_TOTAL_BALANCE;
			}
			public String getCurrency() {
				return currency;
			}
			public void setCurrency(String currency) {
				this.currency = currency;
			}
			public String getWqty() {
				return wqty;
			}
			public void setWqty(String wqty) {
				this.wqty = wqty;
			}
			public String getSt_INPUTER() {
				return st_INPUTER;
			}
			public void setSt_INPUTER(String st_INPUTER) {
				this.st_INPUTER = st_INPUTER;
			}
			public Date getSt_DATE() {
				return st_DATE;
			}
			public void setSt_DATE(Date st_DATE) {
				this.st_DATE = st_DATE;
			}
			public Date getSt_MODIFY_DATE() {
				return st_MODIFY_DATE;
			}
			public void setSt_MODIFY_DATE(Date st_MODIFY_DATE) {
				this.st_MODIFY_DATE = st_MODIFY_DATE;
			}
			public String getSt_CODE() {
				return st_CODE;
			}
			public void setSt_CODE(String st_CODE) {
				this.st_CODE = st_CODE;
			}
			public String getDes() {
				return des;
			}
			public void setDes(String des) {
				this.des = des;
			}
			
			@Override
			public String toString() {
				return "ProductDto [auto_ID=" + auto_ID + ", st_ID=" + st_ID + ", st_TYPE=" + st_TYPE + ", st_NAME="
						+ st_NAME + ", st_TYPE_CODE=" + st_TYPE_CODE + ", st_UNIT=" + st_UNIT + ", st_UNIT_PRICE="
						+ st_UNIT_PRICE + ", st_TOTAL_BALANCE=" + st_TOTAL_BALANCE + ", currency=" + currency
						+ ", wqty=" + wqty + ", st_INPUTER=" + st_INPUTER + ", st_DATE=" + st_DATE + ", st_MODIFY_DATE="
						+ st_MODIFY_DATE + ", st_CODE=" + st_CODE + ", des=" + des + ", import_TYPE=" + import_TYPE
						+ ", categories_NAME=" + categories_NAME + ", cat_ITEM_NAME=" + cat_ITEM_NAME + "]";
			}
	  
}
