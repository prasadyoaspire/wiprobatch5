package com.wipro.abcmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.abcmart.entity.User;
import com.wipro.abcmart.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService{
	
	@Autowired
	private UserRepository userRepositry;

	@Override
	public User login(String username, String password) {
		
		// write your code
		
		return null;		
	}

}
