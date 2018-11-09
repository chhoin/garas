package com.smart.garas.dto;

import java.util.Date;

/**
 * 
 * @author tha.bunsath
 *
 */
public class PaymentInvoiceDto {
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
    
    

}
