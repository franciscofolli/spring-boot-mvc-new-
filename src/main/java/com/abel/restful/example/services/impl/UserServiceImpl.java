package com.abel.restful.example.services.impl;

import java.util.List;
import java.util.OptionalDouble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.abel.restful.example.entities.GenericErrorDTO;
import com.abel.restful.example.entities.GenericResponseDTO;
import com.abel.restful.example.entities.UserDTO;
import com.abel.restful.example.mappers.UserMapper;
import com.abel.restful.example.models.User;
import com.abel.restful.example.repository.UserRepository;
import com.abel.restful.example.services.UserService;
import java.util.Optional;

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

	@Override
	public GenericResponseDTO alterUser(String id, UserDTO userDTO) {
		GenericResponseDTO response = new GenericResponseDTO();

		try{
			final Optional<User> optionalUser = this.userRepository.findById(id);
			if(optionalUser.isPresent()){
				User user = optionalUser.get();
				user = this.userMapper.updateUserWithDTO(userDTO, user);
				this.userRepository.save(user);
				response.setData(this.userMapper.fromEntityToDTO(user));
			} else {
				final GenericErrorDTO error = new GenericErrorDTO();
				response.setStatusCode(404);
				error.setMessage("Usuário não encontrado!");
				response.setError(error);
			}
		} catch (Exception e) {
			final GenericErrorDTO error = new GenericErrorDTO();
			response.setStatusCode(500);
			response.setError(error);
		}
		
		return response;
	}

}
