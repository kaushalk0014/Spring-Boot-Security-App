package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthRequestDTO;
import com.app.entiry.UserInfo;
import com.app.service.JWTService;
import com.app.service.UserService;

@RestController
@RequestMapping("/app/v1/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private JWTService jwtService;
	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody UserInfo details) {
		details=service.addUser(details);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
	
	@PostMapping("/authenticate")
	public ResponseEntity<String> authenticateAndGetToken(@RequestBody AuthRequestDTO authRequest){
		
		String token=null;
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
        	token=jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }
		return new ResponseEntity<String>(token, HttpStatus.OK);
	}
}	
