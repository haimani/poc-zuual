/*package com.poc.serviceM.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //@Override
    /*protected void configure(HttpSecurity http) throws Exception {
    	PasswordEncoder encoder = 
          PasswordEncoderFactories.createDelegatingPasswordEncoder();
    	http
          .inMemoryAuthentication()
          .withUser("user")
          .password(encoder.encode("password"))
          .roles("USER")
          .and()
          .withUser("admin")
          .password(encoder.encode("admin"))
          .roles("USER", "ADMIN");
    }*/
    
	/*@Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.authorizeRequests().antMatchers("/", "/home").permitAll()
		.anyRequest().authenticated().and()
		.formLogin().loginPage("/login")
		.permitAll().and()
		.logout().permitAll();
	}
	
	@Bean
    @Override
    public UserDetailsService userDetailsService() {
		
			@SuppressWarnings("deprecation")
			UserDetails userDetails = User.withDefaultPasswordEncoder()
					.username("user")
					.password("password")
					.roles("USER")
					.build();
			return new InMemoryUserDetailsManager(userDetails);
		
	}
}
	*/