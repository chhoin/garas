package com.smart.garas.dto;

public class ProductInfoListDto {
	private String autoNum;
	private String cateCode;
	private String prodCode;
	private String prodName;
	private String pricePerUnit;
	private String pricePerItem;
	private String totalCanPerPackage;
    private String unitCode;
    private String dest;
    private String entryDate;
    private String userCode;
    private String cateName;
    private String curName;
    private String userName;
    private int currentPage;
	private int numPerPage;
	
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
	public String getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public String getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(String pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public String getTotalCanPerPackage() {
		return totalCanPerPackage;
	}
	public void setTotalCanPerPackage(String totalCanPerPackage) {
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
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
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
		return "ProductInfoListDto [autoNum=" + autoNum + ", cateCode=" + cateCode + ", prodCode=" + prodCode
				+ ", prodName=" + prodName + ", pricePerUnit=" + pricePerUnit + ", pricePerItem=" + pricePerItem
				+ ", totalCanPerPackage=" + totalCanPerPackage + ", unitCode=" + unitCode + ", dest=" + dest
				+ ", entryDate=" + entryDate + ", userCode=" + userCode + ", cateName=" + cateName + ", curName="
				+ curName + ", userName=" + userName + ", currentPage=" + currentPage + ", numPerPage=" + numPerPage
				+ "]";
	}
	
}
