package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDAO;
import com.app.entiry.UserInfo;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserInfo addUser(UserInfo details) {
		return userDAO.save(details);
	}
}
