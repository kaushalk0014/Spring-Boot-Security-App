package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entiry.UserDetails;

@RestController
@RequestMapping("/app/v1/user")
public class UserController {

	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody UserDetails details) {

		return new ResponseEntity<String>("", HttpStatus.OK);
	}

}
