package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public void getUsers() {
		System.out.println("Hello from repository");
	}
}
