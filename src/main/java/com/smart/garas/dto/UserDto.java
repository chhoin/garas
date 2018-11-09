package com.smart.garas.dto;

public class UserDto {
	private String autoNum;
	private String userCode;
	private String userName;
	private String passWord;
	private int enabled;
	private String name;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	public String getAutoNum() {
		return autoNum;
	}
	public void setAutoNum(String autoNum) {
		this.autoNum = autoNum;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDto [autoNum=" + autoNum + ", userCode=" + userCode + ", userName=" + userName + ", passWord="
				+ passWord + ", enabled=" + enabled + ", name=" + name + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phone=" + phone + ", address=" + address + "]";
	}
}
