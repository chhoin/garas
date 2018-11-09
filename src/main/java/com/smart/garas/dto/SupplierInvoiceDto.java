package com.smart.garas.dto;

import java.util.Date;

public class SupplierInvoiceDto {
	private String invoice_TID;
	private String invoice_NO;
	private String sup_ID; 
	private Date invoice_DATE;
	private Date payable_DATE; 
	private Double total_COST_LCY;
	private Double payable_LCY;
	private Double recivable_LCY;
	private Double exchange_RATE;
	private Double total_COST_FCY;
	private Double payable_FCY;
	private Double recivable_FCY;
	private String user_CODE;
	private Date input_DATE; 
	private String status;
	private String description;
	private String categories_NAME;
	private String categories_CODE;
	
	private Date from_Date;
	private Date to_Date;
	private String sup_NAME;
	private String sup_TEL;
	private String currency;
	private String import_NUM;
	
	private double unit_price;
	private double qty;
	
	
	
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public String getCategories_NAME() {
		return categories_NAME;
	}
	public void setCategories_NAME(String categories_NAME) {
		this.categories_NAME = categories_NAME;
	}
	public String getCategories_CODE() {
		return categories_CODE;
	}
	public void setCategories_CODE(String categories_CODE) {
		this.categories_CODE = categories_CODE;
	}
	public String getInvoice_TID() {
		return invoice_TID;
	}
	public void setInvoice_TID(String invoice_TID) {
		this.invoice_TID = invoice_TID;
	}
	public String getInvoice_NO() {
		return invoice_NO;
	}
	public void setInvoice_NO(String invoice_NO) {
		this.invoice_NO = invoice_NO;
	}
	public String getSup_ID() {
		return sup_ID;
	}
	public void setSup_ID(String sup_ID) {
		this.sup_ID = sup_ID;
	}
	public Date getInvoice_DATE() {
		return invoice_DATE;
	}
	public void setInvoice_DATE(Date invoice_DATE) {
		this.invoice_DATE = invoice_DATE;
	}
	public Date getPayable_DATE() {
		return payable_DATE;
	}
	public void setPayable_DATE(Date payable_DATE) {
		this.payable_DATE = payable_DATE;
	}
	public Double getTotal_COST_LCY() {
		return total_COST_LCY;
	}
	public void setTotal_COST_LCY(Double total_COST_LCY) {
		this.total_COST_LCY = total_COST_LCY;
	}
	public Double getPayable_LCY() {
		return payable_LCY;
	}
	public void setPayable_LCY(Double payable_LCY) {
		this.payable_LCY = payable_LCY;
	}
	public Double getRecivable_LCY() {
		return recivable_LCY;
	}
	public void setRecivable_LCY(Double recivable_LCY) {
		this.recivable_LCY = recivable_LCY;
	}
	public Double getExchange_RATE() {
		return exchange_RATE;
	}
	public void setExchange_RATE(Double exchange_RATE) {
		this.exchange_RATE = exchange_RATE;
	}
	public Double getTotal_COST_FCY() {
		return total_COST_FCY;
	}
	public void setTotal_COST_FCY(Double total_COST_FCY) {
		this.total_COST_FCY = total_COST_FCY;
	}
	public Double getPayable_FCY() {
		return payable_FCY;
	}
	public void setPayable_FCY(Double payable_FCY) {
		this.payable_FCY = payable_FCY;
	}
	public Double getRecivable_FCY() {
		return recivable_FCY;
	}
	public void setRecivable_FCY(Double recivable_FCY) {
		this.recivable_FCY = recivable_FCY;
	}
	public String getUser_CODE() {
		return user_CODE;
	}
	public void setUser_CODE(String user_CODE) {
		this.user_CODE = user_CODE;
	}
	public Date getInput_DATE() {
		return input_DATE;
	}
	public void setInput_DATE(Date input_DATE) {
		this.input_DATE = input_DATE;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getFrom_Date() {
		return from_Date;
	}
	public void setFrom_Date(Date from_Date) {
		this.from_Date = from_Date;
	}
	public Date getTo_Date() {
		return to_Date;
	}
	public void setTo_Date(Date to_Date) {
		this.to_Date = to_Date;
	}
	public String getSup_NAME() {
		return sup_NAME;
	}
	public void setSup_NAME(String sup_NAME) {
		this.sup_NAME = sup_NAME;
	}
	public String getSup_TEL() {
		return sup_TEL;
	}
	public void setSup_TEL(String sup_TEL) {
		this.sup_TEL = sup_TEL;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getImport_NUM() {
		return import_NUM;
	}
	public void setImport_NUM(String import_NUM) {
		this.import_NUM = import_NUM;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SupplierInvoiceDto [invoice_TID=" + invoice_TID + ", invoice_NO=" + invoice_NO + ", sup_ID=" + sup_ID
				+ ", invoice_DATE=" + invoice_DATE + ", payable_DATE=" + payable_DATE + ", total_COST_LCY="
				+ total_COST_LCY + ", payable_LCY=" + payable_LCY + ", recivable_LCY=" + recivable_LCY
				+ ", exchange_RATE=" + exchange_RATE + ", total_COST_FCY=" + total_COST_FCY + ", payable_FCY="
				+ payable_FCY + ", recivable_FCY=" + recivable_FCY + ", user_CODE=" + user_CODE + ", input_DATE="
				+ input_DATE + ", status=" + status + ", description=" + description + ", categories_NAME="
				+ categories_NAME + ", categories_CODE=" + categories_CODE + ", from_Date=" + from_Date + ", to_Date="
				+ to_Date + ", sup_NAME=" + sup_NAME + ", sup_TEL=" + sup_TEL + ", currency=" + currency
				+ ", import_NUM=" + import_NUM + ", unit_price=" + unit_price + ", qty=" + qty + "]";
	}
	
}
