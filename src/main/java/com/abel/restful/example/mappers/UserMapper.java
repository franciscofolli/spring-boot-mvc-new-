package com.abel.restful.example.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.abel.restful.example.entities.UserDTO;
import com.abel.restful.example.models.User;

public class UserMapper {
	
	public UserDTO fromEntityToDTO(User user) {
		final UserDTO response = new UserDTO();
		
		if(user != null){
			response.setId(user.getId());
			response.setEmail(user.getEmail());
			response.setUsername(user.getName());
		}

		
		return response;
		
	}
	
	public List<UserDTO> fromEntityListToDTOList(List<User> users){
		return users.stream().map(value -> this.fromEntityToDTO(value)).collect(Collectors.toList());
	}
	
	public User fromDTOToEntity(UserDTO user) {
		final User response = new User();
	
		response.setName(user.getUsername());
		response.setEmail(user.getEmail());
		response.setPassword(user.getPwd());
		
		return response;
	}
	
	public User updateUserWithDTO(UserDTO userDTO, User user){
		// if (userDTO.getUsername() != null){
		// 	response.setName(user.getUsername());
		// }
		// if (user.getUsername() != null){
		// 	response.setName(user.getUsername());
		// }
		// if (user.getUsername() != null){
		// 	response.setName(user.getUsername());
		// }
		return null;
	}
	
}
