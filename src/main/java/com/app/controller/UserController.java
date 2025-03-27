package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthRequestDTO;
import com.app.entiry.UserDetails;
import com.app.service.UserService;

@RestController
@RequestMapping("/app/v1/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody UserDetails details) {
		details=service.addUser(details);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
	
	@PostMapping("/authenticate")
	public ResponseEntity<String> authenticateAndGetToken(@RequestBody AuthRequestDTO authRequest){
		
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
}	
