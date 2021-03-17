package com.abel.restful.example.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abel.restful.example.entities.UserDTO;
import com.abel.restful.example.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	

	@GetMapping("/users")
	public List<UserDTO> getUsers() {
		return this.userService.getAllUsers();
	}
	
	@PostMapping("/user")
	public UserDTO setUser(@RequestBody UserDTO user) {
		
		return this.userService.createUser(user);
	}
	
}
