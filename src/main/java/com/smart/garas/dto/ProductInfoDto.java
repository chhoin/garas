package com.smart.garas.dto;

import java.util.Date;

public class ProductInfoDto {
	private String autoNum;
	private String cateCode;
	private String prodCode;
	private String prodName;
	private double pricePerUnit;
	private double pricePerItem;
	private int totalCanPerPackage;
    private String unitCode;
    private String dest;
    private Date entryDate;
    private String userCode;
    
	public String getAutoNum() {
		return autoNum;
	}
	public void setAutoNum(String autoNum) {
		this.autoNum = autoNum;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public int getTotalCanPerPackage() {
		return totalCanPerPackage;
	}
	public void setTotalCanPerPackage(int totalCanPerPackage) {
		this.totalCanPerPackage = totalCanPerPackage;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductInfoDto [autoNum=" + autoNum + ", cateCode=" + cateCode + ", prodCode=" + prodCode
				+ ", prodName=" + prodName + ", pricePerUnit=" + pricePerUnit + ", pricePerItem=" + pricePerItem
				+ ", totalCanPerPackage=" + totalCanPerPackage + ", unitCode=" + unitCode + ", dest=" + dest
				+ ", entryDate=" + entryDate + ", userCode=" + userCode + "]";
	}
    
}
