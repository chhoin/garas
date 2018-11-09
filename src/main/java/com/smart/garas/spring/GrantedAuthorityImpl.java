package com.smart.garas.spring;

import org.springframework.security.core.GrantedAuthority;

public class GrantedAuthorityImpl implements GrantedAuthority {	
	/** */
	private static final long serialVersionUID = 4082670301862772424L;
	
	private String role;
	
	public GrantedAuthorityImpl(String role) {
		this.role = role;
	}

	@Override
	public String getAuthority() {
		return role;
	}

}
