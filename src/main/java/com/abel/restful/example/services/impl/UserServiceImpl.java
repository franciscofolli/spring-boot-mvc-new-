package com.abel.restful.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abel.restful.example.entities.UserDTO;
import com.abel.restful.example.mappers.UserMapper;
import com.abel.restful.example.models.User;
import com.abel.restful.example.repository.UserRepository;
import com.abel.restful.example.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	private UserMapper userMapper = new UserMapper();
	
	@Override
	public List<UserDTO> getAllUsers(){
		final List<User> users = this.userRepository.findAll();
		return this.userMapper.fromEntityListToDTOList(users);
	}
	
	@Override
	public UserDTO createUser(UserDTO userDTO){
		final User user = this.userMapper.fromDTOToEntity(userDTO);
		this.userRepository.save(user);
		return userDTO;
	}
}
