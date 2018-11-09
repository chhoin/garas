package com.smart.garas.dto;

public class CurrencyDto {
	private String autoNum;
	private String curCode;
	private String curName;
	private double curSale;
	private String curDest;
	
	public String getAutoNum() {
		return autoNum;
	}
	public void setAutoNum(String autoNum) {
		this.autoNum = autoNum;
	}
	public String getCurCode() {
		return curCode;
	}
	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}
	public String getCurName() {
		return curName;
	}
	public void setCurName(String curName) {
		this.curName = curName;
	}
	public double getCurSale() {
		return curSale;
	}
	public void setCurSale(double curSale) {
		this.curSale = curSale;
	}
	public String getCurDest() {
		return curDest;
	}
	public void setCurDest(String curDest) {
		this.curDest = curDest;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CurrencyDto [autoNum=" + autoNum + ", curCode=" + curCode + ", curName=" + curName + ", curSale="
				+ curSale + ", curDest=" + curDest + "]";
	}
	
}
