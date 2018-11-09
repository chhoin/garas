package com.smart.garas.dto;

import java.util.Date;

public class CustomerPayableListDto {
	private String autoNUM;
	private String payId;
	private String invoiceNumber;
	private String customerName;
	private String phone;
	private String addres;
	private String statusPay;
	private Date invoiceDate;
	private String totalCostFcy;
	private String totalCostLcy;
	private String currency;
	private double exchangeRate;
	private String payAmountFcy;
	private String payAmountLcy;
	private Date payDate;  
	private String dest;
	private String inputer;
	private Date inputDate;
	
	private Date p_F_DATE;
	private Date p_T_DATE;
	private String p_INVOICE_NO;
	private String p_CUS_NAME;
	private String p_CUS_PHONE;
	private String invoice_NUMBER;
	private String invoice_NUM;
	
	
	public String getAutoNUM() {
		return autoNUM;
	}
	public void setAutoNUM(String autoNUM) {
		this.autoNUM = autoNUM;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getStatusPay() {
		return statusPay;
	}
	public void setStatusPay(String statusPay) {
		this.statusPay = statusPay;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getTotalCostFcy() {
		return totalCostFcy;
	}
	public void setTotalCostFcy(String totalCostFcy) {
		this.totalCostFcy = totalCostFcy;
	}
	public String getTotalCostLcy() {
		return totalCostLcy;
	}
	public void setTotalCostLcy(String totalCostLcy) {
		this.totalCostLcy = totalCostLcy;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getPayAmountFcy() {
		return payAmountFcy;
	}
	public void setPayAmountFcy(String payAmountFcy) {
		this.payAmountFcy = payAmountFcy;
	}
	public String getPayAmountLcy() {
		return payAmountLcy;
	}
	public void setPayAmountLcy(String payAmountLcy) {
		this.payAmountLcy = payAmountLcy;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getInputer() {
		return inputer;
	}
	public void setInputer(String inputer) {
		this.inputer = inputer;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public Date getP_F_DATE() {
		return p_F_DATE;
	}
	public void setP_F_DATE(Date p_F_DATE) {
		this.p_F_DATE = p_F_DATE;
	}
	public Date getP_T_DATE() {
		return p_T_DATE;
	}
	public void setP_T_DATE(Date p_T_DATE) {
		this.p_T_DATE = p_T_DATE;
	}
	public String getP_INVOICE_NO() {
		return p_INVOICE_NO;
	}
	public void setP_INVOICE_NO(String p_INVOICE_NO) {
		this.p_INVOICE_NO = p_INVOICE_NO;
	}
	public String getP_CUS_NAME() {
		return p_CUS_NAME;
	}
	public void setP_CUS_NAME(String p_CUS_NAME) {
		this.p_CUS_NAME = p_CUS_NAME;
	}
	public String getP_CUS_PHONE() {
		return p_CUS_PHONE;
	}
	public void setP_CUS_PHONE(String p_CUS_PHONE) {
		this.p_CUS_PHONE = p_CUS_PHONE;
	}
	public String getInvoice_NUMBER() {
		return invoice_NUMBER;
	}
	public void setInvoice_NUMBER(String invoice_NUMBER) {
		this.invoice_NUMBER = invoice_NUMBER;
	}
	public String getInvoice_Num() {
		return invoice_NUM;
	}
	public void setInvoice_Num(String invoice_Num) {
		this.invoice_NUM = invoice_Num;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerPayableListDto [autoNUM=" + autoNUM + ", payId=" + payId + ", invoiceNumber=" + invoiceNumber
				+ ", customerName=" + customerName + ", phone=" + phone + ", addres=" + addres + ", statusPay="
				+ statusPay + ", invoiceDate=" + invoiceDate + ", totalCostFcy=" + totalCostFcy + ", totalCostLcy="
				+ totalCostLcy + ", currency=" + currency + ", exchangeRate=" + exchangeRate + ", payAmountFcy="
				+ payAmountFcy + ", payAmountLcy=" + payAmountLcy + ", payDate=" + payDate + ", dest=" + dest
				+ ", inputer=" + inputer + ", inputDate=" + inputDate + ", p_F_DATE=" + p_F_DATE + ", p_T_DATE="
				+ p_T_DATE + ", p_INVOICE_NO=" + p_INVOICE_NO + ", p_CUS_NAME=" + p_CUS_NAME + ", p_CUS_PHONE="
				+ p_CUS_PHONE + ", invoice_NUMBER=" + invoice_NUMBER + ", invoice_NUM=" + invoice_NUM + "]";
	}
	
}

