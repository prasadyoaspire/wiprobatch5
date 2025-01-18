package com.abc.springsecurity_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.springsecurity_jwt.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {

}
