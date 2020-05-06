package com.lynch.exoplanet.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.*;

@EnableWebSecurity
public class EAppSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth.inMemoryAuthentication()
			.withUser("user")
			.password("password")
			.roles("USER")
			.and()
			.withUser("admin")
			.password("adminpassword")
			.roles("ADMIN");
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests() // Most to Least Restrictive
			.antMatchers("/api/admin").hasRole("ADMIN")
			.antMatchers("/api/user").hasRole("USER")
			.antMatchers("/api/").hasAnyRole("USER", "ADMIN")
			.antMatchers("/api/home").permitAll()
			.and().formLogin();
	}
		
	}

