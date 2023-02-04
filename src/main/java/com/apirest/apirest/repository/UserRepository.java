package com.apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.apirest.entidades.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
