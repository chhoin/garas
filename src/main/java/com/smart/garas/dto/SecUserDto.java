package com.smart.garas.dto;

import java.util.Date;

// import java.util.Date;

public class SecUserDto {	
	     
	private String sec_usr_id;  
	private Date dt_cre;
	private Date dt_upd;  
	private String  sta_rec_code;   
	private String  usr_cre;  
	private String usr_upd;   
	private String  sec_usr_email;  
	private String  sec_usr_name;   
	private String  sec_usr_login;   
	private String  sec_usr_password;   
	private String sec_usr_salt;
	private String sec_usr_desc;

	public String getSec_usr_id() {
		return sec_usr_id;
	}
	public void setSec_usr_id(String sec_usr_id) {
		this.sec_usr_id = sec_usr_id;
	}
	public Date getDt_cre() {
		return dt_cre;
	}
	public void setDt_cre(Date dt_cre) {
		this.dt_cre = dt_cre;
	}
	public Date getDt_upd() {
		return dt_upd;
	}
	public void setDt_upd(Date dt_upd) {
		this.dt_upd = dt_upd;
	}
	public String getSta_rec_code() {
		return sta_rec_code;
	}
	public void setSta_rec_code(String sta_rec_code) {
		this.sta_rec_code = sta_rec_code;
	}
	public String getUsr_cre() {
		return usr_cre;
	}
	public void setUsr_cre(String usr_cre) {
		this.usr_cre = usr_cre;
	}
	public String getUsr_upd() {
		return usr_upd;
	}
	public void setUsr_upd(String usr_upd) {
		this.usr_upd = usr_upd;
	}
	public String getSec_usr_email() {
		return sec_usr_email;
	}
	public void setSec_usr_email(String sec_usr_email) {
		this.sec_usr_email = sec_usr_email;
	}
	public String getSec_usr_name() {
		return sec_usr_name;
	}
	public void setSec_usr_name(String sec_usr_name) {
		this.sec_usr_name = sec_usr_name;
	}
	public String getSec_usr_login() {
		return sec_usr_login;
	}
	public void setSec_usr_login(String sec_usr_login) {
		this.sec_usr_login = sec_usr_login;
	}
	public String getSec_usr_password() {
		return sec_usr_password;
	}
	public void setSec_usr_password(String sec_usr_password) {
		this.sec_usr_password = sec_usr_password;
	}
	public String getSec_usr_salt() {
		return sec_usr_salt;
	}
	public void setSec_usr_salt(String sec_usr_salt) {
		this.sec_usr_salt = sec_usr_salt;
	}
	public String getSec_usr_desc() {
		return sec_usr_desc;
	}
	public void setSec_usr_desc(String sec_usr_desc) {
		this.sec_usr_desc = sec_usr_desc;
	}
	
	
/*	@Override
	public String toString() {
		return "UserDto [userID=" + userID + ", sec_usr_id=" + sec_usr_id + ", dt_cre=" + dt_cre + ", dt_upd=" + dt_upd
				+ ", sta_rec_code=" + sta_rec_code + ", usr_cre=" + usr_cre + ", usr_upd=" + usr_upd
				+ ", sec_usr_email=" + sec_usr_email + ", sec_usr_name=" + sec_usr_name + ", sec_usr_login="
				+ sec_usr_login + ", sec_usr_password=" + sec_usr_password + ", sec_usr_salt=" + sec_usr_salt + "]";
	} */ 
	
	
}
	