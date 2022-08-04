package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("userServiceImp2")
public class UserServiceImp2 implements UserService {
	
	@Override
	public void getUsers() {
		System.out.println("From userServiceImp2");
	}

}
