package com.app.security.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.app.dao.UserDAO;

@Component
public class UserInfoUserDetailsService  implements UserDetailsService {
	
	@Autowired
	private UserDAO repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	 
	
	
}
