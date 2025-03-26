package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDAO;
import com.app.entiry.UserDetails;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserDetails addUser(UserDetails details) {
		return userDAO.save(details);
	}
}
