package com.abc.springsecurity_jwt.service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.abc.springsecurity_jwt.entity.RoleEntity;
import com.abc.springsecurity_jwt.entity.UserEntity;
import com.abc.springsecurity_jwt.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		
		Optional<UserEntity> optionalUserEntity = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail);
		
		if(optionalUserEntity.isEmpty()) {
			throw new UsernameNotFoundException("User not found");
		}
		
		UserEntity userEntity = optionalUserEntity.get();		
		Set<RoleEntity> roles = userEntity.getRoles();
		
		Set<GrantedAuthority> authorities= roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());
		
		User user = new User(usernameOrEmail,userEntity.getPassword(),authorities);
		
		return user;
	}

}
