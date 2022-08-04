package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	// Q1 field injection
	@Autowired
	OrderService orderService;
	
	UserRepository userRepository;
	
	// Q1 Constructor dependency injection
	@Autowired
	UserService(UserRepository userRepository){
		System.out.println("User re[p object is injecting....");
		this.userRepository = userRepository;
	}
	
	public void getUsers() {
		System.out.println("getUsers() from UserService");
		orderService.getUsers();
		userRepository.getUsers();
		
	}

}
