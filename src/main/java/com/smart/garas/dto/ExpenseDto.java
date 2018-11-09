package com.smart.garas.dto;

import java.util.Date;

public class ExpenseDto {
	private String expCode;
	private Date expDate;
	private String expType;
	private String curCode;
	private double amount;
	private double exchRate;
	private String referent;
	private String dest;
	private String userCode;
	private Date entryDate;
	private Date deletedDate;
	private String deletedBy;
	private String enable;
	private String status;
	private String action;
	
	public String getExpCode() {
		return expCode;
	}
	public void setExpCode(String expCode) {
		this.expCode = expCode;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getExchRate() {
		return exchRate;
	}
	public void setExchRate(double exchRate) {
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
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Date getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(Date deletedDate) {
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
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExpenseDto [expCode=" + expCode + ", expDate=" + expDate + ", expType=" + expType + ", curCode="
				+ curCode + ", amount=" + amount + ", exchRate=" + exchRate + ", referent=" + referent + ", dest="
				+ dest + ", userCode=" + userCode + ", entryDate=" + entryDate + ", deletedDate=" + deletedDate
				+ ", deletedBy=" + deletedBy + ", enable=" + enable + ", status=" + status + ", action=" + action + "]";
	}

}
