package com.abel.restful.example.controllers;


import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abel.restful.example.entities.GenericResponseDTO;
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

	@PutMapping("/user/{id}")
	public ResponseEntity<GenericResponseDTO> alterUser(@PathVariable("id") String id, @RequestBody UserDTO user){
		// return ResponseEntity.ok(this.userService.alterUser(id, user));
		final GenericResponseDTO response = this.userService.alterUser(id, user);
		return new ResponseEntity<GenericResponseDTO>(response, HttpStatus.valueOf(response.getStatusCode()));
	}
	
}
