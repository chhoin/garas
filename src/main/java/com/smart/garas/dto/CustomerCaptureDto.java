package com.smart.garas.dto;

import java.util.Date;

public class CustomerCaptureDto {
	private String autoNum;
	private String saleCode;
	private String stockCode;
	private String prodCode;
	private String custCode;
	private int qty;
	private String unitType;
	private double unitPrice;
	private String currency;
	private double exchRate;
	private Date exptDate;
	private String carCode;
	private String destinaction;
	private String remark;
	private String inputer;
	private Date inputDate;
	private String modifiedBy;
	private Date modifiedDate;
	private String impSaleCode;
	private String impCode;
	private String cuscapInvoiceNo;
	
	public String getAutoNum() {
		return autoNum;
	}
	public void setAutoNum(String autoNum) {
		this.autoNum = autoNum;
	}
	public String getSaleCode() {
		return saleCode;
	}
	public void setSaleCode(String saleCode) {
		this.saleCode = saleCode;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getExchRate() {
		return exchRate;
	}
	public void setExchRate(double exchRate) {
		this.exchRate = exchRate;
	}
	public Date getExptDate() {
		return exptDate;
	}
	public void setExptDate(Date exptDate) {
		this.exptDate = exptDate;
	}
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public String getDestinaction() {
		return destinaction;
	}
	public void setDestinaction(String destinaction) {
		this.destinaction = destinaction;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getImpSaleCode() {
		return impSaleCode;
	}
	public void setImpSaleCode(String impSaleCode) {
		this.impSaleCode = impSaleCode;
	}
	public String getImpCode() {
		return impCode;
	}
	public void setImpCode(String impCode) {
		this.impCode = impCode;
	}
	
	public String getCuscapInvoiceNo() {
		return cuscapInvoiceNo;
	}
	public void setCuscapInvoiceNo(String cuscapInvoiceNo) {
		this.cuscapInvoiceNo = cuscapInvoiceNo;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerCaptureDto [autoNum=" + autoNum + ", saleCode=" + saleCode + ", stockCode=" + stockCode
				+ ", prodCode=" + prodCode + ", custCode=" + custCode + ", qty=" + qty + ", unitType=" + unitType
				+ ", unitPrice=" + unitPrice + ", currency=" + currency + ", exchRate=" + exchRate + ", exptDate="
				+ exptDate + ", carCode=" + carCode + ", destinaction=" + destinaction + ", remark=" + remark
				+ ", inputer=" + inputer + ", inputDate=" + inputDate + ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + ", impSaleCode=" + impSaleCode + ", impCode=" + impCode + "]";
	}
	
}
