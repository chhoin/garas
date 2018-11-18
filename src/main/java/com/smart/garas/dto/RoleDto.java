package com.smart.garas.dto;

import org.springframework.security.core.GrantedAuthority;

public class RoleDto implements GrantedAuthority{

	private static final long serialVersionUID = -9037204373405570349L;
	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthority() {
		return name;
	}
}
