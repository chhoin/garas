package com.smart.garas.dto;

import java.util.List;

public class PageableResponse <T> {
	private int page;
	private int total;
	private int records;
	private List<T> rows;
	
	// constructor of PageableResponse
	public PageableResponse() { }
	
	// page able response
	public PageableResponse(PageableDto pageable, int count, List<T> list) { 
		int pageCount = (int) Math.ceil((double)count / pageable.getRows());
		
		setPage(pageable.getPage());
		setTotal(pageCount);
		setRecords(count);
		setRows(list);
	}
	
	// total page of pagination 
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}

	// get total
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	// get records
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}

	// get rows
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageableResponse [page=" + page + ", total=" + total + ", records=" + records + ", rows=" + rows + "]";
	}
}
