package com.smart.garas.dto;

public class PageableDto {
	private int rows = 10;
	private int page = 1;
	private String sord = "desc";
	private String sidx;
		
	private String SUP_ID; // supplier code
	private String cur_NAME; // currency name
	
	public String getCur_NAME() {
		return cur_NAME;
	}

	public void setCur_NAME(String cur_NAME) {
		this.cur_NAME = cur_NAME;
	}

	// properties of supplier
	public String getSUP_ID() {
		return SUP_ID;
	}

	public void setSUP_ID(String sUP_ID) {
		SUP_ID = sUP_ID;
	}

	// pagination start index
	public int getStartIndex() {
		return (getPage() - 1 ) * getRows() + 1;
	}
	
	// pagination end index
	public int getEndIndex() {
		return (getPage() - 1 ) * getRows() + getRows();
	}
	
	// pagination total of rows
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	// pagination total of page
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	// pagination short types
	public String getSord() {
		return sord;
	}
	public void setSord(String sord) {
		this.sord = sord;
	}
	
	// pagination total of side
	public String getSidx() {
		return sidx;
	}
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	@Override
	public String toString() {
		return "PageableDto [rows=" + rows + ", page=" + page + ", sord=" + sord + ", sidx=" + sidx
				+ ", getStartIndex()=" + getStartIndex() + ", getEndIndex()=" + getEndIndex() + ", getRows()="
				+ getRows() + ", getPage()=" + getPage() + ", getSord()=" + getSord() + ", getSidx()=" + getSidx()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
