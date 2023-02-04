package com.apirest.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apirest.entidades.User;
import com.apirest.apirest.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class Controller {

	@Autowired
	private UserRepository ur;

	@GetMapping
	public List<User> findAll() {
		List<User> resultado = ur.findAll();
		return resultado;
	}

	//@GetMapping(value = "/{id}")
	//public User findById(@PathVariable Long id) {
	//	User resultado = ur.findById(id).get();//
	//	return resultado;
	//
	//}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User resultado = ur.save(user);
		return resultado;
	}
}
