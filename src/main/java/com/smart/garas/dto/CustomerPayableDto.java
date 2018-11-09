package com.smart.garas.dto;

import java.util.Date;

public class CustomerPayableDto {
	private String pay_ID;
	private String invoice_NUM;
	private String pay_TYPE;
	private String currency;
	private double pay_AMOUNT_FCY;
	private double exchange_RATE;
	private double pay_AMOUNT_LCY;
	private Date pay_DATE;
	private String description;
	private String inputter;
	private Date input_DATE;
	private double unit_price;
	private double qty;
	
	private Date pay_NEW;
	private Double pay_AMOUNT;
	private double recivable_FCY;
	
	private Date from_date;
	private Date to_date;
	private String invoice_NUMBER;
	private String cus_KH_NAME;
	private String cus_PHONE;
	private String ccy;
	
	public String getPay_ID() {
		return pay_ID;
	}
	public void setPay_ID(String pay_ID) {
		this.pay_ID = pay_ID;
	}
	public String getInvoice_NUM() {
		return invoice_NUM;
	}
	public void setInvoice_NUM(String invoice_NUM) {
		this.invoice_NUM = invoice_NUM;
	}
	public String getPay_TYPE() {
		return pay_TYPE;
	}
	public void setPay_TYPE(String pay_TYPE) {
		this.pay_TYPE = pay_TYPE;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getPay_AMOUNT_FCY() {
		return pay_AMOUNT_FCY;
	}
	public void setPay_AMOUNT_FCY(double pay_AMOUNT_FCY) {
		this.pay_AMOUNT_FCY = pay_AMOUNT_FCY;
	}
	public double getExchange_RATE() {
		return exchange_RATE;
	}
	public void setExchange_RATE(double exchange_RATE) {
		this.exchange_RATE = exchange_RATE;
	}
	public double getPay_AMOUNT_LCY() {
		return pay_AMOUNT_LCY;
	}
	public void setPay_AMOUNT_LCY(double pay_AMOUNT_LCY) {
		this.pay_AMOUNT_LCY = pay_AMOUNT_LCY;
	}
	public Date getPay_DATE() {
		return pay_DATE;
	}
	public void setPay_DATE(Date pay_DATE) {
		this.pay_DATE = pay_DATE;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInputter() {
		return inputter;
	}
	public void setInputter(String inputter) {
		this.inputter = inputter;
	}
	public Date getInput_DATE() {
		return input_DATE;
	}
	public void setInput_DATE(Date input_DATE) {
		this.input_DATE = input_DATE;
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
	public Date getPay_NEW() {
		return pay_NEW;
	}
	public void setPay_NEW(Date pay_NEW) {
		this.pay_NEW = pay_NEW;
	}
	public Double getPay_AMOUNT() {
		return pay_AMOUNT;
	}
	public void setPay_AMOUNT(Double pay_AMOUNT) {
		this.pay_AMOUNT = pay_AMOUNT;
	}
	public double getRecivable_FCY() {
		return recivable_FCY;
	}
	public void setRecivable_FCY(double recivable_FCY) {
		this.recivable_FCY = recivable_FCY;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public String getInvoice_NUMBER() {
		return invoice_NUMBER;
	}
	public void setInvoice_NUMBER(String invoice_NUMBER) {
		this.invoice_NUMBER = invoice_NUMBER;
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
	@Override
	public String toString() {
		return "CustomerPayableDto [pay_ID=" + pay_ID + ", invoice_NUM=" + invoice_NUM + ", pay_TYPE=" + pay_TYPE
				+ ", currency=" + currency + ", pay_AMOUNT_FCY=" + pay_AMOUNT_FCY + ", exchange_RATE=" + exchange_RATE
				+ ", pay_AMOUNT_LCY=" + pay_AMOUNT_LCY + ", pay_DATE=" + pay_DATE + ", description=" + description
				+ ", inputter=" + inputter + ", input_DATE=" + input_DATE + ", unit_price=" + unit_price + ", qty="
				+ qty + ", pay_NEW=" + pay_NEW + ", pay_AMOUNT=" + pay_AMOUNT + ", recivable_FCY=" + recivable_FCY
				+ ", from_date=" + from_date + ", to_date=" + to_date + ", invoice_NUMBER=" + invoice_NUMBER
				+ ", cus_KH_NAME=" + cus_KH_NAME + ", cus_PHONE=" + cus_PHONE + ", ccy=" + ccy + "]";
	}
	
}

