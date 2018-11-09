package com.smart.garas.dto;

import java.util.Date;

public class ExpenseListDto {
	private String autoNum;
	private String expCode;
	private String expDate;
	private String expType;
	private String curCode;
	private String amount;
	private String exchRate;
	private String referent;
	private String dest;
	private String userCode;
	private String entryDate;
	private String deletedDate;
	private String deletedBy;
	private String enable;
	private String status;
	private String action;
	private String userName;
	private String curName;
	
	// parameter
	private Date fromDate;
	private Date toDate;
	private int currentPage;
	private int numPerPage;
	
	public String getAutoNum() {
		return autoNum;
	}
	public void setAutoNum(String autoNum) {
		this.autoNum = autoNum;
	}
	public String getExpCode() {
		return expCode;
	}
	public void setExpCode(String expCode) {
		this.expCode = expCode;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getExpType() {
		return expType;
	}
	public void setExpType(String expType) {
		this.expType = expType;
	}
	public String getCurCode() {
		return curCode;
	}
	public void setCurCode(String curCode) {
		this.curCode = curCode;
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
	public String getReferent() {
		return referent;
	}
	public void setReferent(String referent) {
		this.referent = referent;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCurName() {
		return curName;
	}
	public void setCurName(String curName) {
		this.curName = curName;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getNumPerPage() {
		return numPerPage;
	}
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExpenseListDto [autoNum=" + autoNum + ", expCode=" + expCode + ", expDate=" + expDate + ", expType="
				+ expType + ", curCode=" + curCode + ", amount=" + amount + ", exchRate=" + exchRate + ", referent="
				+ referent + ", dest=" + dest + ", userCode=" + userCode + ", entryDate=" + entryDate + ", deletedDate="
				+ deletedDate + ", deletedBy=" + deletedBy + ", enable=" + enable + ", status=" + status + ", action="
				+ action + ", userName=" + userName + ", curName=" + curName + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", currentPage=" + currentPage + ", numPerPage=" + numPerPage + "]";
	}
	
}
