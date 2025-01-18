package com.abc.springsecurity_jwt.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.abc.springsecurity_jwt.entity.RoleEntity;
import com.abc.springsecurity_jwt.entity.UserEntity;
import com.abc.springsecurity_jwt.repository.RoleRepository;
import com.abc.springsecurity_jwt.repository.UserRepository;
import com.abc.springsecurity_jwt.util.JWTTokenUtil;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JWTTokenUtil jwtTokenUtil;
		
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String login(String userNameOrEmail, String password) {
		
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                userNameOrEmail,
                password
        ));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenUtil.generateToken(authentication);

        return token;
	}

	@Override
	public UserEntity register(UserEntity userEntity) {
		
		userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
		
		Set<RoleEntity> userRoles = new HashSet<>();
		
		Set<RoleEntity> roles = userEntity.getRoles();
		
		roles.forEach(r -> {
			Optional<RoleEntity> optionalRoleEntity = roleRepository.findById(r.getId());			
			if(optionalRoleEntity.isEmpty()) {
				
			}
			RoleEntity roleEntity = optionalRoleEntity.get();			
			userRoles.add(roleEntity);
			
		});
		
		userEntity.setRoles(userRoles);	
		
		userRepository.save(userEntity);
		
		return userEntity;		
	}
}
