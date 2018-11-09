package com.smart.garas.dto;

import java.util.Date;

public class IncomeDto {
	private String incomeCode;
	private Date incomeDate;
	private String incomeType;
	private String dest;
	private String curCode;
	private double amount;
	private double exchRate;
	private String referent;
	private String userCode;
	private Date entryDate;
	private Date deletedDate;
	private String deletedBy;
	private String enable;
	private String status;
	private String action;
	
	public String getIncomeCode() {
		return incomeCode;
	}
	public void setIncomeCode(String incomeCode) {
		this.incomeCode = incomeCode;
	}
	public Date getIncomeDate() {
		return incomeDate;
	}
	public void setIncomeDate(Date incomeDate) {
		this.incomeDate = incomeDate;
	}
	public String getIncomeType() {
		return incomeType;
	}
	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
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
		return "IncomeDto [incomeCode=" + incomeCode + ", incomeDate=" + incomeDate + ", incomeType=" + incomeType
				+ ", dest=" + dest + ", curCode=" + curCode + ", amount=" + amount + ", exchRate=" + exchRate
				+ ", referent=" + referent + ", userCode=" + userCode + ", entryDate=" + entryDate + ", deletedDate="
				+ deletedDate + ", deletedBy=" + deletedBy + ", enable=" + enable + ", status=" + status + ", action="
				+ action + "]";
	}
	
}
