package com.smart.garas.dto;

public class CategoryDto {
	 private String autoNum;
	 private String cateCode;
	 private String cateName;
	 
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
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CategoryDto [autoNum=" + autoNum + ", cateCode=" + cateCode + ", cateName=" + cateName + "]";
	}
}
