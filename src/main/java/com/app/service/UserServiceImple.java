package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dao.UserDAO;
import com.app.entiry.UserInfo;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserInfo addUser(UserInfo details) {
		details.setPassword(passwordEncoder.encode(details.getPassword()));
		return userDAO.save(details);
	}
}
