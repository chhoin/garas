package com.smart.garas.dto;

import java.util.Date;

public class ReturnProFitLossDto {
	private String invoice_NO;
	private Date imported_DATE;	
	private String sup_NAME;	
	private String categories_NAME;	
	private String cat_ITEM_NAME;	
	private String unit_NAME;	
	private String import_TYPE;
	private String ccy;	
	private double total_SOURCE;	
	private String invoice_NUMBER;	
	private Date invoice_DATE;	
	private String cus_NAME;	
	private String sex;
	private String phone;	
	private String address;
	private double qty;	
	private double import_PRICE;
	private double total_AMOUNT_IMPORT;	
	private double export_PRICE;	
	private double total_AMOUNT_EXPORT;
	private double gain_LOSS_AMOUNT;
	
	private Date p_DATE_FROM;
	private Date p_DATE_TO;
	private String p_INVOICE_NO;
	
	public String getInvoice_NO() {
		return invoice_NO;
	}
	public void setInvoice_NO(String invoice_NO) {
		this.invoice_NO = invoice_NO;
	}
	public Date getImported_DATE() {
		return imported_DATE;
	}
	public void setImported_DATE(Date imported_DATE) {
		this.imported_DATE = imported_DATE;
	}
	public String getSup_NAME() {
		return sup_NAME;
	}
	public void setSup_NAME(String sup_NAME) {
		this.sup_NAME = sup_NAME;
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
	public String getUnit_NAME() {
		return unit_NAME;
	}
	public void setUnit_NAME(String unit_NAME) {
		this.unit_NAME = unit_NAME;
	}
	public String getImport_TYPE() {
		return import_TYPE;
	}
	public void setImport_TYPE(String import_TYPE) {
		this.import_TYPE = import_TYPE;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public double getTotal_SOURCE() {
		return total_SOURCE;
	}
	public void setTotal_SOURCE(double total_SOURCE) {
		this.total_SOURCE = total_SOURCE;
	}
	public String getInvoice_NUMBER() {
		return invoice_NUMBER;
	}
	public void setInvoice_NUMBER(String invoice_NUMBER) {
		this.invoice_NUMBER = invoice_NUMBER;
	}
	public Date getInvoice_DATE() {
		return invoice_DATE;
	}
	public void setInvoice_DATE(Date invoice_DATE) {
		this.invoice_DATE = invoice_DATE;
	}
	public String getCus_NAME() {
		return cus_NAME;
	}
	public void setCus_NAME(String cus_NAME) {
		this.cus_NAME = cus_NAME;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getImport_PRICE() {
		return import_PRICE;
	}
	public void setImport_PRICE(double import_PRICE) {
		this.import_PRICE = import_PRICE;
	}
	public double getTotal_AMOUNT_IMPORT() {
		return total_AMOUNT_IMPORT;
	}
	public void setTotal_AMOUNT_IMPORT(double total_AMOUNT_IMPORT) {
		this.total_AMOUNT_IMPORT = total_AMOUNT_IMPORT;
	}
	public double getExport_PRICE() {
		return export_PRICE;
	}
	public void setExport_PRICE(double export_PRICE) {
		this.export_PRICE = export_PRICE;
	}
	public double getTotal_AMOUNT_EXPORT() {
		return total_AMOUNT_EXPORT;
	}
	public void setTotal_AMOUNT_EXPORT(double total_AMOUNT_EXPORT) {
		this.total_AMOUNT_EXPORT = total_AMOUNT_EXPORT;
	}
	public double getGain_LOSS_AMOUNT() {
		return gain_LOSS_AMOUNT;
	}
	public void setGain_LOSS_AMOUNT(double gain_LOSS_AMOUNT) {
		this.gain_LOSS_AMOUNT = gain_LOSS_AMOUNT;
	}
	public Date getP_DATE_FROM() {
		return p_DATE_FROM;
	}
	public void setP_DATE_FROM(Date p_DATE_FROM) {
		this.p_DATE_FROM = p_DATE_FROM;
	}
	public Date getP_DATE_TO() {
		return p_DATE_TO;
	}
	public void setP_DATE_TO(Date p_DATE_TO) {
		this.p_DATE_TO = p_DATE_TO;
	}
	public String getP_INVOICE_NO() {
		return p_INVOICE_NO;
	}
	public void setP_INVOICE_NO(String p_INVOICE_NO) {
		this.p_INVOICE_NO = p_INVOICE_NO;
	}
	
	@Override
	public String toString() {
		return "ReturnProFitLossDto [invoice_NO=" + invoice_NO + ", imported_DATE=" + imported_DATE + ", sup_NAME="
				+ sup_NAME + ", categories_NAME=" + categories_NAME + ", cat_ITEM_NAME=" + cat_ITEM_NAME
				+ ", unit_NAME=" + unit_NAME + ", import_TYPE=" + import_TYPE + ", ccy=" + ccy + ", total_SOURCE="
				+ total_SOURCE + ", invoice_NUMBER=" + invoice_NUMBER + ", invoice_DATE=" + invoice_DATE + ", cus_NAME="
				+ cus_NAME + ", sex=" + sex + ", phone=" + phone + ", address=" + address + ", qty=" + qty
				+ ", import_PRICE=" + import_PRICE + ", total_AMOUNT_IMPORT=" + total_AMOUNT_IMPORT + ", export_PRICE="
				+ export_PRICE + ", total_AMOUNT_EXPORT=" + total_AMOUNT_EXPORT + ", gain_LOSS_AMOUNT="
				+ gain_LOSS_AMOUNT + ", p_DATE_FROM=" + p_DATE_FROM + ", p_DATE_TO=" + p_DATE_TO + ", p_INVOICE_NO="
				+ p_INVOICE_NO + "]";
	}
	
}
