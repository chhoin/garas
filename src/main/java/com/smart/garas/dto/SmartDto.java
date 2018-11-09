package com.smart.garas.dto;

import java.util.Date;

public class SmartDto {
	private String ncode;
	private String code;
	private String name;
	private String sex;
	private String rowNum;
	
	private Date fromDate;
	private Date toDate;
	public String getNcode() {
		return ncode;
	}
	public void setNcode(String ncode) {
		this.ncode = ncode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRowNum() {
		return rowNum;
	}
	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
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
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SmartDto [ncode=" + ncode + ", code=" + code + ", name=" + name + ", sex=" + sex + ", rowNum=" + rowNum
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
}
