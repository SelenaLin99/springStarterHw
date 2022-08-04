package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {

	//autowired by name
	@Autowired
	UserService userServiceImpl2;
	
	// autowired by qualifier
	@Autowired
	@Qualifier("userServiceImpl2")
	UserService userService;
	
	// autowired by name
	@Autowired
	UserService userServiceImpl;
	
	@GetMapping("/hello")
	public String getUsers() {
		userService.getUsers();
		return "hello";
	}
	
}
