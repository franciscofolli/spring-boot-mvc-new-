package com.abel.restful.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abel.restful.example.models.User;

public interface UserRepository extends MongoRepository<User, String> { // No segundo parametro deve ser informado o tipo de chave ID (String, int, etc) que mapeia o id

	  public List<User> findByName(String name);
	  
}