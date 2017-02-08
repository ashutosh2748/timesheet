package com.cs544.util;

import java.util.Iterator;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

//A top-level Java class mimicking static class behavior
public class Helper {
	private static Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	/*
	 * Get the username of the logged in user: getPrincipal()
	 * Get the password of the authenticated user: getCredentials()
	 * Get the assigned roles of the authenticated user: getAuthorities()
	 * Get further details of the authenticated user: getDetails()
	 * */
	
	//just check if the user is logged in or not
	public static boolean isLoggedIn(){
		if(auth != null) return true;
		return false;
	}
	
	//check for the user role
	public static boolean hasRole(String role){
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			Iterator<? extends GrantedAuthority> it = userDetail.getAuthorities().iterator();
			while(it.hasNext()){
				if(it.next().getAuthority().equals(role)) return true;
			}
		}
		
		return false;
	}
}
