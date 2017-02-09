package com.cs544.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/resources/**", "/login").permitAll()	
			.antMatchers("/").permitAll()
			.antMatchers("/student", "/student/**").access("hasRole('ROLE_STUDENT')")//ROLE_ by default by framework
			.antMatchers("/faculty", "/faculty/**").access("hasRole('ROLE_FACULTY')")
			.antMatchers("/admin", "/admin/**").access("hasRole('ROLE_ADMIN')")
		.and()
			.formLogin()
	        .loginPage("/login").failureUrl("/login?error")
	        //.successForwardUrl("/dashboard")
	    .and()
			.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/login?logout")
		.and()
			.exceptionHandling().accessDeniedPage("/403")
		.and()
			.csrf();
	}
}
