package com.abel.restful.example.configurations;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

import com.mongodb.MongoCredential;

@Configuration // inicializa todas as classes de configuration antes de iniciar o application (instancia principal)
public class MongoDataSource {
	
	  /*
	   * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient instance.
	   */
//	   public @Bean MongoClientFactoryBean mongoClient() { // declara um tipo de dado que sera compartilhada entre todas as classes na aplicacao
//		   final MongoCredential[] mongoCredential1 = { MongoCredential.createCredential("franciscofolli", "db", "Mudar@123".toCharArray()) };
//		   MongoClientFactoryBean mongo = new MongoClientFactoryBean();
//	       mongo.setHost("localhost");
//	       mongo.setPort(27017);
//	       mongo.setCredential(mongoCredential1);
//	       
//
//	       return mongo;
//	   }
	
	
	   
}
