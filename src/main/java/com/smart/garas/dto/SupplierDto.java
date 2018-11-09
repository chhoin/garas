package com.smart.garas.dto;

import java.util.Date;

public class SupplierDto {
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
	private Date entryDate;
	private Date modifyDate;
	private String modifyBy;
	private Date deletedDate;
	private String deletedBy;
	
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
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SupplierDto [suppCode=" + suppCode + ", companyName=" + companyName + ", suppKhName=" + suppKhName
				+ ", suppEngName=" + suppEngName + ", phone=" + phone + ", mail=" + mail + ", address=" + address
				+ ", dest=" + dest + ", status=" + status + ", enable=" + enable + ", userCode=" + userCode
				+ ", modifyBy=" + modifyBy + ", deletedBy=" + deletedBy + "]";
	}
	
}
