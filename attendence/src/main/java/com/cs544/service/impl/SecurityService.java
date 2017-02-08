package com.cs544.service.impl;

import java.util.Iterator;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {
	// check for the user role
	public String hasRole() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			Iterator<? extends GrantedAuthority> it = userDetail.getAuthorities().iterator();
			while (it.hasNext()) {
				return it.next().getAuthority();
			}
		}

		return "Anonymous";
	}
}
