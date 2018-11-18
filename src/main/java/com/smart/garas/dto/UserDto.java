package com.smart.garas.dto;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDto implements UserDetails{
	
	private static final long serialVersionUID = -4916946230339756522L;

	private String autoNum;
	
	private String userCode;
	private String username;
	private String password;
	private	String phone;
	private String address;
	private List<SubMenuDto> menus;
	
	
	private List<RoleDto> roles;
	private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true;
    
    
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
	@Override
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	
	

	public List<RoleDto> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}
	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}
	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles;
	}
	public List<SubMenuDto> getMenus() {
		return menus;
	}
	public void setMenus(List<SubMenuDto> menus) {
		this.menus = menus;
	}
	
}
