package com.wipro.abcmart.service;

import com.wipro.abcmart.entity.User;

public interface AuthService {

	User login(String username, String password);
}
