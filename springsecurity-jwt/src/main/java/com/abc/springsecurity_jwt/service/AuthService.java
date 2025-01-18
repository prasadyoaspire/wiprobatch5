package com.abc.springsecurity_jwt.service;

import com.abc.springsecurity_jwt.entity.UserEntity;

public interface AuthService {
	
	String login(String userNameOrEmail,String password);

	UserEntity register(UserEntity userEntity);
}
