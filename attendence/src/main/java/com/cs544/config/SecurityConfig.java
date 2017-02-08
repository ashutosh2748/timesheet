package com.cs544.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
//		.usersByUsernameQuery("select username, password, enabled from users where username=?")
//		.authoritiesByUsernameQuery("select username, role from authorities where username=?");
	}
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/resources/**", "/index").permitAll()	
			.antMatchers("/").permitAll()
			.antMatchers("/login").anonymous()
		.and()
			.formLogin()
	        .loginPage("/login").failureUrl("/login?error")
		.and()
			.exceptionHandling().accessDeniedPage("/403")
		.and()
			.csrf();
	}
}
