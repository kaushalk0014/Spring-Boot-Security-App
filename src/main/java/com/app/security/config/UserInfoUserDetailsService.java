package com.app.security.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.app.dao.UserDAO;
import com.app.entiry.UserInfo;

@Component
public class UserInfoUserDetailsService  implements UserDetailsService {
	
	@Autowired
	private UserDAO repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 Optional<UserInfo> userInfo = repository.findByName(username);
	        return userInfo.map(UserInfoUserDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));

	}

	 
	
	
}
