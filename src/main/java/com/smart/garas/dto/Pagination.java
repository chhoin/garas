package com.smart.garas.dto;

/**
 * At: 06/28/2017
 * @author sok.kimchhoin
 * Pagination Object
 */
public class Pagination {

	private Long page;
	private Double item;
	private Long begin;
	private Double totalRecord;
	private Long totalPage;
	private String keySearch;

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getItem() {
		return item.longValue();
	}

	public void setItem(Double item) {
		this.item = item;
	}

	public Long getBegin() {
		this.begin = (long) ((this.item*this.page)-this.item);
		return begin;
	}

	public Long getTotalRecord() {
		return totalRecord.longValue();
	}

	public void setTotalRecord(Double totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Long getTotalPage() {
		this.totalPage = (long) Math.ceil(this.totalRecord/this.item) ;
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public String getKeySearch() {
		return keySearch;
	}

	public void setKeySearch(String keySearch) {
		this.keySearch = keySearch;
	}
}
