package com.smart.garas.dto;

import java.util.Date;

public class PaymentDto {
	private String payCode;
	private Date payDate;
	private String invoiceNo;
	private double amount;
	private String curCode;
	private double exchRate;
	private Date payoffDate;
	private String payStatus;
	private String payAction;
	private String userCode;
	private Date entryDate;
	
	public String getPayCode() {
		return payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurCode() {
		return curCode;
	}
	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}
	public double getExchRate() {
		return exchRate;
	}
	public void setExchRate(double exchRate) {
		this.exchRate = exchRate;
	}
	public Date getPayoffDate() {
		return payoffDate;
	}
	public void setPayoffDate(Date payoffDate) {
		this.payoffDate = payoffDate;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayAction() {
		return payAction;
	}
	public void setPayAction(String payAction) {
		this.payAction = payAction;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentDto [payCode=" + payCode + ", payDate=" + payDate + ", invoiceNo=" + invoiceNo + ", amount="
				+ amount + ", curCode=" + curCode + ", exchRate=" + exchRate + ", payoffDate=" + payoffDate
				+ ", payStatus=" + payStatus + ", payAction=" + payAction + ", userCode=" + userCode + ", entryDate="
				+ entryDate + "]";
	}
	
}
