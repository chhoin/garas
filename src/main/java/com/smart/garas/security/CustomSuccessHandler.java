package com.smart.garas.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component("customSuccessHandler")
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	/**
	 * (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler#handle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	@Override
	protected void handle(	HttpServletRequest request, 
							HttpServletResponse response, 
							Authentication authentication)throws IOException, ServletException {

		String targetUrl = determineTargetUrl(authentication);

		if (response.isCommitted()) {
			System.out.println("Can't redirect");
			return;
		}

		redirectStrategy.sendRedirect(request, response, targetUrl);
	}

	/**
	 * This method extracts the roles of currently logged-in user and returns
	 * appropriate URL according to user role.
	 * @param authentication
	 * @return
	 */
	protected String determineTargetUrl(Authentication authentication) {

		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

		List<String> roles = new ArrayList<String>();

		for (GrantedAuthority authority : authorities) {
			
			System.out.println("authority----------------->"+authority.getAuthority());
			
			roles.add(authority.getAuthority());
		}
		
		if (roles.contains("ROLE_ADMIN")) {
			
			return "/user";
			
		} else if (roles.contains("ROLE_USER")) {
			
			return "/capture";
			
		} else {
			return "/accessDenied";
		}
	}

	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	

	
}
