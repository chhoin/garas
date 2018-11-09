package com.smart.garas.dto;

public class SupplierListDto {
	private String autoId;
	private String suppCode;
	private String companyName;
	private String suppKhName;
	private String suppEngName;
	private String phone;
	private String mail;
	private String address;
	private String dest;
	private String status;
	private String enable;
	private String userCode;
	private String entryDate;
	private String modifyDate;
	private String modifyBy;
	private String deletedDate;
	private String deletedBy;
	private String userName;
	private int currentPage;
	private int numPerPage;
	
	public String getAutoId() {
		return autoId;
	}
	public void setAutoId(String autoId) {
		this.autoId = autoId;
	}
	public String getSuppCode() {
		return suppCode;
	}
	public void setSuppCode(String suppCode) {
		this.suppCode = suppCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSuppKhName() {
		return suppKhName;
	}
	public void setSuppKhName(String suppKhName) {
		this.suppKhName = suppKhName;
	}
	public String getSuppEngName() {
		return suppEngName;
	}
	public void setSuppEngName(String suppEngName) {
		this.suppEngName = suppEngName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public String getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
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
		return "SupplierListDto [autoId=" + autoId + ", suppCode=" + suppCode + ", companyName=" + companyName
				+ ", suppKhName=" + suppKhName + ", suppEngName=" + suppEngName + ", phone=" + phone + ", mail=" + mail
				+ ", address=" + address + ", dest=" + dest + ", status=" + status + ", enable=" + enable
				+ ", userCode=" + userCode + ", entryDate=" + entryDate + ", modifyDate=" + modifyDate + ", modifyBy="
				+ modifyBy + ", deletedDate=" + deletedDate + ", deletedBy=" + deletedBy + ", userName=" + userName
				+ ", currentPage=" + currentPage + ", numPerPage=" + numPerPage + "]";
	}
	
}
