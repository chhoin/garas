package com.smart.garas.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.smart.garas.dto.LogInDto;

public class UserContext implements UserDetails {
	/** */
	private static final long serialVersionUID = -3222633260888132290L;
	private LogInDto logInDto;
	
	public UserContext(LogInDto logInDto) {
		this.logInDto = logInDto;
	}
	
	public LogInDto getLoginDto() {
		return logInDto;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new GrantedAuthorityImpl("ROLE_USER"));
		return authorities;
	}

	@Override
	public String getPassword() {
		return logInDto.getPassWord();
	}

	@Override
	public String getUsername() {
		return logInDto.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return logInDto.getEnabled() != 0;
	}

}
