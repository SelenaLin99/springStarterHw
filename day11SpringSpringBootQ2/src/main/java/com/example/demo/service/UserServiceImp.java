package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service("userServiceImpl2")
public class UserServiceImp implements UserService{
	
	// autowired by type
	@Autowired
	UserRepository userRepo;
	
	@Override
	public void getUsers() {
		System.out.println("From service impl");
	}
	

}
