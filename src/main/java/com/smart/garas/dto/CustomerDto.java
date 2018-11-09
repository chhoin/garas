package com.smart.garas.dto;

import java.util.Date;

public class CustomerDto {
	private String custCode;
	private String custKhName;
	private String custEnName;
	private String gender;
	private Date birthOfDate;
	private String phone;
	private String mail;
	private String address;
	private String dest;
	private String custTyep;
	private String villageCode;
	private String communeCode;
	private String districtCode;
	private String provinceCode;
	private String userCode;
	private Date entryDate;
	private Date modifyDate;
	private Date deleteDate;
	private String enable;
	private String status;
	private String action;
	
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getCustKhName() {
		return custKhName;
	}
	public void setCustKhName(String custKhName) {
		this.custKhName = custKhName;
	}
	public String getCustEnName() {
		return custEnName;
	}
	public void setCustEnName(String custEnName) {
		this.custEnName = custEnName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
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
	public String getCustTyep() {
		return custTyep;
	}
	public void setCustTyep(String custTyep) {
		this.custTyep = custTyep;
	}
	public String getVillageCode() {
		return villageCode;
	}
	public void setVillageCode(String villageCode) {
		this.villageCode = villageCode;
	}
	public String getCommuneCode() {
		return communeCode;
	}
	public void setCommuneCode(String communeCode) {
		this.communeCode = communeCode;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
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
	public Date getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerDto [custCode=" + custCode + ", custKhName=" + custKhName + ", custEnName=" + custEnName
				+ ", gender=" + gender + ", birthOfDate=" + birthOfDate + ", phone=" + phone + ", mail=" + mail
				+ ", address=" + address + ", dest=" + dest + ", custTyep=" + custTyep + ", villageCode=" + villageCode
				+ ", communeCode=" + communeCode + ", districtCode=" + districtCode + ", provinceCode=" + provinceCode
				+ ", userCode=" + userCode + ", entryDate=" + entryDate + ", modifyDate=" + modifyDate + ", deleteDate="
				+ deleteDate + ", enable=" + enable + ", status=" + status + ", action=" + action + "]";
	}
	
}
