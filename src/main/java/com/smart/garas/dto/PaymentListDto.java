package com.smart.garas.dto;

public class PaymentListDto {
	private String autoNum;
	private String paymentNo;
	private String invoiceNo;
	private String paymentDate;
	private String amount; 
	private String exchRate;
	private String curCode;
	private String userCode;
	private String inputDate;
	private String curName;
	private String userName;
    private String payDate;
    private String entryDate;
    
	public String getAutoNum() {
		return autoNum;
	}
	public void setAutoNum(String autoNum) {
		this.autoNum = autoNum;
	}
	public String getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getExchRate() {
		return exchRate;
	}
	public void setExchRate(String exchRate) {
		this.exchRate = exchRate;
	}
	public String getCurCode() {
		return curCode;
	}
	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getInputDate() {
		return inputDate;
	}
	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}
	public String getCurName() {
		return curName;
	}
	public void setCurName(String curName) {
		this.curName = curName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentListDto [autoNum=" + autoNum + ", paymentNo=" + paymentNo + ", invoiceNo=" + invoiceNo
				+ ", paymentDate=" + paymentDate + ", amount=" + amount + ", exchRate=" + exchRate + ", curCode="
				+ curCode + ", userCode=" + userCode + ", inputDate=" + inputDate + ", curName=" + curName
				+ ", userName=" + userName + ", payDate=" + payDate + ", entryDate=" + entryDate + "]";
	}	
    
}
