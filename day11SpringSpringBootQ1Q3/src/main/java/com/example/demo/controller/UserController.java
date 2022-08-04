package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	UserService userService;
	
	// setter injection
	@Autowired
	public void setService(UserService userService){
		System.out.println("service object is injecting.....");
		this.userService = userService;
	}
	// Q3
	@GetMapping("/users") 
	public String getUsers() {
		System.out.println("From user controller");
		userService.getUsers();
		return "it works";
	}

}
