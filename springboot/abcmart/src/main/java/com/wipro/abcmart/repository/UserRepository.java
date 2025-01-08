package com.wipro.abcmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wipro.abcmart.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("Select u from User u where u.username = :uname and u.password = :upwd")
	User login(@Param("uname") String username, @Param("upwd") String password);
}
