package com.smart.garas.dto;

import java.util.Date;

public class CustomerInvoiceDto {
 private String cus_INVOICE_NUM;
 private String invoice_NUMBER;
 private String invoice_NUM;
 private String customer_CODE;
 private Date invoice_DATE;
 private String currency; 
 private Double exc_RATE;
 private Double total_COST_LCY;
 private Double payable_LCY;
 private Double reciveable_LCY;
 private Double total_COST_FCY;
 private Double payable_FCY;
 private Double reciveable_FCY;
 private Date pay_OFF_DATE;
 private String status; 
 private String input_NAME;
 private Date input_DATE;
 private String desc;
 private double unit_price;
 private double qty;
 
 private Double exchangeRate;
 private String cus_KH_NAME;
 private String cus_PHONE;
 private String ccy;
public String getCus_INVOICE_NUM() {
	return cus_INVOICE_NUM;
}
public void setCus_INVOICE_NUM(String cus_INVOICE_NUM) {
	this.cus_INVOICE_NUM = cus_INVOICE_NUM;
}
public String getInvoice_NUMBER() {
	return invoice_NUMBER;
}
public void setInvoice_NUMBER(String invoice_NUMBER) {
	this.invoice_NUMBER = invoice_NUMBER;
}
public String getInvoice_NUM() {
	return invoice_NUM;
}
public void setInvoice_NUM(String invoice_NUM) {
	this.invoice_NUM = invoice_NUM;
}
public String getCustomer_CODE() {
	return customer_CODE;
}
public void setCustomer_CODE(String customer_CODE) {
	this.customer_CODE = customer_CODE;
}
public Date getInvoice_DATE() {
	return invoice_DATE;
}
public void setInvoice_DATE(Date invoice_DATE) {
	this.invoice_DATE = invoice_DATE;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public Double getExc_RATE() {
	return exc_RATE;
}
public void setExc_RATE(Double exc_RATE) {
	this.exc_RATE = exc_RATE;
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
public Double getReciveable_LCY() {
	return reciveable_LCY;
}
public void setReciveable_LCY(Double reciveable_LCY) {
	this.reciveable_LCY = reciveable_LCY;
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
public Double getReciveable_FCY() {
	return reciveable_FCY;
}
public void setReciveable_FCY(Double reciveable_FCY) {
	this.reciveable_FCY = reciveable_FCY;
}
public Date getPay_OFF_DATE() {
	return pay_OFF_DATE;
}
public void setPay_OFF_DATE(Date pay_OFF_DATE) {
	this.pay_OFF_DATE = pay_OFF_DATE;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
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
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
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
public Double getExchangeRate() {
	return exchangeRate;
}
public void setExchangeRate(Double exchangeRate) {
	this.exchangeRate = exchangeRate;
}
public String getCus_KH_NAME() {
	return cus_KH_NAME;
}
public void setCus_KH_NAME(String cus_KH_NAME) {
	this.cus_KH_NAME = cus_KH_NAME;
}
public String getCus_PHONE() {
	return cus_PHONE;
}
public void setCus_PHONE(String cus_PHONE) {
	this.cus_PHONE = cus_PHONE;
}
public String getCcy() {
	return ccy;
}
public void setCcy(String ccy) {
	this.ccy = ccy;
}

/*
 * (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "CustomerInvoiceDto [cus_INVOICE_NUM=" + cus_INVOICE_NUM + ", invoice_NUMBER=" + invoice_NUMBER
			+ ", invoice_NUM=" + invoice_NUM + ", customer_CODE=" + customer_CODE + ", invoice_DATE=" + invoice_DATE
			+ ", currency=" + currency + ", exc_RATE=" + exc_RATE + ", total_COST_LCY=" + total_COST_LCY
			+ ", payable_LCY=" + payable_LCY + ", reciveable_LCY=" + reciveable_LCY + ", total_COST_FCY="
			+ total_COST_FCY + ", payable_FCY=" + payable_FCY + ", reciveable_FCY=" + reciveable_FCY + ", pay_OFF_DATE="
			+ pay_OFF_DATE + ", status=" + status + ", input_NAME=" + input_NAME + ", input_DATE=" + input_DATE
			+ ", desc=" + desc + ", unit_price=" + unit_price + ", qty=" + qty + ", exchangeRate=" + exchangeRate
			+ ", cus_KH_NAME=" + cus_KH_NAME + ", cus_PHONE=" + cus_PHONE + ", ccy=" + ccy + "]";
}
 
}
