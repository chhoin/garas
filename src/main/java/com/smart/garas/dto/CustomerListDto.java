package com.smart.garas.dto;

import java.util.Date;

public class CustomerListDto {
	private String autoId;
	private String custCode; 
	private String custKhName; 
	private String custEnName; 
	private String gender; 
	private Date birthDate; 
	private String phone; 
	private String email; 
	private String villageCode; 
	private String communeCode; 
	private String districtCode; 
	private String provinceCode; 
	private String address; 
	private String custTyep; 
	private String inputer; 
	private String userName;
	private String entryDate;
	private Date inputDate; 
	private Date modifiedDate; 
	private String cmdType;
	private int currentPage; 
	private int numPerPage;
	private int totalPage;
	
	public String getAutoId() {
		return autoId;
	}
	public void setAutoId(String autoId) {
		this.autoId = autoId;
	}
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustTyep() {
		return custTyep;
	}
	public void setCustTyep(String custTyep) {
		this.custTyep = custTyep;
	}
	public String getInputer() {
		return inputer;
	}
	public void setInputer(String inputer) {
		this.inputer = inputer;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCmdType() {
		return cmdType;
	}
	public void setCmdType(String cmdType) {
		this.cmdType = cmdType;
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
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerListDto [autoId=" + autoId + ", custCode=" + custCode + ", custKhName=" + custKhName
				+ ", custEnName=" + custEnName + ", gender=" + gender + ", birthDate=" + birthDate + ", phone=" + phone
				+ ", email=" + email + ", villageCode=" + villageCode + ", communeCode=" + communeCode
				+ ", districtCode=" + districtCode + ", provinceCode=" + provinceCode + ", address=" + address
				+ ", custTyep=" + custTyep + ", inputer=" + inputer + ", userName=" + userName + ", entryDate="
				+ entryDate + ", inputDate=" + inputDate + ", modifiedDate=" + modifiedDate + ", cmdType=" + cmdType
				+ ", currentPage=" + currentPage + ", numPerPage=" + numPerPage + ", totalPage=" + totalPage + "]";
	}
	
}