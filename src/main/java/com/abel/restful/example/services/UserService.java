package com.abel.restful.example.services;

import java.util.List;

import com.abel.restful.example.entities.UserDTO;


public interface UserService { // service e parecido com o bean. Mas no service nao eh necessario criar metodos declarando como pegar ou criar instancia do bean
	
	default List<UserDTO> getAllUsers(){
		throw new UnsupportedOperationException();
	}
	
	default UserDTO createUser(UserDTO user) {
		throw new UnsupportedOperationException();
	}

}
